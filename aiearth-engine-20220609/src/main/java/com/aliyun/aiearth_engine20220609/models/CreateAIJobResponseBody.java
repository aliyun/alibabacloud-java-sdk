// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class CreateAIJobResponseBody extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("Jobs")
    public java.util.List<CreateAIJobResponseBodyJobs> jobs;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateAIJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAIJobResponseBody self = new CreateAIJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAIJobResponseBody setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public CreateAIJobResponseBody setJobs(java.util.List<CreateAIJobResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<CreateAIJobResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public CreateAIJobResponseBody setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateAIJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAIJobResponseBodyJobs extends TeaModel {
        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Success")
        public Boolean success;

        public static CreateAIJobResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            CreateAIJobResponseBodyJobs self = new CreateAIJobResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public CreateAIJobResponseBodyJobs setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public CreateAIJobResponseBodyJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAIJobResponseBodyJobs setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
