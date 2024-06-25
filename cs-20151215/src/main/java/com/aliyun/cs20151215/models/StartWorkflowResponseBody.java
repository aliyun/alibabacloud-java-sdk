// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class StartWorkflowResponseBody extends TeaModel {
    /**
     * <p>The name of the workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>mapping-gpu-66xv7</p>
     */
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
