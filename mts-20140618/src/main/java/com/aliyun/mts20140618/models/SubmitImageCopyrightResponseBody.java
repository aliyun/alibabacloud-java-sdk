// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitImageCopyrightResponseBody extends TeaModel {
    @NameInMap("Data")
    public SubmitImageCopyrightResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D1D5C080-8E2F-5030-8AB4-13092F17631B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("StatusCode")
    public Long statusCode;

    public static SubmitImageCopyrightResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageCopyrightResponseBody self = new SubmitImageCopyrightResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitImageCopyrightResponseBody setData(SubmitImageCopyrightResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitImageCopyrightResponseBodyData getData() {
        return this.data;
    }

    public SubmitImageCopyrightResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitImageCopyrightResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitImageCopyrightResponseBody setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public static class SubmitImageCopyrightResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>bfb786c639894f4d80648792021e****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        public static SubmitImageCopyrightResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitImageCopyrightResponseBodyData self = new SubmitImageCopyrightResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitImageCopyrightResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
