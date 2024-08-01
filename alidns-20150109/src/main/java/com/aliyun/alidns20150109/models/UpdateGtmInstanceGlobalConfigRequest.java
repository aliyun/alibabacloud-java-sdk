// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmInstanceGlobalConfigRequest extends TeaModel {
    /**
     * <p>The alert group. Only one alert group is supported.</p>
     * <blockquote>
     * <p> This parameter is required only for the first modification.</p>
     * </blockquote>
     */
    @NameInMap("AlertGroup")
    public String alertGroup;

    /**
     * <p>If you set <strong>CnameMode</strong> to <strong>CUSTOM</strong>, you must specify the CnameCustomDomainName parameter, which must be set to a primary domain name.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("CnameCustomDomainName")
    public String cnameCustomDomainName;

    /**
     * <p>Specifies whether to use a system-assigned canonical name (CNAME) or a custom CNAME to access GTM. Valid values:</p>
     * <ul>
     * <li><strong>SYSTEM_ASSIGN</strong>: system-assigned CNAME</li>
     * <li><strong>CUSTOM</strong>: custom CNAME</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ASSIGN</p>
     */
    @NameInMap("CnameMode")
    public String cnameMode;

    /**
     * <p>The ID of the GTM instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instance1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the GTM instance.</p>
     * <blockquote>
     * <p> This parameter is required only for the first modification.</p>
     * </blockquote>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The balancing policy. Valid values:</p>
     * <ul>
     * <li><strong>ALL_RR</strong>: load balancing</li>
     * <li><strong>RATIO</strong>: weighted round-robin</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required only for the first modification.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>RATIO</p>
     */
    @NameInMap("LbaStrategy")
    public String lbaStrategy;

    /**
     * <p>The global time-to-live (TTL).</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <p>The primary domain name.</p>
     * <blockquote>
     * <p> This parameter is required only for the first modification.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("UserDomainName")
    public String userDomainName;

    public static UpdateGtmInstanceGlobalConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGtmInstanceGlobalConfigRequest self = new UpdateGtmInstanceGlobalConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGtmInstanceGlobalConfigRequest setAlertGroup(String alertGroup) {
        this.alertGroup = alertGroup;
        return this;
    }
    public String getAlertGroup() {
        return this.alertGroup;
    }

    public UpdateGtmInstanceGlobalConfigRequest setCnameCustomDomainName(String cnameCustomDomainName) {
        this.cnameCustomDomainName = cnameCustomDomainName;
        return this;
    }
    public String getCnameCustomDomainName() {
        return this.cnameCustomDomainName;
    }

    public UpdateGtmInstanceGlobalConfigRequest setCnameMode(String cnameMode) {
        this.cnameMode = cnameMode;
        return this;
    }
    public String getCnameMode() {
        return this.cnameMode;
    }

    public UpdateGtmInstanceGlobalConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateGtmInstanceGlobalConfigRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateGtmInstanceGlobalConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateGtmInstanceGlobalConfigRequest setLbaStrategy(String lbaStrategy) {
        this.lbaStrategy = lbaStrategy;
        return this;
    }
    public String getLbaStrategy() {
        return this.lbaStrategy;
    }

    public UpdateGtmInstanceGlobalConfigRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public UpdateGtmInstanceGlobalConfigRequest setUserDomainName(String userDomainName) {
        this.userDomainName = userDomainName;
        return this;
    }
    public String getUserDomainName() {
        return this.userDomainName;
    }

}
