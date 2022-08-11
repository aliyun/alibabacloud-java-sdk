// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeWorkflowsResponseBody extends TeaModel {
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
        @NameInMap("cluster_id")
        public String clusterId;

        @NameInMap("create_time")
        public String createTime;

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
