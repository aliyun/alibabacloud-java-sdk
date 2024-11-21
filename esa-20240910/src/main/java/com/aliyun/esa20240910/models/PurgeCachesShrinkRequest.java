// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PurgeCachesShrinkRequest extends TeaModel {
    /**
     * <p>The content to purge.</p>
     */
    @NameInMap("Content")
    public String contentShrink;

    /**
     * <p>Specifies whether to purge cached resources for edge computing. For example, purge the resources cached by the CacheAPI operation of Edge Routine.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EdgeComputePurge")
    public Boolean edgeComputePurge;

    /**
     * <p>Specifies whether to purge resources in a directory if the resources requested are different from the resources on the origin server. Default value: false.</p>
     * <ul>
     * <li><strong>true</strong>: purges all resources in the directory.</li>
     * <li><strong>false</strong>: purges only changed resources in the directory.</li>
     * </ul>
     * <blockquote>
     * <p> This configuration takes effect for the following purge task types: directory, cachetag, ignoreParams, hostname, and purgeall.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The website ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The type of the purge task. Valid values:</p>
     * <ul>
     * <li><strong>file</strong> (default): purges the cache by file.</li>
     * <li><strong>cachetag</strong>: purges the cache by cache tag.</li>
     * <li><strong>directory</strong>: purges the cache by directory.</li>
     * <li><strong>ignoreParams</strong>: purges the cache by URL with specific parameters ignored. This option ignores the question mark (?) and parameters after the question mark (?) in a request URL and purges the cache. After you call this operation with the request URL submitted, the system compares the submitted URL with the URL of the cached resource without specified parameters. If the URLs match, the POPs purge the cached resources.</li>
     * <li><strong>hostname</strong>: purges the cache by hostname.</li>
     * <li><strong>purgeall</strong>: purges all cache.</li>
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
