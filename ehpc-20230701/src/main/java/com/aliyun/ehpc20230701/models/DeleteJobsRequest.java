// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20230701.models;

import com.aliyun.tea.*;

public class DeleteJobsRequest extends TeaModel {
    @NameInMap("ExecutorIds")
    public java.util.List<String> executorIds;

    @NameInMap("JobSpec")
    public java.util.List<DeleteJobsRequestJobSpec> jobSpec;

    public static DeleteJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobsRequest self = new DeleteJobsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteJobsRequest setExecutorIds(java.util.List<String> executorIds) {
        this.executorIds = executorIds;
        return this;
    }
    public java.util.List<String> getExecutorIds() {
        return this.executorIds;
    }

    public DeleteJobsRequest setJobSpec(java.util.List<DeleteJobsRequestJobSpec> jobSpec) {
        this.jobSpec = jobSpec;
        return this;
    }
    public java.util.List<DeleteJobsRequestJobSpec> getJobSpec() {
        return this.jobSpec;
    }

    public static class DeleteJobsRequestJobSpecTaskSpec extends TeaModel {
        @NameInMap("ArrayIndex")
        public java.util.List<Integer> arrayIndex;

        @NameInMap("TaskName")
        public String taskName;

        public static DeleteJobsRequestJobSpecTaskSpec build(java.util.Map<String, ?> map) throws Exception {
            DeleteJobsRequestJobSpecTaskSpec self = new DeleteJobsRequestJobSpecTaskSpec();
            return TeaModel.build(map, self);
        }

        public DeleteJobsRequestJobSpecTaskSpec setArrayIndex(java.util.List<Integer> arrayIndex) {
            this.arrayIndex = arrayIndex;
            return this;
        }
        public java.util.List<Integer> getArrayIndex() {
            return this.arrayIndex;
        }

        public DeleteJobsRequestJobSpecTaskSpec setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class DeleteJobsRequestJobSpec extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("TaskSpec")
        public java.util.List<DeleteJobsRequestJobSpecTaskSpec> taskSpec;

        public static DeleteJobsRequestJobSpec build(java.util.Map<String, ?> map) throws Exception {
            DeleteJobsRequestJobSpec self = new DeleteJobsRequestJobSpec();
            return TeaModel.build(map, self);
        }

        public DeleteJobsRequestJobSpec setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DeleteJobsRequestJobSpec setTaskSpec(java.util.List<DeleteJobsRequestJobSpecTaskSpec> taskSpec) {
            this.taskSpec = taskSpec;
            return this;
        }
        public java.util.List<DeleteJobsRequestJobSpecTaskSpec> getTaskSpec() {
            return this.taskSpec;
        }

    }

}
