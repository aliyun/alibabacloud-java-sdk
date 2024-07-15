// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class JobConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("maxRetryTime")
    public Integer maxRetryTime;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("triggerInterval")
    public Integer triggerInterval;

    public static JobConfig build(java.util.Map<String, ?> map) throws Exception {
        JobConfig self = new JobConfig();
        return TeaModel.build(map, self);
    }

    public JobConfig setMaxRetryTime(Integer maxRetryTime) {
        this.maxRetryTime = maxRetryTime;
        return this;
    }
    public Integer getMaxRetryTime() {
        return this.maxRetryTime;
    }

    public JobConfig setTriggerInterval(Integer triggerInterval) {
        this.triggerInterval = triggerInterval;
        return this;
    }
    public Integer getTriggerInterval() {
        return this.triggerInterval;
    }

}
