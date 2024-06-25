// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeWorkflowsResponseBody extends TeaModel {
    /**
     * <p>The list of jobs.</p>
     */
    @NameInMap("jobs")
    public java.util.List<DescribeWorkflowsResponseBodyJobs> jobs;

    public static DescribeWorkflowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkflowsResponseBody self = new DescribeWorkflowsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWorkflowsResponseBody setJobs(java.util.List<DescribeWorkflowsResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<DescribeWorkflowsResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public static class DescribeWorkflowsResponseBodyJobs extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cb1a7214cfc0b41d9bb086affc2d8f51c</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>The time when the workflow was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-15T13:18:52Z</p>
         */
        @NameInMap("create_time")
        public String createTime;

        /**
         * <p>The name of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>wgs-gpu-qb4dk</p>
         */
        @NameInMap("job_name")
        public String jobName;

        public static DescribeWorkflowsResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkflowsResponseBodyJobs self = new DescribeWorkflowsResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public DescribeWorkflowsResponseBodyJobs setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeWorkflowsResponseBodyJobs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeWorkflowsResponseBodyJobs setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

    }

}
