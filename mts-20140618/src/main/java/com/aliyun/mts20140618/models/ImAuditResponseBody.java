// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ImAuditResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ImageQuotaExceed")
    public Boolean imageQuotaExceed;

    @NameInMap("TextQuotaExceed")
    public Boolean textQuotaExceed;

    @NameInMap("TextResults")
    public java.util.List<ImAuditResponseBodyTextResults> textResults;

    @NameInMap("ImageResults")
    public java.util.List<ImAuditResponseBodyImageResults> imageResults;

    public static ImAuditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImAuditResponseBody self = new ImAuditResponseBody();
        return TeaModel.build(map, self);
    }

    public ImAuditResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ImAuditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImAuditResponseBody setImageQuotaExceed(Boolean imageQuotaExceed) {
        this.imageQuotaExceed = imageQuotaExceed;
        return this;
    }
    public Boolean getImageQuotaExceed() {
        return this.imageQuotaExceed;
    }

    public ImAuditResponseBody setTextQuotaExceed(Boolean textQuotaExceed) {
        this.textQuotaExceed = textQuotaExceed;
        return this;
    }
    public Boolean getTextQuotaExceed() {
        return this.textQuotaExceed;
    }

    public ImAuditResponseBody setTextResults(java.util.List<ImAuditResponseBodyTextResults> textResults) {
        this.textResults = textResults;
        return this;
    }
    public java.util.List<ImAuditResponseBodyTextResults> getTextResults() {
        return this.textResults;
    }

    public ImAuditResponseBody setImageResults(java.util.List<ImAuditResponseBodyImageResults> imageResults) {
        this.imageResults = imageResults;
        return this;
    }
    public java.util.List<ImAuditResponseBodyImageResults> getImageResults() {
        return this.imageResults;
    }

    public static class ImAuditResponseBodyTextResults extends TeaModel {
        @NameInMap("Result")
        public java.util.Map<String, ?> result;

        public static ImAuditResponseBodyTextResults build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyTextResults self = new ImAuditResponseBodyTextResults();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyTextResults setResult(java.util.Map<String, ?> result) {
            this.result = result;
            return this;
        }
        public java.util.Map<String, ?> getResult() {
            return this.result;
        }

    }

    public static class ImAuditResponseBodyImageResults extends TeaModel {
        @NameInMap("Result")
        public java.util.Map<String, ?> result;

        public static ImAuditResponseBodyImageResults build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyImageResults self = new ImAuditResponseBodyImageResults();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyImageResults setResult(java.util.Map<String, ?> result) {
            this.result = result;
            return this;
        }
        public java.util.Map<String, ?> getResult() {
            return this.result;
        }

    }

}
