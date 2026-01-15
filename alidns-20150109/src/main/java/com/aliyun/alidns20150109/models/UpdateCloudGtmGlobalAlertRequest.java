// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmGlobalAlertRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh-CN: Chinese</li>
     * <li>en-US: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The alert configurations.</p>
     */
    @NameInMap("AlertConfig")
    public java.util.List<UpdateCloudGtmGlobalAlertRequestAlertConfig> alertConfig;

    /**
     * <p>The alert contact groups.</p>
     */
    @NameInMap("AlertGroup")
    public java.util.List<String> alertGroup;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can specify a custom value for this parameter, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    public static UpdateCloudGtmGlobalAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmGlobalAlertRequest self = new UpdateCloudGtmGlobalAlertRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmGlobalAlertRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateCloudGtmGlobalAlertRequest setAlertConfig(java.util.List<UpdateCloudGtmGlobalAlertRequestAlertConfig> alertConfig) {
        this.alertConfig = alertConfig;
        return this;
    }
    public java.util.List<UpdateCloudGtmGlobalAlertRequestAlertConfig> getAlertConfig() {
        return this.alertConfig;
    }

    public UpdateCloudGtmGlobalAlertRequest setAlertGroup(java.util.List<String> alertGroup) {
        this.alertGroup = alertGroup;
        return this;
    }
    public java.util.List<String> getAlertGroup() {
        return this.alertGroup;
    }

    public UpdateCloudGtmGlobalAlertRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateCloudGtmGlobalAlertRequestAlertConfig extends TeaModel {
        /**
         * <p>Specifies whether to configure DingTalk notifications. Valid values:</p>
         * <ul>
         * <li>true: configures DingTalk notifications. DingTalk notifications are sent when alerts are triggered.</li>
         * <li>false: does not configure DingTalk notifications.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DingtalkNotice")
        public Boolean dingtalkNotice;

        /**
         * <p>Specifies whether to configure email notifications. Valid values:</p>
         * <ul>
         * <li>true: configures email notifications. Emails are sent when alerts are triggered.</li>
         * <li>false｜null: does not configure email notifications.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EmailNotice")
        public Boolean emailNotice;

        /**
         * <p>The type of the alert event. Valid values:</p>
         * <ul>
         * <li>addr_alert: The address is unavailable.</li>
         * <li>addr_resume: The address becomes available.</li>
         * <li>addr_pool_unavailable: The address pool is unavailable.</li>
         * <li>addr_pool_available: The address pool becomes available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>addr_alert</p>
         */
        @NameInMap("NoticeType")
        public String noticeType;

        /**
         * <p>Specifies whether to configure text message notifications. Valid values:</p>
         * <ul>
         * <li>true: configures text message notifications. Text messages are sent when alerts are triggered.</li>
         * <li>false｜null: does not configure text message notifications.</li>
         * </ul>
         * <p>Only the China site (aliyun.com) supports text message notifications.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SmsNotice")
        public Boolean smsNotice;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Threshold")
        public Integer threshold;

        public static UpdateCloudGtmGlobalAlertRequestAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudGtmGlobalAlertRequestAlertConfig self = new UpdateCloudGtmGlobalAlertRequestAlertConfig();
            return TeaModel.build(map, self);
        }

        public UpdateCloudGtmGlobalAlertRequestAlertConfig setDingtalkNotice(Boolean dingtalkNotice) {
            this.dingtalkNotice = dingtalkNotice;
            return this;
        }
        public Boolean getDingtalkNotice() {
            return this.dingtalkNotice;
        }

        public UpdateCloudGtmGlobalAlertRequestAlertConfig setEmailNotice(Boolean emailNotice) {
            this.emailNotice = emailNotice;
            return this;
        }
        public Boolean getEmailNotice() {
            return this.emailNotice;
        }

        public UpdateCloudGtmGlobalAlertRequestAlertConfig setNoticeType(String noticeType) {
            this.noticeType = noticeType;
            return this;
        }
        public String getNoticeType() {
            return this.noticeType;
        }

        public UpdateCloudGtmGlobalAlertRequestAlertConfig setSmsNotice(Boolean smsNotice) {
            this.smsNotice = smsNotice;
            return this;
        }
        public Boolean getSmsNotice() {
            return this.smsNotice;
        }

        public UpdateCloudGtmGlobalAlertRequestAlertConfig setThreshold(Integer threshold) {
            this.threshold = threshold;
            return this;
        }
        public Integer getThreshold() {
            return this.threshold;
        }

    }

}
