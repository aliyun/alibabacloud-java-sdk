// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111;

import com.aliyun.tea.*;
import com.aliyun.dyiotapi20171111.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dyiotapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public DoIotChgBindOrUnBindResponse doIotChgBindOrUnBindWithOptions(DoIotChgBindOrUnBindRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DoIotChgBindOrUnBind", "2017-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DoIotChgBindOrUnBindResponse());
    }

    public DoIotChgBindOrUnBindResponse doIotChgBindOrUnBind(DoIotChgBindOrUnBindRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.doIotChgBindOrUnBindWithOptions(request, runtime);
    }

    public DoIotIsImeiExistResponse doIotIsImeiExistWithOptions(DoIotIsImeiExistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DoIotIsImeiExist", "2017-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DoIotIsImeiExistResponse());
    }

    public DoIotIsImeiExistResponse doIotIsImeiExist(DoIotIsImeiExistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.doIotIsImeiExistWithOptions(request, runtime);
    }

    public DoIotPostImeiResponse doIotPostImeiWithOptions(DoIotPostImeiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DoIotPostImei", "2017-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DoIotPostImeiResponse());
    }

    public DoIotPostImeiResponse doIotPostImei(DoIotPostImeiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.doIotPostImeiWithOptions(request, runtime);
    }

    public DoIotRechargeResponse doIotRechargeWithOptions(DoIotRechargeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DoIotRecharge", "2017-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DoIotRechargeResponse());
    }

    public DoIotRechargeResponse doIotRecharge(DoIotRechargeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.doIotRechargeWithOptions(request, runtime);
    }

    public DoIotSetAbsoluteRemindConfigResponse doIotSetAbsoluteRemindConfigWithOptions(DoIotSetAbsoluteRemindConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DoIotSetAbsoluteRemindConfig", "2017-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DoIotSetAbsoluteRemindConfigResponse());
    }

    public DoIotSetAbsoluteRemindConfigResponse doIotSetAbsoluteRemindConfig(DoIotSetAbsoluteRemindConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.doIotSetAbsoluteRemindConfigWithOptions(request, runtime);
    }

    public DoIotSetRemindConfigResponse doIotSetRemindConfigWithOptions(DoIotSetRemindConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DoIotSetRemindConfig", "2017-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DoIotSetRemindConfigResponse());
    }

    public DoIotSetRemindConfigResponse doIotSetRemindConfig(DoIotSetRemindConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.doIotSetRemindConfigWithOptions(request, runtime);
    }

    public DoIotUnbindResumeResponse doIotUnbindResumeWithOptions(DoIotUnbindResumeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DoIotUnbindResume", "2017-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DoIotUnbindResumeResponse());
    }

    public DoIotUnbindResumeResponse doIotUnbindResume(DoIotUnbindResumeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.doIotUnbindResumeWithOptions(request, runtime);
    }

    public DoIotUserStopResumeResponse doIotUserStopResumeWithOptions(DoIotUserStopResumeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DoIotUserStopResume", "2017-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DoIotUserStopResumeResponse());
    }

    public DoIotUserStopResumeResponse doIotUserStopResume(DoIotUserStopResumeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.doIotUserStopResumeWithOptions(request, runtime);
    }

    public DoSendIotSmsResponse doSendIotSmsWithOptions(DoSendIotSmsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DoSendIotSms", "2017-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DoSendIotSmsResponse());
    }

    public DoSendIotSmsResponse doSendIotSms(DoSendIotSmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.doSendIotSmsWithOptions(request, runtime);
    }

    public QueryCardFlowInfoResponse queryCardFlowInfoWithOptions(QueryCardFlowInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryCardFlowInfo", "2017-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new QueryCardFlowInfoResponse());
    }

    public QueryCardFlowInfoResponse queryCardFlowInfo(QueryCardFlowInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCardFlowInfoWithOptions(request, runtime);
    }

    public QueryCardHistoryFlowInfoResponse queryCardHistoryFlowInfoWithOptions(QueryCardHistoryFlowInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryCardHistoryFlowInfo", "2017-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new QueryCardHistoryFlowInfoResponse());
    }

    public QueryCardHistoryFlowInfoResponse queryCardHistoryFlowInfo(QueryCardHistoryFlowInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCardHistoryFlowInfoWithOptions(request, runtime);
    }

    public QueryCardInfoResponse queryCardInfoWithOptions(QueryCardInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryCardInfo", "2017-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new QueryCardInfoResponse());
    }

    public QueryCardInfoResponse queryCardInfo(QueryCardInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCardInfoWithOptions(request, runtime);
    }

    public QueryCardsInfoResponse queryCardsInfoWithOptions(QueryCardsInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryCardsInfo", "2017-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new QueryCardsInfoResponse());
    }

    public QueryCardsInfoResponse queryCardsInfo(QueryCardsInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCardsInfoWithOptions(request, runtime);
    }

    public QueryCardStatusResponse queryCardStatusWithOptions(QueryCardStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryCardStatus", "2017-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new QueryCardStatusResponse());
    }

    public QueryCardStatusResponse queryCardStatus(QueryCardStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCardStatusWithOptions(request, runtime);
    }

    public QueryIotCardOfferDtlResponse queryIotCardOfferDtlWithOptions(QueryIotCardOfferDtlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryIotCardOfferDtl", "2017-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new QueryIotCardOfferDtlResponse());
    }

    public QueryIotCardOfferDtlResponse queryIotCardOfferDtl(QueryIotCardOfferDtlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryIotCardOfferDtlWithOptions(request, runtime);
    }

    public QueryPersonalInfoResponse queryPersonalInfoWithOptions(QueryPersonalInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryPersonalInfo", "2017-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new QueryPersonalInfoResponse());
    }

    public QueryPersonalInfoResponse queryPersonalInfo(QueryPersonalInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPersonalInfoWithOptions(request, runtime);
    }
}
