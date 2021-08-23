// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PaasResponseDTO extends TeaModel {
    @NameInMap("PluginFieldDataResponse")
    public PaasResponsePluginFieldDataDTO pluginFieldDataResponse;

    public static PaasResponseDTO build(java.util.Map<String, ?> map) throws Exception {
        PaasResponseDTO self = new PaasResponseDTO();
        return TeaModel.build(map, self);
    }

    public PaasResponseDTO setPluginFieldDataResponse(PaasResponsePluginFieldDataDTO pluginFieldDataResponse) {
        this.pluginFieldDataResponse = pluginFieldDataResponse;
        return this;
    }
    public PaasResponsePluginFieldDataDTO getPluginFieldDataResponse() {
        return this.pluginFieldDataResponse;
    }

}
