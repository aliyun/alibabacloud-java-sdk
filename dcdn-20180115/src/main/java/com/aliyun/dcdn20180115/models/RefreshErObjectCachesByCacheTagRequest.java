// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class RefreshErObjectCachesByCacheTagRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tag1,tag2</p>
     */
    @NameInMap("CacheTag")
    public String cacheTag;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <strong>example:</strong>
     * <p>a.test.com,b.test.com</p>
     */
    @NameInMap("MergeDomainName")
    public String mergeDomainName;

    public static RefreshErObjectCachesByCacheTagRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshErObjectCachesByCacheTagRequest self = new RefreshErObjectCachesByCacheTagRequest();
        return TeaModel.build(map, self);
    }

    public RefreshErObjectCachesByCacheTagRequest setCacheTag(String cacheTag) {
        this.cacheTag = cacheTag;
        return this;
    }
    public String getCacheTag() {
        return this.cacheTag;
    }

    public RefreshErObjectCachesByCacheTagRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public RefreshErObjectCachesByCacheTagRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public RefreshErObjectCachesByCacheTagRequest setMergeDomainName(String mergeDomainName) {
        this.mergeDomainName = mergeDomainName;
        return this;
    }
    public String getMergeDomainName() {
        return this.mergeDomainName;
    }

}
