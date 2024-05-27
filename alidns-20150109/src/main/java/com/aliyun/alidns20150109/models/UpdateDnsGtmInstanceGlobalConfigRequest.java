// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsGtmInstanceGlobalConfigRequest extends TeaModel {
    @NameInMap("AlertConfig")
    public java.util.List<UpdateDnsGtmInstanceGlobalConfigRequestAlertConfig> alertConfig;

    /**
     * <p>The name of the alert group in the JSON format.</p>
     */
    @NameInMap("AlertGroup")
    public String alertGroup;

    /**
     * <p>The type of the canonical name (CNAME).</p>
     * <br>
     * <p>*   Set the value to PUBLIC.</p>
     */
    @NameInMap("CnameType")
    public String cnameType;

    /**
     * <p>Specifies whether to enable force updates. Valid values:</p>
     * <br>
     * <p>*   true: enables force update without a conflict alert.</p>
     * <p>*   false: disables force update. If a conflict occurs, the system displays an alert. null: This valid value of ForceUpdate provides the same information as the false value.</p>
     */
    @NameInMap("ForceUpdate")
    public Boolean forceUpdate;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the instance. This parameter is required only for the first update.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The language of the values of specific response parameters. Default value: en. Valid values: en, zh, and ja.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies whether to use a custom CNAME domain name or a CNAME domain name assigned by the system to access the instance over the Internet. Valid values:</p>
     * <br>
     * <p>*   SYSTEM_ASSIGN: a CNAME domain name assigned by the system</p>
     * <p>*   CUSTOM: a custom CNAME domain name</p>
     */
    @NameInMap("PublicCnameMode")
    public String publicCnameMode;

    /**
     * <p>The hostname corresponding to the CNAME domain name that is used to access the instance over the Internet.</p>
     */
    @NameInMap("PublicRr")
    public String publicRr;

    /**
     * <p>The service domain name that is used over the Internet.</p>
     */
    @NameInMap("PublicUserDomainName")
    public String publicUserDomainName;

    /**
     * <p>The CNAME domain name that is used to access the instance over the Internet, which is the primary domain name. This parameter is required when the PublicCnameMode parameter is set to CUSTOM.</p>
     * <br>
     * <p>>  You must use the primary domain name. Do not include the hostname specified by the PublicRr parameter.</p>
     */
    @NameInMap("PublicZoneName")
    public String publicZoneName;

    /**
     * <p>The global time to live (TTL).</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    public static UpdateDnsGtmInstanceGlobalConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsGtmInstanceGlobalConfigRequest self = new UpdateDnsGtmInstanceGlobalConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDnsGtmInstanceGlobalConfigRequest setAlertConfig(java.util.List<UpdateDnsGtmInstanceGlobalConfigRequestAlertConfig> alertConfig) {
        this.alertConfig = alertConfig;
        return this;
    }
    public java.util.List<UpdateDnsGtmInstanceGlobalConfigRequestAlertConfig> getAlertConfig() {
        return this.alertConfig;
    }

    public UpdateDnsGtmInstanceGlobalConfigRequest setAlertGroup(String alertGroup) {
        this.alertGroup = alertGroup;
        return this;
    }
    public String getAlertGroup() {
        return this.alertGroup;
    }

    public UpdateDnsGtmInstanceGlobalConfigRequest setCnameType(String cnameType) {
        this.cnameType = cnameType;
        return this;
    }
    public String getCnameType() {
        return this.cnameType;
    }

    public UpdateDnsGtmInstanceGlobalConfigRequest setForceUpdate(Boolean forceUpdate) {
        this.forceUpdate = forceUpdate;
        return this;
    }
    public Boolean getForceUpdate() {
        return this.forceUpdate;
    }

    public UpdateDnsGtmInstanceGlobalConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDnsGtmInstanceGlobalConfigRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateDnsGtmInstanceGlobalConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDnsGtmInstanceGlobalConfigRequest setPublicCnameMode(String publicCnameMode) {
        this.publicCnameMode = publicCnameMode;
        return this;
    }
    public String getPublicCnameMode() {
        return this.publicCnameMode;
    }

    public UpdateDnsGtmInstanceGlobalConfigRequest setPublicRr(String publicRr) {
        this.publicRr = publicRr;
        return this;
    }
    public String getPublicRr() {
        return this.publicRr;
    }

    public UpdateDnsGtmInstanceGlobalConfigRequest setPublicUserDomainName(String publicUserDomainName) {
        this.publicUserDomainName = publicUserDomainName;
        return this;
    }
    public String getPublicUserDomainName() {
        return this.publicUserDomainName;
    }

    public UpdateDnsGtmInstanceGlobalConfigRequest setPublicZoneName(String publicZoneName) {
        this.publicZoneName = publicZoneName;
        return this;
    }
    public String getPublicZoneName() {
        return this.publicZoneName;
    }

    public UpdateDnsGtmInstanceGlobalConfigRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public static class UpdateDnsGtmInstanceGlobalConfigRequestAlertConfig extends TeaModel {
        @NameInMap("DingtalkNotice")
        public Boolean dingtalkNotice;

        @NameInMap("EmailNotice")
        public Boolean emailNotice;

        @NameInMap("NoticeType")
        public String noticeType;

        @NameInMap("SmsNotice")
        public Boolean smsNotice;

        public static UpdateDnsGtmInstanceGlobalConfigRequestAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateDnsGtmInstanceGlobalConfigRequestAlertConfig self = new UpdateDnsGtmInstanceGlobalConfigRequestAlertConfig();
            return TeaModel.build(map, self);
        }

        public UpdateDnsGtmInstanceGlobalConfigRequestAlertConfig setDingtalkNotice(Boolean dingtalkNotice) {
            this.dingtalkNotice = dingtalkNotice;
            return this;
        }
        public Boolean getDingtalkNotice() {
            return this.dingtalkNotice;
        }

        public UpdateDnsGtmInstanceGlobalConfigRequestAlertConfig setEmailNotice(Boolean emailNotice) {
            this.emailNotice = emailNotice;
            return this;
        }
        public Boolean getEmailNotice() {
            return this.emailNotice;
        }

        public UpdateDnsGtmInstanceGlobalConfigRequestAlertConfig setNoticeType(String noticeType) {
            this.noticeType = noticeType;
            return this;
        }
        public String getNoticeType() {
            return this.noticeType;
        }

        public UpdateDnsGtmInstanceGlobalConfigRequestAlertConfig setSmsNotice(Boolean smsNotice) {
            this.smsNotice = smsNotice;
            return this;
        }
        public Boolean getSmsNotice() {
            return this.smsNotice;
        }

    }

}
