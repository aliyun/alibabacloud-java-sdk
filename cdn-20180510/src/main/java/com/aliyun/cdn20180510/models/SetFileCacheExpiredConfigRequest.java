// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetFileCacheExpiredConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("CacheContent")
    public String cacheContent;

    @NameInMap("TTL")
    public String TTL;

    @NameInMap("Weight")
    public String weight;

    public static SetFileCacheExpiredConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetFileCacheExpiredConfigRequest self = new SetFileCacheExpiredConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetFileCacheExpiredConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetFileCacheExpiredConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SetFileCacheExpiredConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetFileCacheExpiredConfigRequest setCacheContent(String cacheContent) {
        this.cacheContent = cacheContent;
        return this;
    }
    public String getCacheContent() {
        return this.cacheContent;
    }

    public SetFileCacheExpiredConfigRequest setTTL(String TTL) {
        this.TTL = TTL;
        return this;
    }
    public String getTTL() {
        return this.TTL;
    }

    public SetFileCacheExpiredConfigRequest setWeight(String weight) {
        this.weight = weight;
        return this;
    }
    public String getWeight() {
        return this.weight;
    }

}
