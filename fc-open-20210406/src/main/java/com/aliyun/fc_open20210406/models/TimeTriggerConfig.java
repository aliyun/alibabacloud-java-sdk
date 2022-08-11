// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class TimeTriggerConfig extends TeaModel {
    @NameInMap("cronExpression")
    public String cronExpression;

    @NameInMap("enable")
    public Boolean enable;

    @NameInMap("payload")
    public String payload;

    public static TimeTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
        TimeTriggerConfig self = new TimeTriggerConfig();
        return TeaModel.build(map, self);
    }

    public TimeTriggerConfig setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public TimeTriggerConfig setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public TimeTriggerConfig setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

}
