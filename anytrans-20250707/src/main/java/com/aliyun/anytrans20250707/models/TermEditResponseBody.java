// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class TermEditResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;success&quot;</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public TermEditResponseBodyData data;

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
     * <p>1DCD50EC-D218-1844-9CD8-E97CAB9D31BE</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static TermEditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TermEditResponseBody self = new TermEditResponseBody();
        return TeaModel.build(map, self);
    }

    public TermEditResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TermEditResponseBody setData(TermEditResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TermEditResponseBodyData getData() {
        return this.data;
    }

    public TermEditResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public TermEditResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TermEditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TermEditResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TermEditResponseBodyDataTerms extends TeaModel {
        @NameInMap("src")
        public String src;

        /**
         * <strong>example:</strong>
         * <p>92669964</p>
         */
        @NameInMap("termId")
        public String termId;

        /**
         * <strong>example:</strong>
         * <p>LLM</p>
         */
        @NameInMap("tgt")
        public String tgt;

        public static TermEditResponseBodyDataTerms build(java.util.Map<String, ?> map) throws Exception {
            TermEditResponseBodyDataTerms self = new TermEditResponseBodyDataTerms();
            return TeaModel.build(map, self);
        }

        public TermEditResponseBodyDataTerms setSrc(String src) {
            this.src = src;
            return this;
        }
        public String getSrc() {
            return this.src;
        }

        public TermEditResponseBodyDataTerms setTermId(String termId) {
            this.termId = termId;
            return this;
        }
        public String getTermId() {
            return this.termId;
        }

        public TermEditResponseBodyDataTerms setTgt(String tgt) {
            this.tgt = tgt;
            return this;
        }
        public String getTgt() {
            return this.tgt;
        }

    }

    public static class TermEditResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("failCount")
        public Long failCount;

        @NameInMap("terms")
        public java.util.List<TermEditResponseBodyDataTerms> terms;

        public static TermEditResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TermEditResponseBodyData self = new TermEditResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TermEditResponseBodyData setFailCount(Long failCount) {
            this.failCount = failCount;
            return this;
        }
        public Long getFailCount() {
            return this.failCount;
        }

        public TermEditResponseBodyData setTerms(java.util.List<TermEditResponseBodyDataTerms> terms) {
            this.terms = terms;
            return this;
        }
        public java.util.List<TermEditResponseBodyDataTerms> getTerms() {
            return this.terms;
        }

    }

}
