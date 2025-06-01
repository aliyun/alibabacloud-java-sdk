// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class RiskSceneConfig extends TeaModel {
    @NameInMap("DetectChannel")
    public java.util.List<String> detectChannel;

    @NameInMap("OfficeChannel")
    public java.util.List<String> officeChannel;

    public static RiskSceneConfig build(java.util.Map<String, ?> map) throws Exception {
        RiskSceneConfig self = new RiskSceneConfig();
        return TeaModel.build(map, self);
    }

    public RiskSceneConfig setDetectChannel(java.util.List<String> detectChannel) {
        this.detectChannel = detectChannel;
        return this;
    }
    public java.util.List<String> getDetectChannel() {
        return this.detectChannel;
    }

    public RiskSceneConfig setOfficeChannel(java.util.List<String> officeChannel) {
        this.officeChannel = officeChannel;
        return this;
    }
    public java.util.List<String> getOfficeChannel() {
        return this.officeChannel;
    }

}
