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
     * <p>The URL of the template thumbnail.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/cover.jpg">http://example-bucket.oss-cn-shanghai.aliyuncs.com/cover.jpg</a></p>
     */
    @NameInMap("CoverUrl")
    public String coverUrl;

    /**
     * <p>The name of the custom template.</p>
     * 
     * <strong>example:</strong>
     * <p>视频添加水印模板</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the template preview video.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>01bf24bf41c78b2754cb3187</strong></strong></p>
     */
    @NameInMap("PreviewMedia")
    public String previewMedia;

    /**
     * <p>The IDs of the materials associated with the template for use by the regular template editor.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;video&quot;:[&quot;1805a0c6ca544fb395a06ca683619655&quot;]}</p>
     */
    @NameInMap("RelatedMediaids")
    public String relatedMediaids;

    /**
     * <p>The source from which the template is created. Valid values:</p>
     * <ul>
     * <li>OpenAPI</li>
     * <li>AliyunConsole</li>
     * <li>WebSDK</li>
     * </ul>
     * <!---->
     * 
     * <strong>example:</strong>
     * <p>OpenAPI</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The template state. Valid values:</p>
     * <ul>
     * <li>Available: The template is available.</li>
     * <li>Created: The template is created but not ready for use.</li>
     * <li>Uploading: The video is being uploaded.</li>
     * <li>Processing: The advanced template is being processed.</li>
     * <li>UploadFailed: Failed to upload the video.</li>
     * <li>ProcessFailed: Failed to process the advanced template.</li>
     * </ul>
     * <!---->
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The template type. Valid values:</p>
     * <ul>
     * <li>Timeline: a regular template created based on the timeline of a video editing project, in which multiple materials are arranged in sequence across multiple layers. It can be used to convert text and images into videos, create photo albums, add opening and closing parts, and apply the default watermark.</li>
     * <li>VETemplate: an advanced template created using effects of Adobe After Effects (AE). It can be used to produce complex animations and advanced media effects.</li>
     * </ul>
     * <!---->
     * 
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
