// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeServerlessJobsRequest extends TeaModel {
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
     * <p>The list of serverless job IDs or the subtask IDs (array jobs).</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If the serverless job is an array job, you can specify only the subtask ID. Specify the subtask ID in the format of \<array job ID>_&lt; subtask index&gt;. For example, 10_3 indicates the subtask whose index is 3 in the array job whose ID is 10.</p>
     * </li>
     * <li><p>You can specify only a single ID in one request.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobIds")
    public java.util.List<String> jobIds;

    public static DescribeServerlessJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerlessJobsRequest self = new DescribeServerlessJobsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServerlessJobsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeServerlessJobsRequest setJobIds(java.util.List<String> jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public java.util.List<String> getJobIds() {
        return this.jobIds;
    }

}
