// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520;

import com.aliyun.tea.*;
import com.aliyun.linkcard20210520.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("linkcard", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public GetCardDetailResponse getCardDetailWithOptions(GetCardDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destroyCard)) {
            query.put("DestroyCard", request.destroyCard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iccid)) {
            query.put("Iccid", request.iccid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showPsim)) {
            query.put("ShowPsim", request.showPsim);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCardDetail"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCardDetailResponse());
    }

    public GetCardDetailResponse getCardDetail(GetCardDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCardDetailWithOptions(request, runtime);
    }

    public GetCardFlowInfoResponse getCardFlowInfoWithOptions(GetCardFlowInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dateList)) {
            query.put("DateList", request.dateList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iccid)) {
            query.put("Iccid", request.iccid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCardFlowInfo"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCardFlowInfoResponse());
    }

    public GetCardFlowInfoResponse getCardFlowInfo(GetCardFlowInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCardFlowInfoWithOptions(request, runtime);
    }

    public GetCredentialPoolStatisticsResponse getCredentialPoolStatisticsWithOptions(GetCredentialPoolStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialNO)) {
            query.put("CredentialNO", request.credentialNO);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.date)) {
            query.put("Date", request.date);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCredentialPoolStatistics"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCredentialPoolStatisticsResponse());
    }

    public GetCredentialPoolStatisticsResponse getCredentialPoolStatistics(GetCredentialPoolStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCredentialPoolStatisticsWithOptions(request, runtime);
    }

    public RebindResumeSingleCardResponse rebindResumeSingleCardWithOptions(RebindResumeSingleCardRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RebindResumeSingleCardShrinkRequest request = new RebindResumeSingleCardShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.optMsisdns)) {
            request.optMsisdnsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.optMsisdns, "OptMsisdns", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iccid)) {
            query.put("Iccid", request.iccid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optMsisdnsShrink)) {
            query.put("OptMsisdns", request.optMsisdnsShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebindResumeSingleCard"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebindResumeSingleCardResponse());
    }

    public RebindResumeSingleCardResponse rebindResumeSingleCard(RebindResumeSingleCardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rebindResumeSingleCardWithOptions(request, runtime);
    }

    public ResumeSingleCardResponse resumeSingleCardWithOptions(ResumeSingleCardRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ResumeSingleCardShrinkRequest request = new ResumeSingleCardShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.optMsisdns)) {
            request.optMsisdnsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.optMsisdns, "OptMsisdns", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iccid)) {
            query.put("Iccid", request.iccid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optMsisdnsShrink)) {
            query.put("OptMsisdns", request.optMsisdnsShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeSingleCard"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeSingleCardResponse());
    }

    public ResumeSingleCardResponse resumeSingleCard(ResumeSingleCardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resumeSingleCardWithOptions(request, runtime);
    }

    public StopSingleCardResponse stopSingleCardWithOptions(StopSingleCardRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StopSingleCardShrinkRequest request = new StopSingleCardShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.optMsisdns)) {
            request.optMsisdnsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.optMsisdns, "OptMsisdns", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iccid)) {
            query.put("Iccid", request.iccid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optMsisdnsShrink)) {
            query.put("OptMsisdns", request.optMsisdnsShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopSingleCard"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopSingleCardResponse());
    }

    public StopSingleCardResponse stopSingleCard(StopSingleCardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopSingleCardWithOptions(request, runtime);
    }
}
