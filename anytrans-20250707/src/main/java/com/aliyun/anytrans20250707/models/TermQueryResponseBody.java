// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class TermQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;success&quot;</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public TermQueryResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;success&quot;</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>C3C70C8F-E026-17D8-854E-7F8EF2F5C909</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static TermQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TermQueryResponseBody self = new TermQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public TermQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TermQueryResponseBody setData(TermQueryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TermQueryResponseBodyData getData() {
        return this.data;
    }

    public TermQueryResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public TermQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TermQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TermQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TermQueryResponseBodyDataTerms extends TeaModel {
        @NameInMap("src")
        public String src;

        /**
         * <strong>example:</strong>
         * <p>92669963</p>
         */
        @NameInMap("termId")
        public String termId;

        /**
         * <strong>example:</strong>
         * <p>LLM</p>
         */
        @NameInMap("tgt")
        public String tgt;

        public static TermQueryResponseBodyDataTerms build(java.util.Map<String, ?> map) throws Exception {
            TermQueryResponseBodyDataTerms self = new TermQueryResponseBodyDataTerms();
            return TeaModel.build(map, self);
        }

        public TermQueryResponseBodyDataTerms setSrc(String src) {
            this.src = src;
            return this;
        }
        public String getSrc() {
            return this.src;
        }

        public TermQueryResponseBodyDataTerms setTermId(String termId) {
            this.termId = termId;
            return this;
        }
        public String getTermId() {
            return this.termId;
        }

        public TermQueryResponseBodyDataTerms setTgt(String tgt) {
            this.tgt = tgt;
            return this;
        }
        public String getTgt() {
            return this.tgt;
        }

    }

    public static class TermQueryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("failCount")
        public Long failCount;

        @NameInMap("terms")
        public java.util.List<TermQueryResponseBodyDataTerms> terms;

        public static TermQueryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TermQueryResponseBodyData self = new TermQueryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TermQueryResponseBodyData setFailCount(Long failCount) {
            this.failCount = failCount;
            return this;
        }
        public Long getFailCount() {
            return this.failCount;
        }

        public TermQueryResponseBodyData setTerms(java.util.List<TermQueryResponseBodyDataTerms> terms) {
            this.terms = terms;
            return this;
        }
        public java.util.List<TermQueryResponseBodyDataTerms> getTerms() {
            return this.terms;
        }

    }

}
