// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class RetryLifecycleRetrieveJobRequest extends TeaModel {
    /**
     * <p>The data retrieval task ID.</p>
     * <p><strong>Scenarios</strong></p>
     * <p>Call this operation to retry a data retrieval task that has entered the <code>failed</code> state. Common causes for a task to enter the <code>failed</code> state include:</p>
     * <ul>
     * <li>A backend error occurred during data retrieval from the InfrequentAccess or Archive storage tier.</li>
     * <li>The data retrieval request timed out.</li>
     * <li>A temporary storage tier failure or network exception occurred.</li>
     * </ul>
     * <p><strong>Before you begin</strong></p>
     * <p>Before calling this operation, call <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-listlifecycleretrievejobs">ListLifecycleRetrieveJobs</a> to query the task list, confirm that the target task is in the <code>failed</code> state, and obtain the JobId of the task you want to retry.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lrj-nfstest-ia-160****853-hshvw</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static RetryLifecycleRetrieveJobRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryLifecycleRetrieveJobRequest self = new RetryLifecycleRetrieveJobRequest();
        return TeaModel.build(map, self);
    }

    public RetryLifecycleRetrieveJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
