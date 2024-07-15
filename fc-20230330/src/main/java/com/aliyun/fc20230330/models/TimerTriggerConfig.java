// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class TimerTriggerConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0 0 4 * * *</p>
     */
    @NameInMap("cronExpression")
    public String cronExpression;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <strong>example:</strong>
     * <p>{&quot;workflowInstanceId&quot;:&quot;39639&quot;}</p>
     */
    @NameInMap("payload")
    public String payload;

    public static TimerTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
        TimerTriggerConfig self = new TimerTriggerConfig();
        return TeaModel.build(map, self);
    }

    public TimerTriggerConfig setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public TimerTriggerConfig setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public TimerTriggerConfig setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

}
