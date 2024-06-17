// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterAllowedPrefixHistoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Authentication is failed for ****</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("AllowedPrefixHistoryList")
    public java.util.List<DescribeExpressConnectRouterAllowedPrefixHistoryResponseBodyAllowedPrefixHistoryList> allowedPrefixHistoryList;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>IllegalParamFormat.EcrId</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>The param format of EcrId **** is illegal.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>6FABF516-FED3-5697-BDA2-B18C5D9A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
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

        /**
         * <strong>example:</strong>
         * <p>1673751163000</p>
         */
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
