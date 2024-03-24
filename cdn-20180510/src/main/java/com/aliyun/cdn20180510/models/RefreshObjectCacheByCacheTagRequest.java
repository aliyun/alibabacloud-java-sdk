// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class RefreshObjectCacheByCacheTagRequest extends TeaModel {
    @NameInMap("CacheTag")
    public String cacheTag;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Force")
    public Boolean force;

    public static RefreshObjectCacheByCacheTagRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshObjectCacheByCacheTagRequest self = new RefreshObjectCacheByCacheTagRequest();
        return TeaModel.build(map, self);
    }

    public RefreshObjectCacheByCacheTagRequest setCacheTag(String cacheTag) {
        this.cacheTag = cacheTag;
        return this;
    }
    public String getCacheTag() {
        return this.cacheTag;
    }

    public RefreshObjectCacheByCacheTagRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public RefreshObjectCacheByCacheTagRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
