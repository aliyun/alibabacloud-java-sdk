// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class JobConfig extends TeaModel {
    /**
     * <p>The maximum number of retries. Valid values: 0 to 100. This parameter specifies the maximum number of retries allowed when Simple Log Service triggers a function based on the trigger interval if an error occurs, such as insufficient permissions, network failures, and function execution exceptions. If the trigger fails after the maximum number of retries is reached, Simple Log Service triggers the function again when the next trigger interval arrives.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("maxRetryTime")
    public Integer maxRetryTime;

    /**
     * <p>The time interval at which Simple Log Service triggers function execution. For example, you can retrieve data from the Logstore within the last 120 seconds to Function Compute every 120 seconds to perform custom computing.</p>
     * 
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
