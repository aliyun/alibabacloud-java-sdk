// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetTemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The template information.</p>
     */
    @NameInMap("Template")
    public GetTemplateResponseBodyTemplate template;

    public static GetTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateResponseBody self = new GetTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateResponseBody setTemplate(GetTemplateResponseBodyTemplate template) {
        this.template = template;
        return this;
    }
    public GetTemplateResponseBodyTemplate getTemplate() {
        return this.template;
    }

    public static class GetTemplateResponseBodyTemplate extends TeaModel {
        /**
         * <p>The ClipsParam parameter template for submitting a synthesis task. You can replace mediaId and text with actual parameters to submit the synthesis task. For usage methods, refer to:</p>
         * <ul>
         * <li><a href="https://help.aliyun.com/document_detail/445399.html">Create and use standard templates</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/445389.html">Create and use advanced templates</a></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Media1&quot;:&quot;mediaId&quot;,&quot;Text1&quot;:&quot;text&quot;}</p>
         */
        @NameInMap("ClipsParam")
        public String clipsParam;

        /**
         * <p>The template configuration.</p>
         * <ul>
         * <li>For standard template configuration, refer to <a href="https://help.aliyun.com/document_detail/456193.html">Timeline template configuration details</a>.</li>
         * <li>For advanced template configuration, refer to <a href="https://help.aliyun.com/document_detail/445389.html">Create advanced templates</a>.</li>
         * <li>For one-click video production template configuration, refer to <a href="https://help.aliyun.com/document_detail/2878274.html">One-click video production template configuration parameter description</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Refer to Timeline template configuration details</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The cover URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/cover.jpg">http://example-bucket.oss-cn-shanghai.aliyuncs.com/cover.jpg</a></p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The creation source. Valid values:</p>
         * <ul>
         * <li>AliyunConsole    </li>
         * <li>OpenAPI</li>
         * <li>WebSDK</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI</p>
         */
        @NameInMap("CreateSource")
        public String createSource;

        /**
         * <p>The creation time. The time is in the ISO 8601 format and uses UTC (ending with Z).</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-26T04:11:10Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The modification source. Valid values:</p>
         * <ul>
         * <li>AliyunConsole    </li>
         * <li>OpenAPI</li>
         * <li>WebSDK</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI</p>
         */
        @NameInMap("ModifiedSource")
        public String modifiedSource;

        /**
         * <p>The modification time. The time is in the ISO 8601 format and uses UTC (ending with Z).</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-26T04:11:10Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>Video watermark template</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The preview media asset.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        @NameInMap("PreviewMedia")
        public String previewMedia;

        /**
         * <p>The preview media asset status. Valid values:</p>
         * <ul>
         * <li>Init (initial status: the source file is not ready)</li>
         * <li>Preparing (the source file is being prepared, such as being uploaded or undergoing editing and synthesis)</li>
         * <li>PrepareFail (the source file preparation failed, such as a failure to obtain the source file information)</li>
         * <li>Normal (normal: the source file is ready)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("PreviewMediaStatus")
        public String previewMediaStatus;

        /**
         * <p>The media assets associated with the template. Used by the standard template editor.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;video&quot;:[&quot;<strong><strong><strong>c04f1d4a06996144cc1a</strong></strong></strong>&quot;],&quot;audio&quot;:[&quot;<strong><strong><strong>c04f1d4a06996144cc1a</strong></strong></strong>&quot;],&quot;image&quot;:[&quot;<strong><strong><strong>c04f1d4a06996144cc1a</strong></strong></strong>&quot;]}</p>
         */
        @NameInMap("RelatedMediaids")
        public String relatedMediaids;

        /**
         * <p>The template status. Valid values:</p>
         * <ul>
         * <li>Available</li>
         * <li>Created</li>
         * <li>Uploading</li>
         * <li>Processing</li>
         * <li>UploadFailed</li>
         * <li>ProcessFailed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The templatetype. Valid values:</p>
         * <ul>
         * <li>Timeline: standard template</li>
         * <li>VETemplate: advanced template</li>
         * <li>BatchEditing: one-click video production template</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Timeline</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetTemplateResponseBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateResponseBodyTemplate self = new GetTemplateResponseBodyTemplate();
            return TeaModel.build(map, self);
        }

        public GetTemplateResponseBodyTemplate setClipsParam(String clipsParam) {
            this.clipsParam = clipsParam;
            return this;
        }
        public String getClipsParam() {
            return this.clipsParam;
        }

        public GetTemplateResponseBodyTemplate setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetTemplateResponseBodyTemplate setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public GetTemplateResponseBodyTemplate setCreateSource(String createSource) {
            this.createSource = createSource;
            return this;
        }
        public String getCreateSource() {
            return this.createSource;
        }

        public GetTemplateResponseBodyTemplate setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetTemplateResponseBodyTemplate setModifiedSource(String modifiedSource) {
            this.modifiedSource = modifiedSource;
            return this;
        }
        public String getModifiedSource() {
            return this.modifiedSource;
        }

        public GetTemplateResponseBodyTemplate setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetTemplateResponseBodyTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTemplateResponseBodyTemplate setPreviewMedia(String previewMedia) {
            this.previewMedia = previewMedia;
            return this;
        }
        public String getPreviewMedia() {
            return this.previewMedia;
        }

        public GetTemplateResponseBodyTemplate setPreviewMediaStatus(String previewMediaStatus) {
            this.previewMediaStatus = previewMediaStatus;
            return this;
        }
        public String getPreviewMediaStatus() {
            return this.previewMediaStatus;
        }

        public GetTemplateResponseBodyTemplate setRelatedMediaids(String relatedMediaids) {
            this.relatedMediaids = relatedMediaids;
            return this;
        }
        public String getRelatedMediaids() {
            return this.relatedMediaids;
        }

        public GetTemplateResponseBodyTemplate setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTemplateResponseBodyTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetTemplateResponseBodyTemplate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
