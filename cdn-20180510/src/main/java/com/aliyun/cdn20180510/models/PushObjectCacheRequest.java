// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class PushObjectCacheRequest extends TeaModel {
    /**
     * <p>The acceleration region where content is to be prefetched. Valid values:</p>
     * <ul>
     * <li><strong>domestic</strong><strong>: Chinese mainland</strong></li>
     * <li><strong>overseas</strong><strong>: regions outside the Chinese mainland</strong></li>
     * </ul>
     * <p>If you do not set this parameter, content in the service location (specified by parameter Coverage) that you configured for the domain is prefetched. Content is prefetched based on the following rules:</p>
     * <ul>
     * <li>If the acceleration region is set to <strong>Chinese Mainland Only</strong>, content in regions in the Chinese mainland is prefetched.</li>
     * <li>If the acceleration region is set to <strong>Global</strong>, content in all regions is prefetched.</li>
     * <li>If the acceleration region is set to <strong>Global (Excluding the Chinese Mainland)</strong>, content in regions outside the Chinese mainland is prefetched.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>domestic</p>
     */
    @NameInMap("Area")
    public String area;

    /**
     * <p>Specifies whether to prefetch content to L2 points of presence (POPs). Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: prefetches content to L2 POPs.</li>
     * <li><strong>false</strong>: prefetches content to regular POPs. Regular POPs can be L2 POPs or L3 POPs. Default value: <strong>false</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("L2Preload")
    public Boolean l2Preload;

    /**
     * <p>The URLs based on which content is prefetched. Format: <strong>accelerated domain name/files to be prefetched</strong>.</p>
     * <blockquote>
     * <p>Separate URLs with line feeds (\n or \r\n). Each object path can be up to 1,024 characters in length.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com/image/1.png\nexample.org/image/2.png</p>
     */
    @NameInMap("ObjectPath")
    public String objectPath;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter specifies whether to enable the hash key query mode when you run a prefetch task. Valid values:</p>
     * <ul>
     * <li>false: The default mode, in which the submitted URL is used as the hash key for the prefetch.</li>
     * <li>true: In this mode, the actual hash key used for the prefetch is queried based on the configuration of the domain name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("QueryHashkey")
    public Boolean queryHashkey;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The custom header for prefetch in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;Accept-Encoding&quot;: [
     *             &quot;gzip&quot;
     *       ]
     * }</p>
     */
    @NameInMap("WithHeader")
    public String withHeader;

    public static PushObjectCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        PushObjectCacheRequest self = new PushObjectCacheRequest();
        return TeaModel.build(map, self);
    }

    public PushObjectCacheRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public PushObjectCacheRequest setL2Preload(Boolean l2Preload) {
        this.l2Preload = l2Preload;
        return this;
    }
    public Boolean getL2Preload() {
        return this.l2Preload;
    }

    public PushObjectCacheRequest setObjectPath(String objectPath) {
        this.objectPath = objectPath;
        return this;
    }
    public String getObjectPath() {
        return this.objectPath;
    }

    public PushObjectCacheRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public PushObjectCacheRequest setQueryHashkey(Boolean queryHashkey) {
        this.queryHashkey = queryHashkey;
        return this;
    }
    public Boolean getQueryHashkey() {
        return this.queryHashkey;
    }

    public PushObjectCacheRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public PushObjectCacheRequest setWithHeader(String withHeader) {
        this.withHeader = withHeader;
        return this;
    }
    public String getWithHeader() {
        return this.withHeader;
    }

}
