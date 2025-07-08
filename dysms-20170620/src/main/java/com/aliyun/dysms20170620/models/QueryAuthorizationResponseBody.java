// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryAuthorizationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<QueryAuthorizationResponseBodyResult> result;

    public static QueryAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthorizationResponseBody self = new QueryAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAuthorizationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAuthorizationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAuthorizationResponseBody setResult(java.util.List<QueryAuthorizationResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryAuthorizationResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryAuthorizationResponseBodyResult extends TeaModel {
        @NameInMap("AliyunUid")
        public Long aliyunUid;

        @NameInMap("AuthorizeCode")
        public String authorizeCode;

        @NameInMap("AuthorizeStatus")
        public Boolean authorizeStatus;

        @NameInMap("AuthorizeTime")
        public String authorizeTime;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("UnAuthorizeTime")
        public String unAuthorizeTime;

        public static QueryAuthorizationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryAuthorizationResponseBodyResult self = new QueryAuthorizationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryAuthorizationResponseBodyResult setAliyunUid(Long aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public Long getAliyunUid() {
            return this.aliyunUid;
        }

        public QueryAuthorizationResponseBodyResult setAuthorizeCode(String authorizeCode) {
            this.authorizeCode = authorizeCode;
            return this;
        }
        public String getAuthorizeCode() {
            return this.authorizeCode;
        }

        public QueryAuthorizationResponseBodyResult setAuthorizeStatus(Boolean authorizeStatus) {
            this.authorizeStatus = authorizeStatus;
            return this;
        }
        public Boolean getAuthorizeStatus() {
            return this.authorizeStatus;
        }

        public QueryAuthorizationResponseBodyResult setAuthorizeTime(String authorizeTime) {
            this.authorizeTime = authorizeTime;
            return this;
        }
        public String getAuthorizeTime() {
            return this.authorizeTime;
        }

        public QueryAuthorizationResponseBodyResult setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QueryAuthorizationResponseBodyResult setUnAuthorizeTime(String unAuthorizeTime) {
            this.unAuthorizeTime = unAuthorizeTime;
            return this;
        }
        public String getUnAuthorizeTime() {
            return this.unAuthorizeTime;
        }

    }

}
