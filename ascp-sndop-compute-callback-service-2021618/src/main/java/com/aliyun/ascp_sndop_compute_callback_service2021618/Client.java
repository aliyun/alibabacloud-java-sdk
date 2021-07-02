// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ascp_sndop_compute_callback_service2021618;

import com.aliyun.tea.*;
import com.aliyun.ascp_sndop_compute_callback_service2021618.models.*;
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
        this._endpoint = this.getEndpoint("ascp-sndop-compute-callback-service", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public RemoteComputeApiResponse remoteComputeApiWithOptions(RemoteComputeApiRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoteComputeApiShrinkRequest request = new RemoteComputeApiShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.autoAbility)) {
            request.autoAbilityShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.autoAbility, "AutoAbility", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoteComputeApi", "2021-6-18", "HTTPS", "POST", "AK", "json", req, runtime), new RemoteComputeApiResponse());
    }

    public RemoteComputeApiResponse remoteComputeApi(RemoteComputeApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.remoteComputeApiWithOptions(request, runtime);
    }

    public RemoteWneScreenCutServiceSendScreenCutToEmailResponse remoteWneScreenCutServiceSendScreenCutToEmailWithOptions(RemoteWneScreenCutServiceSendScreenCutToEmailRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoteWneScreenCutServiceSendScreenCutToEmailShrinkRequest request = new RemoteWneScreenCutServiceSendScreenCutToEmailShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.receiverMailList)) {
            request.receiverMailListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.receiverMailList, "ReceiverMailList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.picUrls)) {
            request.picUrlsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.picUrls, "PicUrls", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoteWneScreenCutServiceSendScreenCutToEmail", "2021-6-18", "HTTPS", "POST", "AK", "json", req, runtime), new RemoteWneScreenCutServiceSendScreenCutToEmailResponse());
    }

    public RemoteWneScreenCutServiceSendScreenCutToEmailResponse remoteWneScreenCutServiceSendScreenCutToEmail(RemoteWneScreenCutServiceSendScreenCutToEmailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.remoteWneScreenCutServiceSendScreenCutToEmailWithOptions(request, runtime);
    }

    public GetNameResponse getNameWithOptions(GetNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetName", "2021-6-18", "HTTPS", "GET", "AK", "json", req, runtime), new GetNameResponse());
    }

    public GetNameResponse getName(GetNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNameWithOptions(request, runtime);
    }

    public RemoteWneSceenCutServiceSendScreenCutToGroupResponse remoteWneSceenCutServiceSendScreenCutToGroupWithOptions(RemoteWneSceenCutServiceSendScreenCutToGroupRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoteWneSceenCutServiceSendScreenCutToGroupShrinkRequest request = new RemoteWneSceenCutServiceSendScreenCutToGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.picUrl)) {
            request.picUrlShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.picUrl, "PicUrl", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoteWneSceenCutServiceSendScreenCutToGroup", "2021-6-18", "HTTPS", "POST", "AK", "json", req, runtime), new RemoteWneSceenCutServiceSendScreenCutToGroupResponse());
    }

    public RemoteWneSceenCutServiceSendScreenCutToGroupResponse remoteWneSceenCutServiceSendScreenCutToGroup(RemoteWneSceenCutServiceSendScreenCutToGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.remoteWneSceenCutServiceSendScreenCutToGroupWithOptions(request, runtime);
    }

    public RemoteWneExcelServiceResponse remoteWneExcelServiceWithOptions(RemoteWneExcelServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoteWneExcelService", "2021-6-18", "HTTPS", "GET", "AK", "json", req, runtime), new RemoteWneExcelServiceResponse());
    }

    public RemoteWneExcelServiceResponse remoteWneExcelService(RemoteWneExcelServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.remoteWneExcelServiceWithOptions(request, runtime);
    }

    public RemoteWneExcelServiceSubmitResponse remoteWneExcelServiceSubmitWithOptions(RemoteWneExcelServiceSubmitRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoteWneExcelServiceSubmitShrinkRequest request = new RemoteWneExcelServiceSubmitShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.wneSubmitReqs)) {
            request.wneSubmitReqsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.wneSubmitReqs, "WneSubmitReqs", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoteWneExcelServiceSubmit", "2021-6-18", "HTTPS", "POST", "AK", "json", req, runtime), new RemoteWneExcelServiceSubmitResponse());
    }

    public RemoteWneExcelServiceSubmitResponse remoteWneExcelServiceSubmit(RemoteWneExcelServiceSubmitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.remoteWneExcelServiceSubmitWithOptions(request, runtime);
    }
}
