// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteAvatarTrainingJobResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteAvatarTrainingJobResponseBodyData data;

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

    public static DeleteAvatarTrainingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAvatarTrainingJobResponseBody self = new DeleteAvatarTrainingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAvatarTrainingJobResponseBody setData(DeleteAvatarTrainingJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteAvatarTrainingJobResponseBodyData getData() {
        return this.data;
    }

    public DeleteAvatarTrainingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAvatarTrainingJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteAvatarTrainingJobResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><strong><strong>d718e2ff4f018ccf419a7b71</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        public static DeleteAvatarTrainingJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteAvatarTrainingJobResponseBodyData self = new DeleteAvatarTrainingJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteAvatarTrainingJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
