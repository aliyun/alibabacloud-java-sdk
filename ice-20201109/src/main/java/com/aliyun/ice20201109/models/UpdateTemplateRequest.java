// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateTemplateRequest extends TeaModel {
    // 参见Timeline模板Config文档
    @NameInMap("Config")
    public String config;

    // 模板封面
    @NameInMap("CoverUrl")
    public String coverUrl;

    // 模板名称
    @NameInMap("Name")
    public String name;

    // 预览视频媒资id
    @NameInMap("PreviewMedia")
    public String previewMedia;

    // 修改来源，默认OpenAPI
    @NameInMap("Source")
    public String source;

    // 模板状态
    @NameInMap("Status")
    public String status;

    // 模板ID
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
