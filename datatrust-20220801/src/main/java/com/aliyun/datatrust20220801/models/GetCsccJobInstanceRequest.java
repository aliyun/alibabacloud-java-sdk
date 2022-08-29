// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetCsccJobInstanceRequest extends TeaModel {
    @NameInMap("JobInstanceId")
    public Long jobInstanceId;

    public static GetCsccJobInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCsccJobInstanceRequest self = new GetCsccJobInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetCsccJobInstanceRequest setJobInstanceId(Long jobInstanceId) {
        this.jobInstanceId = jobInstanceId;
        return this;
    }
    public Long getJobInstanceId() {
        return this.jobInstanceId;
    }

}
