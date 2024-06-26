// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateAvatarTrainingJobResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpdateAvatarTrainingJobResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateAvatarTrainingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAvatarTrainingJobResponseBody self = new UpdateAvatarTrainingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAvatarTrainingJobResponseBody setData(UpdateAvatarTrainingJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateAvatarTrainingJobResponseBodyData getData() {
        return this.data;
    }

    public UpdateAvatarTrainingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAvatarTrainingJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateAvatarTrainingJobResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><strong><strong>d718e2ff4f018ccf419a7b71</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        public static UpdateAvatarTrainingJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateAvatarTrainingJobResponseBodyData self = new UpdateAvatarTrainingJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateAvatarTrainingJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
