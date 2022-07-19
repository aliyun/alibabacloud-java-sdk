// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class DeleteJobsRequest extends TeaModel {
    // 任务Id
    @NameInMap("JobIds")
    public java.util.List<Long> jobIds;

    public static DeleteJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobsRequest self = new DeleteJobsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteJobsRequest setJobIds(java.util.List<Long> jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public java.util.List<Long> getJobIds() {
        return this.jobIds;
    }

}
