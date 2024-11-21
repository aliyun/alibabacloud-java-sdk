// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BlockObjectRequest extends TeaModel {
    /**
     * <p>The content to block.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Content")
    public java.util.List<String> content;

    /**
     * <p>The blocking period that you can extend. Set the value to 2year.</p>
     * 
     * <strong>example:</strong>
     * <p>2year</p>
     */
    @NameInMap("Extension")
    public String extension;

    /**
     * <p>The period of time during which the URL is blocked. Unit: seconds. Specify this parameter if Type is set to block.</p>
     * 
     * <strong>example:</strong>
     * <p>864000</p>
     */
    @NameInMap("Maxage")
    public Integer maxage;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BlockObject</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The type. Valid values:</p>
     * <ul>
     * <li><strong>block</strong></li>
     * <li><strong>unblock</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>block</p>
     */
    @NameInMap("Type")
    public String type;

    public static BlockObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        BlockObjectRequest self = new BlockObjectRequest();
        return TeaModel.build(map, self);
    }

    public BlockObjectRequest setContent(java.util.List<String> content) {
        this.content = content;
        return this;
    }
    public java.util.List<String> getContent() {
        return this.content;
    }

    public BlockObjectRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public BlockObjectRequest setMaxage(Integer maxage) {
        this.maxage = maxage;
        return this;
    }
    public Integer getMaxage() {
        return this.maxage;
    }

    public BlockObjectRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public BlockObjectRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
