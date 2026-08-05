// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddTemplateRequest extends TeaModel {
    /**
     * <ul>
     * <li>The standard template Config is an encapsulation based on the cloud editing Timeline. Custom template Config provides more flexibility. If you have special requirements, familiarize yourself with the Config structure and customize the template. For details, see <a href="https://help.aliyun.com/document_detail/456193.html">Standard template Config details</a>.</li>
     * <li>For more template Config examples, see <a href="https://help.aliyun.com/document_detail/451634.html">Common standard template Config examples</a>.</li>
     * <li>For one-click video production template Config configurations, see <a href="https://help.aliyun.com/document_detail/2878274.html">One-click video production template configuration parameter description</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>See the Timeline template Config documentation</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The template cover URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/cover.jpg">http://example-bucket.oss-cn-shanghai.aliyuncs.com/cover.jpg</a></p>
     */
    @NameInMap("CoverUrl")
    public String coverUrl;

    /**
     * <p>The custom template name.</p>
     * 
     * <strong>example:</strong>
     * <p>Template name</p>
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
     * <p>The media assets associated with the template, used by the standard template editor.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;video&quot;:[&quot;1805a0c6ca544fb395a06ca683619655&quot;]}</p>
     */
    @NameInMap("RelatedMediaids")
    public String relatedMediaids;

    /**
     * <p>The template creation source. Valid values:</p>
     * <ul>
     * <li>OpenAPI: created by using OpenAPI.</li>
     * <li>AliyunConsole: created by using the Alibaba Cloud Management Console.</li>
     * <li>WebSDK: created by using WebSDK.</li>
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
     * <li>Available: normal.</li>
     * <li>Created: created but not yet available.</li>
     * <li>Uploading: uploading.</li>
     * <li>Processing: advanced template is being analyzed.</li>
     * <li>UploadFailed: upload failed.</li>
     * <li>ProcessFailed: advanced template analysis failed.</li>
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
     * <li>Timeline (standard template): a template created based on the Timeline of a video clip node (multiple materials on multiple tracks are concatenated in sequence). This templatetype can be used to implement effects such as image-to-video conversion, photo albums, intros and outros, and default watermarks.</li>
     * <li>VETemplate (advanced template): a template created based on Adobe After Effects (AE) effects. This templatetype can be used to implement advanced media effects with complex animations.</li>
     * <li>BatchEditing (one-click video production template): supports configurations for sticker watermarks, background music, background images, narration subtitle styles, title subtitle styles, and output resolution parameters. These configurations are automatically applied when you commit a one-click video production node.</li>
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
