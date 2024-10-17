// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitVideoTranslationJobResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public SubmitVideoTranslationJobResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The ID of the video translation job.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>d718e2ff4f018ccf419a7b71</strong></strong></p>
         */
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
