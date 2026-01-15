// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmGlobalAlertResponseBody extends TeaModel {
    /**
     * <p>The alert configurations.</p>
     */
    @NameInMap("AlertConfig")
    public DescribeCloudGtmGlobalAlertResponseBodyAlertConfig alertConfig;

    /**
     * <p>The alert contact groups.</p>
     */
    @NameInMap("AlertGroup")
    public DescribeCloudGtmGlobalAlertResponseBodyAlertGroup alertGroup;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B57C121B-A45F-44D8-A9B2-13E5A5044195</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCloudGtmGlobalAlertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmGlobalAlertResponseBody self = new DescribeCloudGtmGlobalAlertResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmGlobalAlertResponseBody setAlertConfig(DescribeCloudGtmGlobalAlertResponseBodyAlertConfig alertConfig) {
        this.alertConfig = alertConfig;
        return this;
    }
    public DescribeCloudGtmGlobalAlertResponseBodyAlertConfig getAlertConfig() {
        return this.alertConfig;
    }

    public DescribeCloudGtmGlobalAlertResponseBody setAlertGroup(DescribeCloudGtmGlobalAlertResponseBodyAlertGroup alertGroup) {
        this.alertGroup = alertGroup;
        return this;
    }
    public DescribeCloudGtmGlobalAlertResponseBodyAlertGroup getAlertGroup() {
        return this.alertGroup;
    }

    public DescribeCloudGtmGlobalAlertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCloudGtmGlobalAlertResponseBodyAlertConfigAlertConfig extends TeaModel {
        /**
         * <p>Indicates whether DingTalk notifications are configured. Valid values:</p>
         * <ul>
         * <li>true: DingTalk notifications are configured. DingTalk notifications are sent when alerts are triggered.</li>
         * <li>false: DingTalk notifications are not configured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DingtalkNotice")
        public Boolean dingtalkNotice;

        /**
         * <p>Indicates whether email notifications are configured. Valid values:</p>
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
         * <p>Indicates whether text message notifications are configured. Valid values:</p>
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

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Threshold")
        public Integer threshold;

        public static DescribeCloudGtmGlobalAlertResponseBodyAlertConfigAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmGlobalAlertResponseBodyAlertConfigAlertConfig self = new DescribeCloudGtmGlobalAlertResponseBodyAlertConfigAlertConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmGlobalAlertResponseBodyAlertConfigAlertConfig setDingtalkNotice(Boolean dingtalkNotice) {
            this.dingtalkNotice = dingtalkNotice;
            return this;
        }
        public Boolean getDingtalkNotice() {
            return this.dingtalkNotice;
        }

        public DescribeCloudGtmGlobalAlertResponseBodyAlertConfigAlertConfig setEmailNotice(Boolean emailNotice) {
            this.emailNotice = emailNotice;
            return this;
        }
        public Boolean getEmailNotice() {
            return this.emailNotice;
        }

        public DescribeCloudGtmGlobalAlertResponseBodyAlertConfigAlertConfig setNoticeType(String noticeType) {
            this.noticeType = noticeType;
            return this;
        }
        public String getNoticeType() {
            return this.noticeType;
        }

        public DescribeCloudGtmGlobalAlertResponseBodyAlertConfigAlertConfig setSmsNotice(Boolean smsNotice) {
            this.smsNotice = smsNotice;
            return this;
        }
        public Boolean getSmsNotice() {
            return this.smsNotice;
        }

        public DescribeCloudGtmGlobalAlertResponseBodyAlertConfigAlertConfig setThreshold(Integer threshold) {
            this.threshold = threshold;
            return this;
        }
        public Integer getThreshold() {
            return this.threshold;
        }

    }

    public static class DescribeCloudGtmGlobalAlertResponseBodyAlertConfig extends TeaModel {
        @NameInMap("AlertConfig")
        public java.util.List<DescribeCloudGtmGlobalAlertResponseBodyAlertConfigAlertConfig> alertConfig;

        public static DescribeCloudGtmGlobalAlertResponseBodyAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmGlobalAlertResponseBodyAlertConfig self = new DescribeCloudGtmGlobalAlertResponseBodyAlertConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmGlobalAlertResponseBodyAlertConfig setAlertConfig(java.util.List<DescribeCloudGtmGlobalAlertResponseBodyAlertConfigAlertConfig> alertConfig) {
            this.alertConfig = alertConfig;
            return this;
        }
        public java.util.List<DescribeCloudGtmGlobalAlertResponseBodyAlertConfigAlertConfig> getAlertConfig() {
            return this.alertConfig;
        }

    }

    public static class DescribeCloudGtmGlobalAlertResponseBodyAlertGroup extends TeaModel {
        @NameInMap("AlertGroup")
        public java.util.List<String> alertGroup;

        public static DescribeCloudGtmGlobalAlertResponseBodyAlertGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmGlobalAlertResponseBodyAlertGroup self = new DescribeCloudGtmGlobalAlertResponseBodyAlertGroup();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmGlobalAlertResponseBodyAlertGroup setAlertGroup(java.util.List<String> alertGroup) {
            this.alertGroup = alertGroup;
            return this;
        }
        public java.util.List<String> getAlertGroup() {
            return this.alertGroup;
        }

    }

}
