// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class RefreshObjectCacheByCacheTagRequest extends TeaModel {
    /**
     * <p>The tags of Cache. If multiple tags are returned, the tags are separated by commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tag1,tag2</p>
     */
    @NameInMap("CacheTag")
    public String cacheTag;

    /**
     * <p>The accelerated domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Specifies whether to purge all resources that you submit if the requested content is one of the resources that you submit to purge. Default value: false.</p>
     * <ul>
     * <li><strong>true</strong>: The nearest POP fetches all resources from the origin server, delivers them to the client, and updates the cache with the new version.</li>
     * <li><strong>false</strong>: The nearest POP checks the Last-Modified parameter of the resource on the origin server. If the parameter value is the same as that of the cached resource, the POP serves the cached resource. If the parameter value is not the same as that of the cached resource, the POP fetches the latest version from the origin server, delivers it to the client, and updates the cache with the new version.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
