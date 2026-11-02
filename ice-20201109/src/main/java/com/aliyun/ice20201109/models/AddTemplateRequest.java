// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddTemplateRequest extends TeaModel {
    /**
     * <ul>
     * <li>The Config parameter for standard templates is an encapsulation based on the cloud editing timeline. Custom template configurations are more flexible. If you have special requirements, familiarize yourself with the Config structure and customize the template. For more information, see <a href="https://help.aliyun.com/document_detail/456193.html">Config details for standard templates</a>.</li>
     * <li>For more Config examples, see <a href="https://help.aliyun.com/document_detail/451634.html">Common Config examples for standard templates</a>.</li>
     * <li>For the Config settings of one-click video generation templates, see <a href="https://help.aliyun.com/document_detail/2878274.html">Metric description for one-click video generation template configuration</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>See Config documentation</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The URL of the template cover.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/cover.jpg">http://example-bucket.oss-cn-shanghai.aliyuncs.com/cover.jpg</a></p>
     */
    @NameInMap("CoverUrl")
    public String coverUrl;

    /**
     * <p>The name of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>TemplateName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The media asset ID of the template preview video.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>01bf24bf41c78b2754cb3187</strong></strong></p>
     */
    @NameInMap("PreviewMedia")
    public String previewMedia;

    /**
     * <p>The media assets associated with the template. This parameter is used by the standard template editor.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;video&quot;:[&quot;1805a0c6ca544fb395a06ca683619655&quot;]}</p>
     */
    @NameInMap("RelatedMediaids")
    public String relatedMediaids;

    /**
     * <p>The source from which the template is created. Valid values:</p>
     * <ul>
     * <li>OpenAPI: Created by calling an API operation.</li>
     * <li>AliyunConsole: Created in the Alibaba Cloud Management Console.</li>
     * <li>WebSDK: Created by using WebSDK.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OpenAPI</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The template status. Valid values:</p>
     * <ul>
     * <li>Available: Normal.</li>
     * <li>Created: Created but unavailable.</li>
     * <li>Uploading: Uploading.</li>
     * <li>Processing: Analyzing the advanced template.</li>
     * <li>UploadFailed: Upload failed.</li>
     * <li>ProcessFailed: Advanced template analysis failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The templatetype. Valid values:  </p>
     * <ul>
     * <li>Timeline: standard template. It is created based on the timeline of a video clip project, where multiple materials are spliced across multiple layers. It supports effects such as text-to-video, photo albums, intros and outros, and default watermarks.</li>
     * <li>VETemplate: advanced template. It is created based on Adobe After Effects (AE) effects to achieve advanced media effects with complex motion graphics.</li>
     * <li>BatchEditing: one-click video generation template. It supports parameters such as sticker watermarks, background music, background images, voiceover subtitle styles, title subtitle styles, and output resolution. These parameters are automatically applied when a one-click video generation node is committed.</li>
     * </ul>
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
