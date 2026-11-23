// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterAllowedPrefixHistoryResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>Authentication is failed for ****</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The list of historical prefix routes.</p>
     */
    @NameInMap("AllowedPrefixHistoryList")
    public java.util.List<DescribeExpressConnectRouterAllowedPrefixHistoryResponseBodyAllowedPrefixHistoryList> allowedPrefixHistoryList;

    /**
     * <p>Indicates whether the call was successful. A value of 200 indicates that the operation was successful. Other values indicate that the operation failed. For more information about the causes of failures, see error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>IllegalParamFormat.EcrId</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message, which is used to replace <code>%s</code> in the error message of the <strong>ErrMessage</strong> response parameter.</p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, it indicates that the request parameter <strong>DtsJobId</strong> is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>The param format of EcrId **** is illegal.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned for the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6FABF516-FED3-5697-BDA2-B18C5D9A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>True</strong>: Successful.</li>
     * <li><strong>False</strong>: Failed.</li>
     * </ul>
     * 
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
        /**
         * <p>The prefix route.</p>
         */
        @NameInMap("AllowedPrefix")
        public java.util.List<String> allowedPrefix;

        /**
         * <p>The time when the historical route entry was created.</p>
         * 
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
