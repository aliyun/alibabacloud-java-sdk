// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PaasFunctionDTO extends TeaModel {
    @NameInMap("PluginFieldDataFunction")
    public PaasFunctionPluginFieldDataDTO pluginFieldDataFunction;

    public static PaasFunctionDTO build(java.util.Map<String, ?> map) throws Exception {
        PaasFunctionDTO self = new PaasFunctionDTO();
        return TeaModel.build(map, self);
    }

    public PaasFunctionDTO setPluginFieldDataFunction(PaasFunctionPluginFieldDataDTO pluginFieldDataFunction) {
        this.pluginFieldDataFunction = pluginFieldDataFunction;
        return this;
    }
    public PaasFunctionPluginFieldDataDTO getPluginFieldDataFunction() {
        return this.pluginFieldDataFunction;
    }

}
