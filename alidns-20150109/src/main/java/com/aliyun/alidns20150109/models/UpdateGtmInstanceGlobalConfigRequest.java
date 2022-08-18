// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmInstanceGlobalConfigRequest extends TeaModel {
    @NameInMap("AlertGroup")
    public String alertGroup;

    @NameInMap("CnameCustomDomainName")
    public String cnameCustomDomainName;

    @NameInMap("CnameMode")
    public String cnameMode;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("LbaStrategy")
    public String lbaStrategy;

    @NameInMap("Ttl")
    public Integer ttl;

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
