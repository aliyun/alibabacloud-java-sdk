// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmInstanceConfigAlertResponseBody extends TeaModel {
    @NameInMap("AlertConfig")
    public DescribeCloudGtmInstanceConfigAlertResponseBodyAlertConfig alertConfig;

    @NameInMap("AlertGroup")
    public DescribeCloudGtmInstanceConfigAlertResponseBodyAlertGroup alertGroup;

    @NameInMap("AlertMode")
    public String alertMode;

    @NameInMap("ConfigId")
    public String configId;

    @NameInMap("InstanceId")
    public String instanceId;

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
        @NameInMap("DingtalkNotice")
        public Boolean dingtalkNotice;

        @NameInMap("EmailNotice")
        public Boolean emailNotice;

        @NameInMap("NoticeType")
        public String noticeType;

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
