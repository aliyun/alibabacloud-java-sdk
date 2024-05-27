// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ChangeDomainOfDnsProductRequest extends TeaModel {
    /**
     * <p>Specifies whether to force bind a domain name to the instance.</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The ID of the Alibaba Cloud DNS instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language in which you want the values of some response parameters to be returned. These response parameters support multiple languages.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The domain name that you want to bind to the instance. If you do not specify this parameter, this operation unbinds the original domain name from the instance.</p>
     */
    @NameInMap("NewDomain")
    public String newDomain;

    /**
     * <p>The IP address of the client.</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static ChangeDomainOfDnsProductRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeDomainOfDnsProductRequest self = new ChangeDomainOfDnsProductRequest();
        return TeaModel.build(map, self);
    }

    public ChangeDomainOfDnsProductRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public ChangeDomainOfDnsProductRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ChangeDomainOfDnsProductRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ChangeDomainOfDnsProductRequest setNewDomain(String newDomain) {
        this.newDomain = newDomain;
        return this;
    }
    public String getNewDomain() {
        return this.newDomain;
    }

    public ChangeDomainOfDnsProductRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
