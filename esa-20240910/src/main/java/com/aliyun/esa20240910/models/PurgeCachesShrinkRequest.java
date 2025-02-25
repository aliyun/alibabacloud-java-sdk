// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PurgeCachesShrinkRequest extends TeaModel {
    /**
     * <p>Content to be refreshed.</p>
     */
    @NameInMap("Content")
    public String contentShrink;

    /**
     * <p>Used for refreshing cached resources in edge computing, such as allowing the refresh of content cached using the CacheAPI interface of an edge function.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EdgeComputePurge")
    public Boolean edgeComputePurge;

    /**
     * <p>Indicates whether to refresh all resources under the directory when the content from the origin and the source resource are inconsistent. The default is false.</p>
     * <ul>
     * <li><strong>true</strong>: Refreshes all resources under the specified directory.</li>
     * <li><strong>false</strong>: Refreshes only the changed resources under the specified directory.</li>
     * </ul>
     * <blockquote>
     * <p> Applies to: Directory refresh, cachetag refresh, ignoreParams refresh, hostname refresh, and purge all cache of the site.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The type of refresh task. Possible values:</p>
     * <ul>
     * <li><strong>file</strong> (default): File refresh.</li>
     * <li><strong>cachekey</strong>: Cachekey refresh.</li>
     * <li><strong>cachetag</strong>: Cachetag refresh.</li>
     * <li><strong>directory</strong>: Directory refresh.</li>
     * <li><strong>ignoreParams</strong>: Ignore parameters refresh. Ignoring parameters means removing the ? and everything after it in the request URL. When performing an ignore parameters refresh, the user first submits the URL without parameters through the interface. The submitted URLs to be refreshed will then be matched against the cached resource URLs with the parameters removed. If the cached resource URL, after removing the parameters, matches the URL to be refreshed, the CDN node will refresh the cached resources.</li>
     * <li><strong>hostname</strong>: Hostname refresh.</li>
     * <li><strong>purgeall</strong>: Purge all cache under the site.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>file</p>
     */
    @NameInMap("Type")
    public String type;

    public static PurgeCachesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PurgeCachesShrinkRequest self = new PurgeCachesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PurgeCachesShrinkRequest setContentShrink(String contentShrink) {
        this.contentShrink = contentShrink;
        return this;
    }
    public String getContentShrink() {
        return this.contentShrink;
    }

    public PurgeCachesShrinkRequest setEdgeComputePurge(Boolean edgeComputePurge) {
        this.edgeComputePurge = edgeComputePurge;
        return this;
    }
    public Boolean getEdgeComputePurge() {
        return this.edgeComputePurge;
    }

    public PurgeCachesShrinkRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public PurgeCachesShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public PurgeCachesShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
