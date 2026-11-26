// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListMyAgenticNotificationChannelConfigsResponseBody extends TeaModel {
    /**
     * <p>The list of notification channel configurations for the current user.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListMyAgenticNotificationChannelConfigsResponseBodyData> data;

    /**
     * <p>The error code returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>INVALID_PARAMETER</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>channel must be FEISHU</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The maximum number of records per page used for this query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. This parameter is empty if no more data is available.</p>
     * 
     * <strong>example:</strong>
     * <p>MjA</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values: true and false.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListMyAgenticNotificationChannelConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMyAgenticNotificationChannelConfigsResponseBody self = new ListMyAgenticNotificationChannelConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMyAgenticNotificationChannelConfigsResponseBody setData(java.util.List<ListMyAgenticNotificationChannelConfigsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMyAgenticNotificationChannelConfigsResponseBodyData> getData() {
        return this.data;
    }

    public ListMyAgenticNotificationChannelConfigsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListMyAgenticNotificationChannelConfigsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListMyAgenticNotificationChannelConfigsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMyAgenticNotificationChannelConfigsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMyAgenticNotificationChannelConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMyAgenticNotificationChannelConfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMyAgenticNotificationChannelConfigsResponseBodyData extends TeaModel {
        /**
         * <p>The notification channel type. Valid values: FEISHU (Lark).</p>
         * 
         * <strong>example:</strong>
         * <p>FEISHU</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>The channel configuration information. Both keys and values are strings, which include bound identity information such as openId, mobile, or email. Sensitive values are always displayed as ****** and are not returned in plaintext.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;openId&quot;:&quot;<strong><strong><strong>&quot;,&quot;mobile&quot;:&quot;</strong></strong></strong>&quot;,&quot;email&quot;:&quot;******&quot;}</p>
         */
        @NameInMap("Config")
        public java.util.Map<String, String> config;

        /**
         * <p>Indicates whether the notification channel is enabled. If the channel has never been configured, false is returned.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        public static ListMyAgenticNotificationChannelConfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMyAgenticNotificationChannelConfigsResponseBodyData self = new ListMyAgenticNotificationChannelConfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMyAgenticNotificationChannelConfigsResponseBodyData setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public ListMyAgenticNotificationChannelConfigsResponseBodyData setConfig(java.util.Map<String, String> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, String> getConfig() {
            return this.config;
        }

        public ListMyAgenticNotificationChannelConfigsResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

}
