// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmGlobalAlertRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><code>zh-CN</code>: Chinese</p>
     * </li>
     * <li><p><code>en-US</code>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>A list of alert configurations.</p>
     */
    @NameInMap("AlertConfig")
    public java.util.List<UpdateCloudGtmGlobalAlertRequestAlertConfig> alertConfig;

    /**
     * <p>A list of alert notification groups.</p>
     */
    @NameInMap("AlertGroup")
    public java.util.List<String> alertGroup;

    /**
     * <p>A client-generated token to ensure request idempotence. This token must be unique for each request, contain only ASCII characters, and be no more than 64 characters in length.</p>
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
         * <p>Whether to send a DingTalk notification when an alert is triggered. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: A DingTalk notification is sent.</p>
         * </li>
         * <li><p><code>false</code>: Do not send a DingTalk notification.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DingtalkNotice")
        public Boolean dingtalkNotice;

        /**
         * <p>Whether to send an email notification when an alert is triggered. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: An email notification is sent.</p>
         * </li>
         * <li><p><code>false</code> or <code>null</code>: Do not send an email notification.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EmailNotice")
        public Boolean emailNotice;

        /**
         * <p>The alert event type. Valid values:</p>
         * <ul>
         * <li><p><code>addr_alert</code>: An address becomes unavailable.</p>
         * </li>
         * <li><p><code>addr_resume</code>: An address becomes available.</p>
         * </li>
         * <li><p><code>addr_pool_unavailable</code>: An address pool becomes unavailable.</p>
         * </li>
         * <li><p><code>addr_pool_available</code>: An address pool becomes available.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>addr_alert</p>
         */
        @NameInMap("NoticeType")
        public String noticeType;

        /**
         * <p>The alert threshold for queries per second (QPS).</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("QpsThreshold")
        public Long qpsThreshold;

        /**
         * <p>Whether to send a text message notification when an alert is triggered. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: A text message notification is sent.</p>
         * </li>
         * <li><p><code>false</code> or <code>null</code>: Do not send a text message notification.</p>
         * </li>
         * </ul>
         * <p>Text message notifications are available only on the China site.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SmsNotice")
        public Boolean smsNotice;

        /**
         * <p>The alert threshold.</p>
         * 
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

        public UpdateCloudGtmGlobalAlertRequestAlertConfig setQpsThreshold(Long qpsThreshold) {
            this.qpsThreshold = qpsThreshold;
            return this;
        }
        public Long getQpsThreshold() {
            return this.qpsThreshold;
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
