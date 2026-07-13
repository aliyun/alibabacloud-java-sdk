// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmInstanceConfigAlertRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh-CN: Chinese</p>
     * </li>
     * <li><p>en-US: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>A list of alert configurations.</p>
     */
    @NameInMap("AlertConfig")
    public java.util.List<UpdateCloudGtmInstanceConfigAlertRequestAlertConfig> alertConfig;

    /**
     * <p>A list of alert notification groups.</p>
     */
    @NameInMap("AlertGroup")
    public java.util.List<String> alertGroup;

    /**
     * <p>The alert configuration mode for the instance. Valid values:</p>
     * <ul>
     * <li><p>global: The instance inherits the global alert configuration.</p>
     * </li>
     * <li><p>instance_config: The instance uses a custom alert configuration.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("AlertMode")
    public String alertMode;

    /**
     * <p>A client-generated token that ensures the idempotence of the request. The client must generate a unique value for this parameter. The token can contain a maximum of 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the domain name instance configuration. A GTM instance can have two configurations for the same access domain name if you configure both A and AAAA records. The ConfigId uniquely identifies a configuration.</p>
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
         * <p>Specifies whether to enable DingTalk notifications. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled. When an alert is triggered, a DingTalk message is sent.</p>
         * </li>
         * <li><p>false: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DingtalkNotice")
        public Boolean dingtalkNotice;

        /**
         * <p>Specifies whether to enable email notifications. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled. When an alert is triggered, an email is sent.</p>
         * </li>
         * <li><p>false: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EmailNotice")
        public Boolean emailNotice;

        /**
         * <p>The type of alert event. Valid values:</p>
         * <ul>
         * <li><p>addr_alert: The address is unavailable.</p>
         * </li>
         * <li><p>addr_resume: The address has recovered.</p>
         * </li>
         * <li><p>addr_pool_unavailable: The address pool is unavailable.</p>
         * </li>
         * <li><p>addr_pool_available: The address pool has recovered.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>addr_alert</p>
         */
        @NameInMap("NoticeType")
        public String noticeType;

        /**
         * <p>Specifies whether to enable text message notifications. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled. When an alert is triggered, a text message is sent.</p>
         * </li>
         * <li><p>false: Disabled.</p>
         * </li>
         * </ul>
         * <p>Note: Text message notifications are supported only on the China site (aliyun.com).</p>
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
