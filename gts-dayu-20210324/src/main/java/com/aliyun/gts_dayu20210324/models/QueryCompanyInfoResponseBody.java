// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210324.models;

import com.aliyun.tea.*;

public class QueryCompanyInfoResponseBody extends TeaModel {
    // message
    @NameInMap("Message")
    public String message;

    // data
    @NameInMap("Data")
    public QueryCompanyInfoResponseBodyData data;

    // code
    @NameInMap("Code")
    public String code;

    // success
    @NameInMap("Success")
    public Boolean success;

    // exception
    @NameInMap("Exception")
    public java.util.Map<String, ?> exception;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryCompanyInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCompanyInfoResponseBody self = new QueryCompanyInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCompanyInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCompanyInfoResponseBody setData(QueryCompanyInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCompanyInfoResponseBodyData getData() {
        return this.data;
    }

    public QueryCompanyInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCompanyInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryCompanyInfoResponseBody setException(java.util.Map<String, ?> exception) {
        this.exception = exception;
        return this;
    }
    public java.util.Map<String, ?> getException() {
        return this.exception;
    }

    public QueryCompanyInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryCompanyInfoResponseBodyData extends TeaModel {
        @NameInMap("entName")
        public String entName;

        @NameInMap("legalName")
        public String legalName;

        @NameInMap("recCap")
        public String recCap;

        @NameInMap("website")
        public String website;

        @NameInMap("entAddress")
        public String entAddress;

        @NameInMap("opScope")
        public String opScope;

        @NameInMap("industry")
        public String industry;

        public static QueryCompanyInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCompanyInfoResponseBodyData self = new QueryCompanyInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCompanyInfoResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public QueryCompanyInfoResponseBodyData setLegalName(String legalName) {
            this.legalName = legalName;
            return this;
        }
        public String getLegalName() {
            return this.legalName;
        }

        public QueryCompanyInfoResponseBodyData setRecCap(String recCap) {
            this.recCap = recCap;
            return this;
        }
        public String getRecCap() {
            return this.recCap;
        }

        public QueryCompanyInfoResponseBodyData setWebsite(String website) {
            this.website = website;
            return this;
        }
        public String getWebsite() {
            return this.website;
        }

        public QueryCompanyInfoResponseBodyData setEntAddress(String entAddress) {
            this.entAddress = entAddress;
            return this;
        }
        public String getEntAddress() {
            return this.entAddress;
        }

        public QueryCompanyInfoResponseBodyData setOpScope(String opScope) {
            this.opScope = opScope;
            return this;
        }
        public String getOpScope() {
            return this.opScope;
        }

        public QueryCompanyInfoResponseBodyData setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

    }

}
