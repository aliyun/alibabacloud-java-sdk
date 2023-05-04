// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetReqHeaderConfigRequest extends TeaModel {
    /**
     * <p>The ID of the configuration.</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The accelerated domain name. Separate multiple domain names with commas (,).</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The name of the custom header.</p>
     */
    @NameInMap("Key")
    public String key;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The value of the custom header.</p>
     */
    @NameInMap("Value")
    public String value;

    public static SetReqHeaderConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetReqHeaderConfigRequest self = new SetReqHeaderConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetReqHeaderConfigRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public SetReqHeaderConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetReqHeaderConfigRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public SetReqHeaderConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetReqHeaderConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SetReqHeaderConfigRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
