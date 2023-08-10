// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426;

import com.aliyun.tea.*;
import com.aliyun.aliding20230426.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aliding", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    public CreateSheetResponse createSheetWithOptions(CreateSheetRequest tmpReq, CreateSheetHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSheetShrinkRequest request = new CreateSheetShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        CreateSheetShrinkHeaders headers = new CreateSheetShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workbookId)) {
            body.put("WorkbookId", request.workbookId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSheet"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/createSheet"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSheetResponse());
    }

    public CreateSheetResponse createSheet(CreateSheetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateSheetHeaders headers = new CreateSheetHeaders();
        return this.createSheetWithOptions(request, headers, runtime);
    }

    public InsertRowsBeforeResponse insertRowsBeforeWithOptions(InsertRowsBeforeRequest tmpReq, InsertRowsBeforeHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InsertRowsBeforeShrinkRequest request = new InsertRowsBeforeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        InsertRowsBeforeShrinkHeaders headers = new InsertRowsBeforeShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.row)) {
            body.put("Row", request.row);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rowCount)) {
            body.put("RowCount", request.rowCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sheetId)) {
            body.put("SheetId", request.sheetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workbookId)) {
            body.put("WorkbookId", request.workbookId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsertRowsBefore"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/insertRowsBefore"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsertRowsBeforeResponse());
    }

    public InsertRowsBeforeResponse insertRowsBefore(InsertRowsBeforeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InsertRowsBeforeHeaders headers = new InsertRowsBeforeHeaders();
        return this.insertRowsBeforeWithOptions(request, headers, runtime);
    }
}
