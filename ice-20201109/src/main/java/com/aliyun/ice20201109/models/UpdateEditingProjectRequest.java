// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateEditingProjectRequest extends TeaModel {
    @NameInMap("BusinessStatus")
    public String businessStatus;

    @NameInMap("ClipsParam")
    public String clipsParam;

    @NameInMap("CoverURL")
    public String coverURL;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("Timeline")
    public String timeline;

    @NameInMap("Title")
    public String title;

    public static UpdateEditingProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEditingProjectRequest self = new UpdateEditingProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEditingProjectRequest setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public UpdateEditingProjectRequest setClipsParam(String clipsParam) {
        this.clipsParam = clipsParam;
        return this;
    }
    public String getClipsParam() {
        return this.clipsParam;
    }

    public UpdateEditingProjectRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public UpdateEditingProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateEditingProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateEditingProjectRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateEditingProjectRequest setTimeline(String timeline) {
        this.timeline = timeline;
        return this;
    }
    public String getTimeline() {
        return this.timeline;
    }

    public UpdateEditingProjectRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
