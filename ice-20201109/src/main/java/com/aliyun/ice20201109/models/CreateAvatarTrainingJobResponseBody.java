// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateAvatarTrainingJobResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateAvatarTrainingJobResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateAvatarTrainingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAvatarTrainingJobResponseBody self = new CreateAvatarTrainingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAvatarTrainingJobResponseBody setData(CreateAvatarTrainingJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAvatarTrainingJobResponseBodyData getData() {
        return this.data;
    }

    public CreateAvatarTrainingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAvatarTrainingJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateAvatarTrainingJobResponseBodyData extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        public static CreateAvatarTrainingJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAvatarTrainingJobResponseBodyData self = new CreateAvatarTrainingJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAvatarTrainingJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
