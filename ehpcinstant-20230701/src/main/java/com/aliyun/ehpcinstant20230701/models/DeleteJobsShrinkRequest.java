// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class DeleteJobsShrinkRequest extends TeaModel {
    /**
     * <p>The list of executor IDs. A maximum of 100 IDs are supported.</p>
     */
    @NameInMap("ExecutorIds")
    public String executorIdsShrink;

    /**
     * <p>The type of the job scheduler.</p>
     * <ul>
     * <li>HPC</li>
     * <li>K8S</li>
     * </ul>
     * <p>Default value: HPC</p>
     * 
     * <strong>example:</strong>
     * <p>HPC</p>
     */
    @NameInMap("JobScheduler")
    public String jobScheduler;

    /**
     * <p>The information about the job to be deleted.</p>
     */
    @NameInMap("JobSpec")
    public String jobSpecShrink;

    public static DeleteJobsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobsShrinkRequest self = new DeleteJobsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteJobsShrinkRequest setExecutorIdsShrink(String executorIdsShrink) {
        this.executorIdsShrink = executorIdsShrink;
        return this;
    }
    public String getExecutorIdsShrink() {
        return this.executorIdsShrink;
    }

    public DeleteJobsShrinkRequest setJobScheduler(String jobScheduler) {
        this.jobScheduler = jobScheduler;
        return this;
    }
    public String getJobScheduler() {
        return this.jobScheduler;
    }

    public DeleteJobsShrinkRequest setJobSpecShrink(String jobSpecShrink) {
        this.jobSpecShrink = jobSpecShrink;
        return this;
    }
    public String getJobSpecShrink() {
        return this.jobSpecShrink;
    }

}
