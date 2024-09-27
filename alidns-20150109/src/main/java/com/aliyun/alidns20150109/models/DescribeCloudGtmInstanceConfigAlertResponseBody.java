// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmInstanceConfigAlertResponseBody extends TeaModel {
    /**
     * <p>The alert configurations.</p>
     */
    @NameInMap("AlertConfig")
    public DescribeCloudGtmInstanceConfigAlertResponseBodyAlertConfig alertConfig;

    /**
     * <p>The alert contact groups.</p>
     */
    @NameInMap("AlertGroup")
    public DescribeCloudGtmInstanceConfigAlertResponseBodyAlertGroup alertGroup;

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
     * <p>The configuration ID of the access domain name. Two configuration IDs exist when the access domain name is bound to the same GTM instance but an A record and an AAAA record are configured for the access domain name. The configuration ID uniquely identifies a configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>Config-000**11</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <p>The ID of the GTM 3.0 instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gtm-cn-wwo3a3hbz**</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0F32959D-417B-4D66-8463-68606605E3E2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCloudGtmInstanceConfigAlertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmInstanceConfigAlertResponseBody self = new DescribeCloudGtmInstanceConfigAlertResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmInstanceConfigAlertResponseBody setAlertConfig(DescribeCloudGtmInstanceConfigAlertResponseBodyAlertConfig alertConfig) {
        this.alertConfig = alertConfig;
        return this;
    }
    public DescribeCloudGtmInstanceConfigAlertResponseBodyAlertConfig getAlertConfig() {
        return this.alertConfig;
    }

    public DescribeCloudGtmInstanceConfigAlertResponseBody setAlertGroup(DescribeCloudGtmInstanceConfigAlertResponseBodyAlertGroup alertGroup) {
        this.alertGroup = alertGroup;
        return this;
    }
    public DescribeCloudGtmInstanceConfigAlertResponseBodyAlertGroup getAlertGroup() {
        return this.alertGroup;
    }

    public DescribeCloudGtmInstanceConfigAlertResponseBody setAlertMode(String alertMode) {
        this.alertMode = alertMode;
        return this;
    }
    public String getAlertMode() {
        return this.alertMode;
    }

    public DescribeCloudGtmInstanceConfigAlertResponseBody setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public DescribeCloudGtmInstanceConfigAlertResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeCloudGtmInstanceConfigAlertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCloudGtmInstanceConfigAlertResponseBodyAlertConfigAlertConfig extends TeaModel {
        /**
         * <p>Indicates whether DingTalk notifications are configured. Valid values:</p>
         * <ul>
         * <li>true: DingTalk notifications are configured. DingTalk notifications are sent after alerts are triggered.</li>
         * <li>false: DingTalk notifications are not configured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DingtalkNotice")
        public Boolean dingtalkNotice;

        /**
         * <p>Indicates whether email notifications are configured. Valid values:</p>
         * <ul>
         * <li>true: Email notifications are configured. Emails are sent after alerts are triggered.</li>
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
         * <p>Indicates whether text message notifications are configured. Valid values:</p>
         * <ul>
         * <li>true: Text message notifications are configured. Text messages are sent after alerts are triggered.</li>
         * <li>false: Text message notifications are not configured.</li>
         * </ul>
         * <p>Only the China site (aliyun.com) supports text message notifications.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SmsNotice")
        public Boolean smsNotice;

        public static DescribeCloudGtmInstanceConfigAlertResponseBodyAlertConfigAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmInstanceConfigAlertResponseBodyAlertConfigAlertConfig self = new DescribeCloudGtmInstanceConfigAlertResponseBodyAlertConfigAlertConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmInstanceConfigAlertResponseBodyAlertConfigAlertConfig setDingtalkNotice(Boolean dingtalkNotice) {
            this.dingtalkNotice = dingtalkNotice;
            return this;
        }
        public Boolean getDingtalkNotice() {
            return this.dingtalkNotice;
        }

        public DescribeCloudGtmInstanceConfigAlertResponseBodyAlertConfigAlertConfig setEmailNotice(Boolean emailNotice) {
            this.emailNotice = emailNotice;
            return this;
        }
        public Boolean getEmailNotice() {
            return this.emailNotice;
        }

        public DescribeCloudGtmInstanceConfigAlertResponseBodyAlertConfigAlertConfig setNoticeType(String noticeType) {
            this.noticeType = noticeType;
            return this;
        }
        public String getNoticeType() {
            return this.noticeType;
        }

        public DescribeCloudGtmInstanceConfigAlertResponseBodyAlertConfigAlertConfig setSmsNotice(Boolean smsNotice) {
            this.smsNotice = smsNotice;
            return this;
        }
        public Boolean getSmsNotice() {
            return this.smsNotice;
        }

    }

    public static class DescribeCloudGtmInstanceConfigAlertResponseBodyAlertConfig extends TeaModel {
        @NameInMap("AlertConfig")
        public java.util.List<DescribeCloudGtmInstanceConfigAlertResponseBodyAlertConfigAlertConfig> alertConfig;

        public static DescribeCloudGtmInstanceConfigAlertResponseBodyAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmInstanceConfigAlertResponseBodyAlertConfig self = new DescribeCloudGtmInstanceConfigAlertResponseBodyAlertConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmInstanceConfigAlertResponseBodyAlertConfig setAlertConfig(java.util.List<DescribeCloudGtmInstanceConfigAlertResponseBodyAlertConfigAlertConfig> alertConfig) {
            this.alertConfig = alertConfig;
            return this;
        }
        public java.util.List<DescribeCloudGtmInstanceConfigAlertResponseBodyAlertConfigAlertConfig> getAlertConfig() {
            return this.alertConfig;
        }

    }

    public static class DescribeCloudGtmInstanceConfigAlertResponseBodyAlertGroup extends TeaModel {
        @NameInMap("AlertGroup")
        public java.util.List<String> alertGroup;

        public static DescribeCloudGtmInstanceConfigAlertResponseBodyAlertGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmInstanceConfigAlertResponseBodyAlertGroup self = new DescribeCloudGtmInstanceConfigAlertResponseBodyAlertGroup();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmInstanceConfigAlertResponseBodyAlertGroup setAlertGroup(java.util.List<String> alertGroup) {
            this.alertGroup = alertGroup;
            return this;
        }
        public java.util.List<String> getAlertGroup() {
            return this.alertGroup;
        }

    }

}
