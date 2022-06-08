// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteSmartJobRequest extends TeaModel {
    // 任务id，多个任务id用英文逗号分割
    @NameInMap("JobId")
    public String jobId;

    public static DeleteSmartJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmartJobRequest self = new DeleteSmartJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSmartJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
