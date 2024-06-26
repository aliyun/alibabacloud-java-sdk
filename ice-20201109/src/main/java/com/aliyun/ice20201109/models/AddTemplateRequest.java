// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>参见Timeline模板Config文档</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <strong>example:</strong>
     * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/cover.jpg">http://example-bucket.oss-cn-shanghai.aliyuncs.com/cover.jpg</a></p>
     */
    @NameInMap("CoverUrl")
    public String coverUrl;

    /**
     * <strong>example:</strong>
     * <p>视频添加水印模板</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>01bf24bf41c78b2754cb3187</strong></strong></p>
     */
    @NameInMap("PreviewMedia")
    public String previewMedia;

    /**
     * <strong>example:</strong>
     * <p>{&quot;video&quot;:[&quot;1805a0c6ca544fb395a06ca683619655&quot;]}</p>
     */
    @NameInMap("RelatedMediaids")
    public String relatedMediaids;

    /**
     * <strong>example:</strong>
     * <p>OpenAPI</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>Timeline</p>
     */
    @NameInMap("Type")
    public String type;

    public static AddTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTemplateRequest self = new AddTemplateRequest();
        return TeaModel.build(map, self);
    }

    public AddTemplateRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public AddTemplateRequest setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }

    public AddTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddTemplateRequest setPreviewMedia(String previewMedia) {
        this.previewMedia = previewMedia;
        return this;
    }
    public String getPreviewMedia() {
        return this.previewMedia;
    }

    public AddTemplateRequest setRelatedMediaids(String relatedMediaids) {
        this.relatedMediaids = relatedMediaids;
        return this;
    }
    public String getRelatedMediaids() {
        return this.relatedMediaids;
    }

    public AddTemplateRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public AddTemplateRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AddTemplateRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
