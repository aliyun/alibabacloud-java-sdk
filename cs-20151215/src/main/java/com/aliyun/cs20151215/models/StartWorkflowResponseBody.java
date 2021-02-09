// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class StartWorkflowResponseBody extends TeaModel {
    // 工作流名称
    @NameInMap("JobName")
    public String jobName;

    public static StartWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartWorkflowResponseBody self = new StartWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public StartWorkflowResponseBody setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

}
