// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateAvatarTrainingJobResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public CreateAvatarTrainingJobResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The ID of the digital human training job.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>d718e2ff4f018ccf419a7b71</strong></strong></p>
         */
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
