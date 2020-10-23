// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_smart_call20201021;

import com.aliyun.tea.*;
import com.aliyun.gts_smart_call20201021.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("gts-smart-call", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public InteractVoiceCallBackResponse interactVoiceCallBackWithOptions(InteractVoiceCallBackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("InteractVoiceCallBack", "HTTPS", "POST", "2020-10-21", "AK", null, TeaModel.buildMap(request), runtime), new InteractVoiceCallBackResponse());
    }

    public InteractVoiceCallBackResponse interactVoiceCallBack(InteractVoiceCallBackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.interactVoiceCallBackWithOptions(request, runtime);
    }

    public InteractVoiceResponse interactVoiceWithOptions(InteractVoiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("InteractVoice", "HTTPS", "POST", "2020-10-21", "AK", null, TeaModel.buildMap(request), runtime), new InteractVoiceResponse());
    }

    public InteractVoiceResponse interactVoice(InteractVoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.interactVoiceWithOptions(request, runtime);
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
}
