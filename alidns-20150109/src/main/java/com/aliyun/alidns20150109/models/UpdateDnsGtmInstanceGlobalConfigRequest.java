// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsGtmInstanceGlobalConfigRequest extends TeaModel {
    /**
     * <p>The alert configurations.</p>
     */
    @NameInMap("AlertConfig")
    public java.util.List<UpdateDnsGtmInstanceGlobalConfigRequestAlertConfig> alertConfig;

    /**
     * <p>The alert contact group. The value is a JSON-formatted \<code>List\\&lt;string&gt;\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;test1&quot;,&quot;test2&quot;]</p>
     */
    @NameInMap("AlertGroup")
    public String alertGroup;

    /**
     * <p>The type of the CNAME record. Valid value:</p>
     * <ul>
     * <li>PUBLIC: The CNAME record is used for Internet access.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("CnameType")
    public String cnameType;

    /**
     * <p>Specifies whether to forcefully update the instance. Valid values:</p>
     * <ul>
     * <li><p>true: Forcefully updates the instance without checking for conflicts.</p>
     * </li>
     * <li><p>false or null: Does not forcefully update the instance. The system checks for conflicts before the update.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ForceUpdate")
    public Boolean forceUpdate;

    /**
     * <p>The ID of the GTM instance. To obtain the instance ID, call the <a href="https://www.alibabacloud.com/help/en/dns/api-alidns-2015-01-09-describednsgtminstances?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDnsGtmInstances</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gtm-cn-wwo3a3hbz**</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the instance. This parameter is required when you update the instance for the first time. It is optional for subsequent updates.</p>
     * 
     * <strong>example:</strong>
     * <p>test-1</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The language of the response. Valid values: en, zh, and ja. The default value is en.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The method used to access the instance over the Internet. Valid values:</p>
     * <ul>
     * <li><p>SYSTEM_ASSIGN: The system assigns a canonical name (CNAME) record. This option is disabled.</p>
     * </li>
     * <li><p>CUSTOM: You specify a CNAME record.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CUSTOM</p>
     */
    @NameInMap("PublicCnameMode")
    public String publicCnameMode;

    /**
     * <p>The hostname of the CNAME record that is used for Internet access.</p>
     * 
     * <strong>example:</strong>
     * <p>test.rr</p>
     */
    @NameInMap("PublicRr")
    public String publicRr;

    /**
     * <p>The service domain name that is accessed over the Internet.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("PublicUserDomainName")
    public String publicUserDomainName;

    /**
     * <p>The primary domain name that is used to access the instance over the Internet using a CNAME record. This parameter is required if you set PublicCnameMode to CUSTOM.</p>
     * <blockquote>
     * <p>Enter the primary domain name. Do not include the hostname specified by the PublicRr parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("PublicZoneName")
    public String publicZoneName;

    /**
     * <p>The global time to live (TTL).</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
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
        /**
         * <p>Specifies whether to send alerts through DingTalk. Valid values:</p>
         * <ul>
         * <li><p>true: yes</p>
         * </li>
         * <li><p>false: no</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DingtalkNotice")
        public Boolean dingtalkNotice;

        /**
         * <p>Specifies whether to send alerts by email. Valid values:</p>
         * <ul>
         * <li><p>true: yes</p>
         * </li>
         * <li><p>false or null: no</p>
         * </li>
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
         * <li><p>ADDR_ALERT: An address becomes unavailable.</p>
         * </li>
         * <li><p>ADDR_RESUME: An address becomes available.</p>
         * </li>
         * <li><p>ADDR_POOL_GROUP_UNAVAILABLE: An address pool group becomes unavailable.</p>
         * </li>
         * <li><p>ADDR_POOL_GROUP_AVAILABLE: An address pool group becomes available.</p>
         * </li>
         * <li><p>ACCESS_STRATEGY_POOL_GROUP_SWITCH: A switchover occurs between the primary and secondary address pools.</p>
         * </li>
         * <li><p>MONITOR_NODE_IP_CHANGE: The IP address of a monitoring node changes.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ADDR_ALERT</p>
         */
        @NameInMap("NoticeType")
        public String noticeType;

        /**
         * <p>Specifies whether to send alerts through text messages. Valid values:</p>
         * <ul>
         * <li><p>true: yes</p>
         * </li>
         * <li><p>false or null: no</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
