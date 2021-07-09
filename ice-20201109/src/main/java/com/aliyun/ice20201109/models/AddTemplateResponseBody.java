// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddTemplateResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Config")
        public String config;

        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("PreviewMedia")
        public String previewMedia;

        @NameInMap("Status")
        public String status;

        @NameInMap("CreateSource")
        public String createSource;

        @NameInMap("ModifiedSource")
        public String modifiedSource;

        public static AddTemplateResponseBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            AddTemplateResponseBodyTemplate self = new AddTemplateResponseBodyTemplate();
            return TeaModel.build(map, self);
        }

        public AddTemplateResponseBodyTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public AddTemplateResponseBodyTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddTemplateResponseBodyTemplate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

    }

}
