// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class JobConfig extends TeaModel {
    // maxRetryTime
    @NameInMap("maxRetryTime")
    public Long maxRetryTime;

    // triggerInterval
    @NameInMap("triggerInterval")
    public Long triggerInterval;

    public static JobConfig build(java.util.Map<String, ?> map) throws Exception {
        JobConfig self = new JobConfig();
        return TeaModel.build(map, self);
    }

    public JobConfig setMaxRetryTime(Long maxRetryTime) {
        this.maxRetryTime = maxRetryTime;
        return this;
    }
    public Long getMaxRetryTime() {
        return this.maxRetryTime;
    }

    public JobConfig setTriggerInterval(Long triggerInterval) {
        this.triggerInterval = triggerInterval;
        return this;
    }
    public Long getTriggerInterval() {
        return this.triggerInterval;
    }

}
