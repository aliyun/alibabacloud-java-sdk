// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetDocumentSummaryResponseBody extends TeaModel {
    /**
     * <p>Interface return code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data query result.</p>
     */
    @NameInMap("Data")
    public GetDocumentSummaryResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Prompt message for the returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7903F2DE-D9EE-5D16-8A08-E9223E54B281</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the call was successful. Values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDocumentSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentSummaryResponseBody self = new GetDocumentSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDocumentSummaryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDocumentSummaryResponseBody setData(GetDocumentSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDocumentSummaryResponseBodyData getData() {
        return this.data;
    }

    public GetDocumentSummaryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDocumentSummaryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDocumentSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDocumentSummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDocumentSummaryResponseBodyData extends TeaModel {
        /**
         * <p>Number of documents.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DocumentCount")
        public Long documentCount;

        /**
         * <p>Number of services or days.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Frequency")
        public Long frequency;

        public static GetDocumentSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentSummaryResponseBodyData self = new GetDocumentSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDocumentSummaryResponseBodyData setDocumentCount(Long documentCount) {
            this.documentCount = documentCount;
            return this;
        }
        public Long getDocumentCount() {
            return this.documentCount;
        }

        public GetDocumentSummaryResponseBodyData setFrequency(Long frequency) {
            this.frequency = frequency;
            return this;
        }
        public Long getFrequency() {
            return this.frequency;
        }

    }

}
