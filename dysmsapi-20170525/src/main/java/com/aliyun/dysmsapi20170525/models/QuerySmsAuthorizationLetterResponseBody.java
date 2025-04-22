// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsAuthorizationLetterResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QuerySmsAuthorizationLetterResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>25D5AFDE-8EBC-132E-8909-1FDC071D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySmsAuthorizationLetterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsAuthorizationLetterResponseBody self = new QuerySmsAuthorizationLetterResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsAuthorizationLetterResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QuerySmsAuthorizationLetterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySmsAuthorizationLetterResponseBody setData(java.util.List<QuerySmsAuthorizationLetterResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QuerySmsAuthorizationLetterResponseBodyData> getData() {
        return this.data;
    }

    public QuerySmsAuthorizationLetterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySmsAuthorizationLetterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmsAuthorizationLetterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySmsAuthorizationLetterResponseBodyData extends TeaModel {
        /**
         * <p>委托授权方</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Authorization")
        public String authorization;

        /**
         * <p>委托授权书有效期</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-01~2026-01-01</p>
         */
        @NameInMap("AuthorizationLetterExpDate")
        public String authorizationLetterExpDate;

        /**
         * <p>委托授权书id</p>
         * 
         * <strong>example:</strong>
         * <p>10000******</p>
         */
        @NameInMap("AuthorizationLetterId")
        public Long authorizationLetterId;

        /**
         * <p>委托授权书命名</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("AuthorizationLetterName")
        public String authorizationLetterName;

        /**
         * <p>委托授权书图片地址</p>
         */
        @NameInMap("AuthorizationLetterPic")
        public String authorizationLetterPic;

        /**
         * <p>授权方统一社会信用代码</p>
         * 
         * <strong>example:</strong>
         * <p>9****************A</p>
         */
        @NameInMap("OrganizationCode")
        public String organizationCode;

        /**
         * <p>被委托授权方</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("ProxyAuthorization")
        public String proxyAuthorization;

        /**
         * <p>委托授权签名范围</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("SignScope")
        public String signScope;

        /**
         * <p>委托授权书审核状态（初始化INT/审核通过PASSED）</p>
         * 
         * <strong>example:</strong>
         * <p>PASSED</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>委托授权书可用状态（可用VALID/不可用INVALID）</p>
         * 
         * <strong>example:</strong>
         * <p>VALID</p>
         */
        @NameInMap("Status")
        public String status;

        public static QuerySmsAuthorizationLetterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsAuthorizationLetterResponseBodyData self = new QuerySmsAuthorizationLetterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySmsAuthorizationLetterResponseBodyData setAuthorization(String authorization) {
            this.authorization = authorization;
            return this;
        }
        public String getAuthorization() {
            return this.authorization;
        }

        public QuerySmsAuthorizationLetterResponseBodyData setAuthorizationLetterExpDate(String authorizationLetterExpDate) {
            this.authorizationLetterExpDate = authorizationLetterExpDate;
            return this;
        }
        public String getAuthorizationLetterExpDate() {
            return this.authorizationLetterExpDate;
        }

        public QuerySmsAuthorizationLetterResponseBodyData setAuthorizationLetterId(Long authorizationLetterId) {
            this.authorizationLetterId = authorizationLetterId;
            return this;
        }
        public Long getAuthorizationLetterId() {
            return this.authorizationLetterId;
        }

        public QuerySmsAuthorizationLetterResponseBodyData setAuthorizationLetterName(String authorizationLetterName) {
            this.authorizationLetterName = authorizationLetterName;
            return this;
        }
        public String getAuthorizationLetterName() {
            return this.authorizationLetterName;
        }

        public QuerySmsAuthorizationLetterResponseBodyData setAuthorizationLetterPic(String authorizationLetterPic) {
            this.authorizationLetterPic = authorizationLetterPic;
            return this;
        }
        public String getAuthorizationLetterPic() {
            return this.authorizationLetterPic;
        }

        public QuerySmsAuthorizationLetterResponseBodyData setOrganizationCode(String organizationCode) {
            this.organizationCode = organizationCode;
            return this;
        }
        public String getOrganizationCode() {
            return this.organizationCode;
        }

        public QuerySmsAuthorizationLetterResponseBodyData setProxyAuthorization(String proxyAuthorization) {
            this.proxyAuthorization = proxyAuthorization;
            return this;
        }
        public String getProxyAuthorization() {
            return this.proxyAuthorization;
        }

        public QuerySmsAuthorizationLetterResponseBodyData setSignScope(String signScope) {
            this.signScope = signScope;
            return this;
        }
        public String getSignScope() {
            return this.signScope;
        }

        public QuerySmsAuthorizationLetterResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QuerySmsAuthorizationLetterResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
