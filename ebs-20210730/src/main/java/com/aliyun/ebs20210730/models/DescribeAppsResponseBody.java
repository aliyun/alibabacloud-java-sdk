// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeAppsResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The application information.</p>
     */
    @NameInMap("AppInfos")
    public java.util.List<DescribeAppsResponseBodyAppInfos> appInfos;

    /**
     * <p>The internal error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message, which is used to replace the %s variable in the ErrMessage error message.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
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
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1C00637-AC84-5EFD-89B5-D5CE39F0F2B1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The user error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("UserCode")
    public String userCode;

    public static DescribeAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppsResponseBody self = new DescribeAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeAppsResponseBody setAppInfos(java.util.List<DescribeAppsResponseBodyAppInfos> appInfos) {
        this.appInfos = appInfos;
        return this;
    }
    public java.util.List<DescribeAppsResponseBodyAppInfos> getAppInfos() {
        return this.appInfos;
    }

    public DescribeAppsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAppsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeAppsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeAppsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAppsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeAppsResponseBody setUserCode(String userCode) {
        this.userCode = userCode;
        return this;
    }
    public String getUserCode() {
        return this.userCode;
    }

    public static class DescribeAppsResponseBodyAppInfosAppTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>ebs</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeAppsResponseBodyAppInfosAppTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyAppInfosAppTags self = new DescribeAppsResponseBodyAppInfosAppTags();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyAppInfosAppTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeAppsResponseBodyAppInfosAppTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeAppsResponseBodyAppInfos extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app-bd5e3533</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name. This parameter takes effect only when ReportType is set to present.</p>
         * 
         * <strong>example:</strong>
         * <p>app1</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The tags contained in the user application.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("AppTags")
        public java.util.List<DescribeAppsResponseBodyAppInfosAppTags> appTags;

        /**
         * <p>The default time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Default")
        public Boolean _default;

        /**
         * <p>The event description.</p>
         * 
         * <strong>example:</strong>
         * <p>This app is used to collect cloud disk usage statistics across the network</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether delivery to EventBridge is enabled.</p>
         */
        @NameInMap("EventBridgeSendEnabled")
        public Boolean eventBridgeSendEnabled;

        /**
         * <p>The modification time in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-14T02:11:32Z</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>Indicates whether delivery to CloudMonitor is enabled.</p>
         */
        @NameInMap("MonitorSendEnabled")
        public Boolean monitorSendEnabled;

        /**
         * <p>Indicates whether report sending is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ReportSendEnabled")
        public Boolean reportSendEnabled;

        /**
         * <p>Indicates whether delivery to Simple Log Service (SLS) is enabled.</p>
         */
        @NameInMap("SlsSendEnabled")
        public Boolean slsSendEnabled;

        /**
         * <p>The report subscription period.</p>
         * 
         * <strong>example:</strong>
         * <p>Weekly</p>
         */
        @NameInMap("SubscribePeriod")
        public String subscribePeriod;

        /**
         * <p>The subscription status. Valid values:</p>
         * <ul>
         * <li>Subscribe: subscribed.</li>
         * <li>UnSubscribe: not subscribed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Subscribe</p>
         */
        @NameInMap("SubscribeStatus")
        public String subscribeStatus;

        public static DescribeAppsResponseBodyAppInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyAppInfos self = new DescribeAppsResponseBodyAppInfos();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyAppInfos setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeAppsResponseBodyAppInfos setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeAppsResponseBodyAppInfos setAppTags(java.util.List<DescribeAppsResponseBodyAppInfosAppTags> appTags) {
            this.appTags = appTags;
            return this;
        }
        public java.util.List<DescribeAppsResponseBodyAppInfosAppTags> getAppTags() {
            return this.appTags;
        }

        public DescribeAppsResponseBodyAppInfos set_default(Boolean _default) {
            this._default = _default;
            return this;
        }
        public Boolean get_default() {
            return this._default;
        }

        public DescribeAppsResponseBodyAppInfos setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAppsResponseBodyAppInfos setEventBridgeSendEnabled(Boolean eventBridgeSendEnabled) {
            this.eventBridgeSendEnabled = eventBridgeSendEnabled;
            return this;
        }
        public Boolean getEventBridgeSendEnabled() {
            return this.eventBridgeSendEnabled;
        }

        public DescribeAppsResponseBodyAppInfos setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public DescribeAppsResponseBodyAppInfos setMonitorSendEnabled(Boolean monitorSendEnabled) {
            this.monitorSendEnabled = monitorSendEnabled;
            return this;
        }
        public Boolean getMonitorSendEnabled() {
            return this.monitorSendEnabled;
        }

        public DescribeAppsResponseBodyAppInfos setReportSendEnabled(Boolean reportSendEnabled) {
            this.reportSendEnabled = reportSendEnabled;
            return this;
        }
        public Boolean getReportSendEnabled() {
            return this.reportSendEnabled;
        }

        public DescribeAppsResponseBodyAppInfos setSlsSendEnabled(Boolean slsSendEnabled) {
            this.slsSendEnabled = slsSendEnabled;
            return this;
        }
        public Boolean getSlsSendEnabled() {
            return this.slsSendEnabled;
        }

        public DescribeAppsResponseBodyAppInfos setSubscribePeriod(String subscribePeriod) {
            this.subscribePeriod = subscribePeriod;
            return this;
        }
        public String getSubscribePeriod() {
            return this.subscribePeriod;
        }

        public DescribeAppsResponseBodyAppInfos setSubscribeStatus(String subscribeStatus) {
            this.subscribeStatus = subscribeStatus;
            return this;
        }
        public String getSubscribeStatus() {
            return this.subscribeStatus;
        }

    }

}
