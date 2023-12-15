// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PaasResponsePluginFieldDataDTO extends TeaModel {
    @NameInMap("ContentResponse")
    public PaasResponseNodeContentDTO contentResponse;

    @NameInMap("Name")
    public String name;

    public static PaasResponsePluginFieldDataDTO build(java.util.Map<String, ?> map) throws Exception {
        PaasResponsePluginFieldDataDTO self = new PaasResponsePluginFieldDataDTO();
        return TeaModel.build(map, self);
    }

    public PaasResponsePluginFieldDataDTO setContentResponse(PaasResponseNodeContentDTO contentResponse) {
        this.contentResponse = contentResponse;
        return this;
    }
    public PaasResponseNodeContentDTO getContentResponse() {
        return this.contentResponse;
    }

    public PaasResponsePluginFieldDataDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
