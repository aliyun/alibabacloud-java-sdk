// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateTemplateRequest extends TeaModel {
    /**
     * <p>The template configuration. For more information, see <a href="https://help.aliyun.com/document_detail/456193.html">Common template configuration details</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;VideoTracks&quot;: [
     *         {
     *             &quot;VideoTrackClips&quot;: [
     *                 {
     *                     &quot;Sys_Type&quot; : &quot;ArrayItems&quot;,
     *                     &quot;Sys_ArrayObject&quot; : &quot;$VideoArray&quot;,
     *                     &quot;Sys_Template&quot; : {
     *                         &quot;MediaId&quot; : &quot;$MediaId&quot;
     *                     }
     *                 }
     *             ]
     *         }
     *     ]
     * }</p>
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
     * <p>The name of the cloud editing template.</p>
     * 
     * <strong>example:</strong>
     * <p>Cloud Clip Template 1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the preview video media asset.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae320b48fb04483915d4f2cd8ac****</p>
     */
    @NameInMap("PreviewMedia")
    public String previewMedia;

    /**
     * <p>The media assets associated with the template, used by the common template editor.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;video&quot;:[&quot;f64c6acc840247edb6b12f575c66****&quot;,&quot;9675dcf040ba4525bb037c29d156****&quot;],&quot;audio&quot;:[&quot;62a54019d9114009a5ae9bcfd70b****&quot;],&quot;image&quot;:[&quot;743ffbeb7e004c758cdc1fb34c04****&quot;]}</p>
     */
    @NameInMap("RelatedMediaids")
    public String relatedMediaids;

    /**
     * <p>The update source. Default value: OpenAPI. Valid values:</p>
     * <ul>
     * <li>AliyunConsole: Created through the Alibaba Cloud Management Console.</li>
     * <li>OpenAPI: Created through OpenAPI.</li>
     * <li>WebSDK: Created through WebSDK.</li>
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
     * <blockquote>
     * <p>After an advanced template is created, it requires analysis time and its status is Processing. The template is unavailable during this period and can only be used when its status changes to Available. The analysis time depends on the template file size and typically ranges from 10 seconds to 5 minutes.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the cloud editing template. You can obtain the ID from the <a href="https://ice.console.aliyun.com/production/template/list/common">Intelligent Media Services console</a> or the response parameters of the <a href="https://help.aliyun.com/document_detail/441161.html">CreateTemplate</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>23923ec3318f4c359e42e1e5b296****</p>
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
