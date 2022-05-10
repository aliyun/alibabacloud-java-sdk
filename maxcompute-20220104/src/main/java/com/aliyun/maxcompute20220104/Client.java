// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104;

import com.aliyun.tea.*;
import com.aliyun.maxcompute20220104.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "maxcompute.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "maxcompute.aliyuncs.com"),
            new TeaPair("ap-south-1", "maxcompute.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "maxcompute.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "maxcompute.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "maxcompute.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-beijing", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-chengdu", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-edge-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-fujian", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hongkong", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-qingdao", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shanghai", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-wuhan", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "maxcompute.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "maxcompute.aliyuncs.com"),
            new TeaPair("eu-central-1", "maxcompute.aliyuncs.com"),
            new TeaPair("eu-west-1", "maxcompute.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "maxcompute.aliyuncs.com"),
            new TeaPair("me-east-1", "maxcompute.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "maxcompute.aliyuncs.com"),
            new TeaPair("us-east-1", "maxcompute.aliyuncs.com"),
            new TeaPair("us-west-1", "maxcompute.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("maxcompute", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateQuotaResponse createQuota(CreateQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createQuotaWithOptions(request, headers, runtime);
    }

    public CreateQuotaResponse createQuotaWithOptions(CreateQuotaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nickname)) {
            body.put("Nickname", request.nickname);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.parameters))) {
            body.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQuota"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQuotaResponse());
    }

    public DeleteQuotaResponse deleteQuota(String nickname, DeleteQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteQuotaWithOptions(nickname, request, headers, runtime);
    }

    public DeleteQuotaResponse deleteQuotaWithOptions(String nickname, DeleteQuotaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        nickname = com.aliyun.openapiutil.Client.getEncodeParam(nickname);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQuota"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + nickname + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQuotaResponse());
    }

    public GetQuotaResponse getQuota(String nickname, GetQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getQuotaWithOptions(nickname, request, headers, runtime);
    }

    public GetQuotaResponse getQuotaWithOptions(String nickname, GetQuotaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        nickname = com.aliyun.openapiutil.Client.getEncodeParam(nickname);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mock)) {
            query.put("mock", request.mock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQuota"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + nickname + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQuotaResponse());
    }

    public ListQuotasResponse listQuotas(ListQuotasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQuotasWithOptions(request, headers, runtime);
    }

    public ListQuotasResponse listQuotasWithOptions(ListQuotasRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billingType)) {
            query.put("billingType", request.billingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxItem)) {
            query.put("maxItem", request.maxItem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQuotas"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQuotasResponse());
    }

    public UpdateQuotaResponse updateQuota(String nickname, UpdateQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateQuotaWithOptions(nickname, request, headers, runtime);
    }

    public UpdateQuotaResponse updateQuotaWithOptions(String nickname, UpdateQuotaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        nickname = com.aliyun.openapiutil.Client.getEncodeParam(nickname);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateQuota"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + nickname + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateQuotaResponse());
    }

    public UpdateSubQuotasResponse updateSubQuotas(String nickname, UpdateSubQuotasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSubQuotasWithOptions(nickname, request, headers, runtime);
    }

    public UpdateSubQuotasResponse updateSubQuotasWithOptions(String nickname, UpdateSubQuotasRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        nickname = com.aliyun.openapiutil.Client.getEncodeParam(nickname);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSubQuotas"),
            new TeaPair("version", "2022-01-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + nickname + "/subquotas"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSubQuotasResponse());
    }
}
