// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SinkDataWorksTriggerParameters extends TeaModel {
    @NameInMap("Enable")
    public String enable;

    public static SinkDataWorksTriggerParameters build(java.util.Map<String, ?> map) throws Exception {
        SinkDataWorksTriggerParameters self = new SinkDataWorksTriggerParameters();
        return TeaModel.build(map, self);
    }

    public SinkDataWorksTriggerParameters setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

}
