// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetHttpHeaderConfigRequest extends TeaModel {
    @NameInMap("ConfigId")
    public Long configId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("HeaderKey")
    public String headerKey;

    @NameInMap("HeaderValue")
    public String headerValue;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static SetHttpHeaderConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetHttpHeaderConfigRequest self = new SetHttpHeaderConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetHttpHeaderConfigRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public SetHttpHeaderConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetHttpHeaderConfigRequest setHeaderKey(String headerKey) {
        this.headerKey = headerKey;
        return this;
    }
    public String getHeaderKey() {
        return this.headerKey;
    }

    public SetHttpHeaderConfigRequest setHeaderValue(String headerValue) {
        this.headerValue = headerValue;
        return this;
    }
    public String getHeaderValue() {
        return this.headerValue;
    }

    public SetHttpHeaderConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetHttpHeaderConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
