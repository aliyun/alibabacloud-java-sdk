// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmInstanceConfigAlertRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh-CN: Chinese</li>
     * <li>en-US: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The alert configurations.</p>
     */
    @NameInMap("AlertConfig")
    public java.util.List<UpdateCloudGtmInstanceConfigAlertRequestAlertConfig> alertConfig;

    /**
     * <p>The alert contact groups.</p>
     */
    @NameInMap("AlertGroup")
    public java.util.List<String> alertGroup;

    /**
     * <p>The alert configuration mode of the instance. Valid values:</p>
     * <ul>
     * <li>global: global alert configuration</li>
     * <li>instance_config: custom alert configuration</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("AlertMode")
    public String alertMode;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The configuration ID of the access domain name. Two configuration IDs exist when an A record and an AAAA record are configured for the access domain name that is bound to the GTM instance. This ID uniquely identifies a configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>Config-000**11</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <p>The ID of the Global Traffic Manager (GTM) 3.0 instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gtm-cn-zz11t58**0s</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateCloudGtmInstanceConfigAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmInstanceConfigAlertRequest self = new UpdateCloudGtmInstanceConfigAlertRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmInstanceConfigAlertRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateCloudGtmInstanceConfigAlertRequest setAlertConfig(java.util.List<UpdateCloudGtmInstanceConfigAlertRequestAlertConfig> alertConfig) {
        this.alertConfig = alertConfig;
        return this;
    }
    public java.util.List<UpdateCloudGtmInstanceConfigAlertRequestAlertConfig> getAlertConfig() {
        return this.alertConfig;
    }

    public UpdateCloudGtmInstanceConfigAlertRequest setAlertGroup(java.util.List<String> alertGroup) {
        this.alertGroup = alertGroup;
        return this;
    }
    public java.util.List<String> getAlertGroup() {
        return this.alertGroup;
    }

    public UpdateCloudGtmInstanceConfigAlertRequest setAlertMode(String alertMode) {
        this.alertMode = alertMode;
        return this;
    }
    public String getAlertMode() {
        return this.alertMode;
    }

    public UpdateCloudGtmInstanceConfigAlertRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCloudGtmInstanceConfigAlertRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public UpdateCloudGtmInstanceConfigAlertRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public static class UpdateCloudGtmInstanceConfigAlertRequestAlertConfig extends TeaModel {
        /**
         * <p>Specifies whether to configure DingTalk notifications. Valid values:</p>
         * <ul>
         * <li>true: DingTalk notifications are configured. DingTalk notifications are sent when alerts are triggered.</li>
         * <li>false: DingTalk notifications are not configured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DingtalkNotice")
        public Boolean dingtalkNotice;

        /**
         * <p>Specifies whether to configure email notifications. Valid values:</p>
         * <ul>
         * <li>true: Email notifications are configured. Emails are sent when alerts are triggered.</li>
         * <li>false: Email notifications are not configured.</li>
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
         * <li>true: Text message notifications are configured. Text messages are sent when alerts are triggered.</li>
         * <li>false: Text message notifications are not configured.</li>
         * </ul>
         * <p>Only the China site (aliyun.com) supports text message notifications.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SmsNotice")
        public Boolean smsNotice;

        public static UpdateCloudGtmInstanceConfigAlertRequestAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudGtmInstanceConfigAlertRequestAlertConfig self = new UpdateCloudGtmInstanceConfigAlertRequestAlertConfig();
            return TeaModel.build(map, self);
        }

        public UpdateCloudGtmInstanceConfigAlertRequestAlertConfig setDingtalkNotice(Boolean dingtalkNotice) {
            this.dingtalkNotice = dingtalkNotice;
            return this;
        }
        public Boolean getDingtalkNotice() {
            return this.dingtalkNotice;
        }

        public UpdateCloudGtmInstanceConfigAlertRequestAlertConfig setEmailNotice(Boolean emailNotice) {
            this.emailNotice = emailNotice;
            return this;
        }
        public Boolean getEmailNotice() {
            return this.emailNotice;
        }

        public UpdateCloudGtmInstanceConfigAlertRequestAlertConfig setNoticeType(String noticeType) {
            this.noticeType = noticeType;
            return this;
        }
        public String getNoticeType() {
            return this.noticeType;
        }

        public UpdateCloudGtmInstanceConfigAlertRequestAlertConfig setSmsNotice(Boolean smsNotice) {
            this.smsNotice = smsNotice;
            return this;
        }
        public Boolean getSmsNotice() {
            return this.smsNotice;
        }

    }

}
