// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PaasNodeDTO extends TeaModel {
    // Code
    @NameInMap("Code")
    public String code;

    // Id
    @NameInMap("Id")
    public String id;

    // Label
    @NameInMap("Label")
    public String label;

    // Xx
    @NameInMap("Xx")
    public Double xx;

    // Yy
    @NameInMap("Yy")
    public Double yy;

    // PluginData
    @NameInMap("PluginData")
    public PaasPluginDataDTO pluginData;

    public static PaasNodeDTO build(java.util.Map<String, ?> map) throws Exception {
        PaasNodeDTO self = new PaasNodeDTO();
        return TeaModel.build(map, self);
    }

    public PaasNodeDTO setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PaasNodeDTO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public PaasNodeDTO setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public PaasNodeDTO setXx(Double xx) {
        this.xx = xx;
        return this;
    }
    public Double getXx() {
        return this.xx;
    }

    public PaasNodeDTO setYy(Double yy) {
        this.yy = yy;
        return this;
    }
    public Double getYy() {
        return this.yy;
    }

    public PaasNodeDTO setPluginData(PaasPluginDataDTO pluginData) {
        this.pluginData = pluginData;
        return this;
    }
    public PaasPluginDataDTO getPluginData() {
        return this.pluginData;
    }

}
