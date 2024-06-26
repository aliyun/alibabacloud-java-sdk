// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>参见模板Config文档</p>
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
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("PreviewMedia")
    public String previewMedia;

    /**
     * <strong>example:</strong>
     * <p>{&quot;video&quot;:[&quot;<strong><strong><strong>c04f1d4a06996144cc1a</strong></strong></strong>&quot;,&quot;<strong><strong><strong>cb7db64841b159b4f2ea</strong></strong></strong>&quot;],&quot;audio&quot;:[&quot;<strong><strong><strong>c04f1d4a06996144cc1a</strong></strong></strong>&quot;],&quot;image&quot;:[&quot;<strong><strong><strong>c04f1d4a06996144cc1a</strong></strong></strong>&quot;]}</p>
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
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static UpdateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateRequest self = new UpdateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateTemplateRequest setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }

    public UpdateTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTemplateRequest setPreviewMedia(String previewMedia) {
        this.previewMedia = previewMedia;
        return this;
    }
    public String getPreviewMedia() {
        return this.previewMedia;
    }

    public UpdateTemplateRequest setRelatedMediaids(String relatedMediaids) {
        this.relatedMediaids = relatedMediaids;
        return this;
    }
    public String getRelatedMediaids() {
        return this.relatedMediaids;
    }

    public UpdateTemplateRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public UpdateTemplateRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
