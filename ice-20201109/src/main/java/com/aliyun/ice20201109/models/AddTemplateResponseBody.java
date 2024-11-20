// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddTemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>2876-6263-4B75-8F2C-CD0F7FCF</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The template information.</p>
     */
    @NameInMap("Template")
    public AddTemplateResponseBodyTemplate template;

    public static AddTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddTemplateResponseBody self = new AddTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public AddTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddTemplateResponseBody setTemplate(AddTemplateResponseBodyTemplate template) {
        this.template = template;
        return this;
    }
    public AddTemplateResponseBodyTemplate getTemplate() {
        return this.template;
    }

    public static class AddTemplateResponseBodyTemplate extends TeaModel {
        /**
         * <p>The template configurations.</p>
         * 
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
         * <p>The source from which the template was created.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>AliyunConsole</li>
         * <li>WebSDK</li>
         * <li>OpenAPI</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI</p>
         */
        @NameInMap("CreateSource")
        public String createSource;

        /**
         * <p>The source from which the template was modified.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>AliyunConsole</li>
         * <li>WebSDK</li>
         * <li>OpenAPI</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI</p>
         */
        @NameInMap("ModifiedSource")
        public String modifiedSource;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>视频添加水印模板</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the preview video.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>01bf24bf41c78b2754cb3187</strong></strong></p>
         */
        @NameInMap("PreviewMedia")
        public String previewMedia;

        /**
         * <p>The template state.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>UploadFailed: Failed to upload the video.</li>
         * <li>ProcessFailed: Failed to process the advanced template.</li>
         * <li>Available: The template is available.</li>
         * <li>Uploading: The video is being uploaded.</li>
         * <li>Created: The template is created but not ready for use.</li>
         * <li>Processing: The advanced template is being processed.</li>
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
         * <p><strong><strong>01bf24bf41c78b2754cb3187</strong></strong></p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The template type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Timeline: regular template.</li>
         * <li>VETemplate: advanced template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Timeline</p>
         */
        @NameInMap("Type")
        public String type;

        public static AddTemplateResponseBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            AddTemplateResponseBodyTemplate self = new AddTemplateResponseBodyTemplate();
            return TeaModel.build(map, self);
        }

        public AddTemplateResponseBodyTemplate setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public AddTemplateResponseBodyTemplate setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public AddTemplateResponseBodyTemplate setCreateSource(String createSource) {
            this.createSource = createSource;
            return this;
        }
        public String getCreateSource() {
            return this.createSource;
        }

        public AddTemplateResponseBodyTemplate setModifiedSource(String modifiedSource) {
            this.modifiedSource = modifiedSource;
            return this;
        }
        public String getModifiedSource() {
            return this.modifiedSource;
        }

        public AddTemplateResponseBodyTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddTemplateResponseBodyTemplate setPreviewMedia(String previewMedia) {
            this.previewMedia = previewMedia;
            return this;
        }
        public String getPreviewMedia() {
            return this.previewMedia;
        }

        public AddTemplateResponseBodyTemplate setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public AddTemplateResponseBodyTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public AddTemplateResponseBodyTemplate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
