// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ChangeDomainOfDnsProductRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("NewDomain")
    public String newDomain;

    @NameInMap("Force")
    public Boolean force;

    public static ChangeDomainOfDnsProductRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeDomainOfDnsProductRequest self = new ChangeDomainOfDnsProductRequest();
        return TeaModel.build(map, self);
    }

    public ChangeDomainOfDnsProductRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ChangeDomainOfDnsProductRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public ChangeDomainOfDnsProductRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ChangeDomainOfDnsProductRequest setNewDomain(String newDomain) {
        this.newDomain = newDomain;
        return this;
    }
    public String getNewDomain() {
        return this.newDomain;
    }

    public ChangeDomainOfDnsProductRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
