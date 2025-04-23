// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StopServerlessJobsRequest extends TeaModel {
    /**
     * <p>The ID of the E-HPC cluster.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The serverless job IDs or subtask IDs (array jobs).</p>
     * <ul>
     * <li>If you specify the job ID of an array job, all subtasks under the array job are stopped.</li>
     * <li>If you specify the ID of a subtask of an array job, only the subtask is stopped.</li>
     * </ul>
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobIds")
    public java.util.List<String> jobIds;

    public static StopServerlessJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        StopServerlessJobsRequest self = new StopServerlessJobsRequest();
        return TeaModel.build(map, self);
    }

    public StopServerlessJobsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public StopServerlessJobsRequest setJobIds(java.util.List<String> jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public java.util.List<String> getJobIds() {
        return this.jobIds;
    }

}
