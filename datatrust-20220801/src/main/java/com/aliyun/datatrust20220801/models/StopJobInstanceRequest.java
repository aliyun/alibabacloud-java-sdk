// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class StopJobInstanceRequest extends TeaModel {
    @NameInMap("JobInstanceId")
    public Long jobInstanceId;

    public static StopJobInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopJobInstanceRequest self = new StopJobInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StopJobInstanceRequest setJobInstanceId(Long jobInstanceId) {
        this.jobInstanceId = jobInstanceId;
        return this;
    }
    public Long getJobInstanceId() {
        return this.jobInstanceId;
    }

}
