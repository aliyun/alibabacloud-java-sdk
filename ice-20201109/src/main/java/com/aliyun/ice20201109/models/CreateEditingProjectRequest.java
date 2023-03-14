// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateEditingProjectRequest extends TeaModel {
    @NameInMap("BusinessConfig")
    public String businessConfig;

    @NameInMap("ClipsParam")
    public String clipsParam;

    @NameInMap("CoverURL")
    public String coverURL;

    @NameInMap("Description")
    public String description;

    @NameInMap("MaterialMaps")
    public String materialMaps;

    @NameInMap("ProjectType")
    public String projectType;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateType")
    public String templateType;

    @NameInMap("Timeline")
    public String timeline;

    @NameInMap("Title")
    public String title;

    public static CreateEditingProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEditingProjectRequest self = new CreateEditingProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateEditingProjectRequest setBusinessConfig(String businessConfig) {
        this.businessConfig = businessConfig;
        return this;
    }
    public String getBusinessConfig() {
        return this.businessConfig;
    }

    public CreateEditingProjectRequest setClipsParam(String clipsParam) {
        this.clipsParam = clipsParam;
        return this;
    }
    public String getClipsParam() {
        return this.clipsParam;
    }

    public CreateEditingProjectRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public CreateEditingProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEditingProjectRequest setMaterialMaps(String materialMaps) {
        this.materialMaps = materialMaps;
        return this;
    }
    public String getMaterialMaps() {
        return this.materialMaps;
    }

    public CreateEditingProjectRequest setProjectType(String projectType) {
        this.projectType = projectType;
        return this;
    }
    public String getProjectType() {
        return this.projectType;
    }

    public CreateEditingProjectRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateEditingProjectRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public CreateEditingProjectRequest setTimeline(String timeline) {
        this.timeline = timeline;
        return this;
    }
    public String getTimeline() {
        return this.timeline;
    }

    public CreateEditingProjectRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
