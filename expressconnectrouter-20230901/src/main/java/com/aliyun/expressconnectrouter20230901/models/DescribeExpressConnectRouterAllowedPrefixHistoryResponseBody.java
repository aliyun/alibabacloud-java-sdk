// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterAllowedPrefixHistoryResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("AllowedPrefixHistoryList")
    public java.util.List<DescribeExpressConnectRouterAllowedPrefixHistoryResponseBodyAllowedPrefixHistoryList> allowedPrefixHistoryList;

    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeExpressConnectRouterAllowedPrefixHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectRouterAllowedPrefixHistoryResponseBody self = new DescribeExpressConnectRouterAllowedPrefixHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectRouterAllowedPrefixHistoryResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeExpressConnectRouterAllowedPrefixHistoryResponseBody setAllowedPrefixHistoryList(java.util.List<DescribeExpressConnectRouterAllowedPrefixHistoryResponseBodyAllowedPrefixHistoryList> allowedPrefixHistoryList) {
        this.allowedPrefixHistoryList = allowedPrefixHistoryList;
        return this;
    }
    public java.util.List<DescribeExpressConnectRouterAllowedPrefixHistoryResponseBodyAllowedPrefixHistoryList> getAllowedPrefixHistoryList() {
        return this.allowedPrefixHistoryList;
    }

    public DescribeExpressConnectRouterAllowedPrefixHistoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeExpressConnectRouterAllowedPrefixHistoryResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeExpressConnectRouterAllowedPrefixHistoryResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeExpressConnectRouterAllowedPrefixHistoryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeExpressConnectRouterAllowedPrefixHistoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeExpressConnectRouterAllowedPrefixHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExpressConnectRouterAllowedPrefixHistoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeExpressConnectRouterAllowedPrefixHistoryResponseBodyAllowedPrefixHistoryList extends TeaModel {
        @NameInMap("AllowedPrefix")
        public java.util.List<String> allowedPrefix;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        public static DescribeExpressConnectRouterAllowedPrefixHistoryResponseBodyAllowedPrefixHistoryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressConnectRouterAllowedPrefixHistoryResponseBodyAllowedPrefixHistoryList self = new DescribeExpressConnectRouterAllowedPrefixHistoryResponseBodyAllowedPrefixHistoryList();
            return TeaModel.build(map, self);
        }

        public DescribeExpressConnectRouterAllowedPrefixHistoryResponseBodyAllowedPrefixHistoryList setAllowedPrefix(java.util.List<String> allowedPrefix) {
            this.allowedPrefix = allowedPrefix;
            return this;
        }
        public java.util.List<String> getAllowedPrefix() {
            return this.allowedPrefix;
        }

        public DescribeExpressConnectRouterAllowedPrefixHistoryResponseBodyAllowedPrefixHistoryList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

    }

}
