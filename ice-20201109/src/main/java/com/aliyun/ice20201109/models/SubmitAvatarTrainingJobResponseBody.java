// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitAvatarTrainingJobResponseBody extends TeaModel {
    @NameInMap("Data")
    public SubmitAvatarTrainingJobResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p><em><strong><strong>ACB-44F2-5F2D-88D7-1283E70</strong></strong></em></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitAvatarTrainingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAvatarTrainingJobResponseBody self = new SubmitAvatarTrainingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAvatarTrainingJobResponseBody setData(SubmitAvatarTrainingJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitAvatarTrainingJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitAvatarTrainingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitAvatarTrainingJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitAvatarTrainingJobResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><strong><strong>29faef8144638ba42eb8e037</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        public static SubmitAvatarTrainingJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitAvatarTrainingJobResponseBodyData self = new SubmitAvatarTrainingJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitAvatarTrainingJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
