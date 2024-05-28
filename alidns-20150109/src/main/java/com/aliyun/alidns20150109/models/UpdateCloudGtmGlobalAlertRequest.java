// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmGlobalAlertRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AlertConfig")
    public java.util.List<UpdateCloudGtmGlobalAlertRequestAlertConfig> alertConfig;

    @NameInMap("AlertGroup")
    public java.util.List<String> alertGroup;

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
        @NameInMap("DingtalkNotice")
        public Boolean dingtalkNotice;

        @NameInMap("EmailNotice")
        public Boolean emailNotice;

        @NameInMap("NoticeType")
        public String noticeType;

        @NameInMap("SmsNotice")
        public Boolean smsNotice;

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

    }

}
