// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateMyAgenticNotificationChannelConfigResponseBody extends TeaModel {
    /**
     * <p>The updated notification channel configuration.</p>
     */
    @NameInMap("Data")
    public UpdateMyAgenticNotificationChannelConfigResponseBodyData data;

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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values: true: The request is successful. false: The request fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateMyAgenticNotificationChannelConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMyAgenticNotificationChannelConfigResponseBody self = new UpdateMyAgenticNotificationChannelConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMyAgenticNotificationChannelConfigResponseBody setData(UpdateMyAgenticNotificationChannelConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateMyAgenticNotificationChannelConfigResponseBodyData getData() {
        return this.data;
    }

    public UpdateMyAgenticNotificationChannelConfigResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateMyAgenticNotificationChannelConfigResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateMyAgenticNotificationChannelConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMyAgenticNotificationChannelConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateMyAgenticNotificationChannelConfigResponseBodyData extends TeaModel {
        /**
         * <p>The notification channel type. Valid values: FEISHU (Lark).</p>
         * 
         * <strong>example:</strong>
         * <p>FEISHU</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>The channel configuration information. Both keys and values are strings, including the bound identity information such as openId, mobile, or email. Sensitive values are always displayed as ******, and plaintext is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;openId&quot;:&quot;<strong><strong><strong>&quot;,&quot;mobile&quot;:&quot;</strong></strong></strong>&quot;,&quot;email&quot;:&quot;******&quot;}</p>
         */
        @NameInMap("Config")
        public java.util.Map<String, String> config;

        /**
         * <p>Indicates whether the notification channel is enabled. Returns false if the channel has never been configured.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        public static UpdateMyAgenticNotificationChannelConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateMyAgenticNotificationChannelConfigResponseBodyData self = new UpdateMyAgenticNotificationChannelConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateMyAgenticNotificationChannelConfigResponseBodyData setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public UpdateMyAgenticNotificationChannelConfigResponseBodyData setConfig(java.util.Map<String, String> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, String> getConfig() {
            return this.config;
        }

        public UpdateMyAgenticNotificationChannelConfigResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

}
