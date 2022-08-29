// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class StartJobInstanceRequest extends TeaModel {
    @NameInMap("JobInstanceId")
    public Long jobInstanceId;

    public static StartJobInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartJobInstanceRequest self = new StartJobInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StartJobInstanceRequest setJobInstanceId(Long jobInstanceId) {
        this.jobInstanceId = jobInstanceId;
        return this;
    }
    public Long getJobInstanceId() {
        return this.jobInstanceId;
    }

}
