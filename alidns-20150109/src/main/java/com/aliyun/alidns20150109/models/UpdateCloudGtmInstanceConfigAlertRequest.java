// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmInstanceConfigAlertRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AlertConfig")
    public java.util.List<UpdateCloudGtmInstanceConfigAlertRequestAlertConfig> alertConfig;

    @NameInMap("AlertGroup")
    public java.util.List<String> alertGroup;

    @NameInMap("AlertMode")
    public String alertMode;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConfigId")
    public String configId;

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
        @NameInMap("DingtalkNotice")
        public Boolean dingtalkNotice;

        @NameInMap("EmailNotice")
        public Boolean emailNotice;

        @NameInMap("NoticeType")
        public String noticeType;

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
