// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmGlobalAlertResponseBody extends TeaModel {
    @NameInMap("AlertConfig")
    public DescribeCloudGtmGlobalAlertResponseBodyAlertConfig alertConfig;

    @NameInMap("AlertGroup")
    public DescribeCloudGtmGlobalAlertResponseBodyAlertGroup alertGroup;

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
        @NameInMap("DingtalkNotice")
        public Boolean dingtalkNotice;

        @NameInMap("EmailNotice")
        public Boolean emailNotice;

        @NameInMap("NoticeType")
        public String noticeType;

        @NameInMap("SmsNotice")
        public Boolean smsNotice;

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
