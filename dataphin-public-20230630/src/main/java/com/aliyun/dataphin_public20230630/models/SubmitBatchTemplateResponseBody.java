// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitBatchTemplateResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The submission result.</p>
     */
    @NameInMap("Data")
    public SubmitBatchTemplateResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The backend exception details.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitBatchTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitBatchTemplateResponseBody self = new SubmitBatchTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitBatchTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitBatchTemplateResponseBody setData(SubmitBatchTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitBatchTemplateResponseBodyData getData() {
        return this.data;
    }

    public SubmitBatchTemplateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitBatchTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitBatchTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitBatchTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitBatchTemplateResponseBodyData extends TeaModel {
        /**
         * <p>The submission record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("SubmitId")
        public Long submitId;

        public static SubmitBatchTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitBatchTemplateResponseBodyData self = new SubmitBatchTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitBatchTemplateResponseBodyData setSubmitId(Long submitId) {
            this.submitId = submitId;
            return this;
        }
        public Long getSubmitId() {
            return this.submitId;
        }

    }

}
