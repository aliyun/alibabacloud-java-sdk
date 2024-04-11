// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class RefreshDcdnObjectCacheByCacheTagRequest extends TeaModel {
    @NameInMap("CacheTag")
    public String cacheTag;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Force")
    public Boolean force;

    public static RefreshDcdnObjectCacheByCacheTagRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshDcdnObjectCacheByCacheTagRequest self = new RefreshDcdnObjectCacheByCacheTagRequest();
        return TeaModel.build(map, self);
    }

    public RefreshDcdnObjectCacheByCacheTagRequest setCacheTag(String cacheTag) {
        this.cacheTag = cacheTag;
        return this;
    }
    public String getCacheTag() {
        return this.cacheTag;
    }

    public RefreshDcdnObjectCacheByCacheTagRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public RefreshDcdnObjectCacheByCacheTagRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
