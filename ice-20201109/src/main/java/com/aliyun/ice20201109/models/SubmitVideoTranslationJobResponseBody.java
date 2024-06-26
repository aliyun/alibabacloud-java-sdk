// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitVideoTranslationJobResponseBody extends TeaModel {
    @NameInMap("Data")
    public SubmitVideoTranslationJobResponseBodyData data;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SubmitVideoTranslationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoTranslationJobResponseBody self = new SubmitVideoTranslationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitVideoTranslationJobResponseBody setData(SubmitVideoTranslationJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitVideoTranslationJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitVideoTranslationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitVideoTranslationJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitVideoTranslationJobResponseBodyData extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        public static SubmitVideoTranslationJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoTranslationJobResponseBodyData self = new SubmitVideoTranslationJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitVideoTranslationJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
