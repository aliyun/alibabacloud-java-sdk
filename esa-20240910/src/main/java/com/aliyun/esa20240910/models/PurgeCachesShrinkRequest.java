// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PurgeCachesShrinkRequest extends TeaModel {
    /**
     * <p>The refresh content.</p>
     */
    @NameInMap("Content")
    public String contentShrink;

    /**
     * <p>Specifies whether to refresh edge computing cached resources. For example, this allows refreshing content cached by the Edge Routine Cache API operation function.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EdgeComputePurge")
    public Boolean edgeComputePurge;

    /**
     * <p>Specifies whether to refresh all resources under the corresponding directory when the back-to-origin content is inconsistent with the origin server resources. Default value: false.</p>
     * <ul>
     * <li><strong>true</strong>: Refreshes all resources under the corresponding directory.</li>
     * <li><strong>false</strong>: Refreshes only the changed resources under the corresponding directory.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect for directory refresh, cache tag refresh, parameter-ignored refresh, hostname refresh, and full site cache refresh.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The type of the refresh node. Valid values:</p>
     * <ul>
     * <li><strong>file</strong> (default): file refresh.</li>
     * <li><strong>cachekey</strong>: cache key refresh.</li>
     * <li><strong>cachetag</strong>: cache label refresh.</li>
     * <li><strong>directory</strong>: folder refresh.</li>
     * <li><strong>ignoreParams</strong>: parameter-ignored refresh. This refers to removing the question mark (?) and all parameters after it from the request URL. When you commit a parameter-stripped URL through this API operation, the submitted URL is matched against cached resource URLs after their parameters are also stripped. If a cached resource URL matches the submitted URL after parameter stripping, the point of presence executes the refresh on the cached resource.</li>
     * <li><strong>hostname</strong>: hostname refresh.</li>
     * <li><strong>purgeall</strong>: refreshes all cached content under the site.</li>
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
