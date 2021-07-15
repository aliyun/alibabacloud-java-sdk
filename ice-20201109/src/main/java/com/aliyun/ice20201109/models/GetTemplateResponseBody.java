// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetTemplateResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

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
        // 模板ID
        @NameInMap("TemplateId")
        public String templateId;

        // 模板名称
        @NameInMap("Name")
        public String name;

        // 模板类型
        @NameInMap("Type")
        public String type;

        // 模板配置
        @NameInMap("Config")
        public String config;

        // 预览素材
        @NameInMap("PreviewMedia")
        public String previewMedia;

        // 模板状态
        @NameInMap("Status")
        public String status;

        // 创建来源
        @NameInMap("CreateSource")
        public String createSource;

        // 修改来源
        @NameInMap("ModifiedSource")
        public String modifiedSource;

        // 预览素材状态
        @NameInMap("PreviewMediaStatus")
        public String previewMediaStatus;

        // 创建时间
        @NameInMap("CreationTime")
        public String creationTime;

        // 修改时间
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        // 封面URL
        @NameInMap("CoverURL")
        public String coverURL;

        public static GetTemplateResponseBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateResponseBodyTemplate self = new GetTemplateResponseBodyTemplate();
            return TeaModel.build(map, self);
        }

        public GetTemplateResponseBodyTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetTemplateResponseBodyTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTemplateResponseBodyTemplate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetTemplateResponseBodyTemplate setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetTemplateResponseBodyTemplate setPreviewMedia(String previewMedia) {
            this.previewMedia = previewMedia;
            return this;
        }
        public String getPreviewMedia() {
            return this.previewMedia;
        }

        public GetTemplateResponseBodyTemplate setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTemplateResponseBodyTemplate setCreateSource(String createSource) {
            this.createSource = createSource;
            return this;
        }
        public String getCreateSource() {
            return this.createSource;
        }

        public GetTemplateResponseBodyTemplate setModifiedSource(String modifiedSource) {
            this.modifiedSource = modifiedSource;
            return this;
        }
        public String getModifiedSource() {
            return this.modifiedSource;
        }

        public GetTemplateResponseBodyTemplate setPreviewMediaStatus(String previewMediaStatus) {
            this.previewMediaStatus = previewMediaStatus;
            return this;
        }
        public String getPreviewMediaStatus() {
            return this.previewMediaStatus;
        }

        public GetTemplateResponseBodyTemplate setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetTemplateResponseBodyTemplate setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetTemplateResponseBodyTemplate setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

    }

}
