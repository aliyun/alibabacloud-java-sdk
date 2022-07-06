// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609;

import com.aliyun.tea.*;
import com.aliyun.aiearth_engine20220609.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aiearth-engine", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public DownloadDataResponse downloadDataWithOptions(DownloadDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandNo)) {
            body.put("BandNo", request.bandNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            body.put("DataId", request.dataId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadData"),
            new TeaPair("version", "2022-06-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadDataResponse());
    }

    public DownloadDataResponse downloadData(DownloadDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.downloadDataWithOptions(request, runtime);
    }

    public ListDatasResponse listDatasWithOptions(ListDatasRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDatasShrinkRequest request = new ListDatasShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceTypeList)) {
            request.sourceTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceTypeList, "SourceTypeList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudageMax)) {
            body.put("CloudageMax", request.cloudageMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudageMin)) {
            body.put("CloudageMin", request.cloudageMin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateEnd)) {
            body.put("DateEnd", request.dateEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateStart)) {
            body.put("DateStart", request.dateStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionWkt)) {
            body.put("RegionWkt", request.regionWkt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTypeListShrink)) {
            body.put("SourceTypeList", request.sourceTypeListShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDatas"),
            new TeaPair("version", "2022-06-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatasResponse());
    }

    public ListDatasResponse listDatas(ListDatasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDatasWithOptions(request, runtime);
    }
}
