// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DeleteVideoRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("SetId")
    public String setId;

    @NameInMap("VideoUri")
    public String videoUri;

    @NameInMap("Resources")
    public Boolean resources;

    public static DeleteVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVideoRequest self = new DeleteVideoRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVideoRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DeleteVideoRequest setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public DeleteVideoRequest setVideoUri(String videoUri) {
        this.videoUri = videoUri;
        return this;
    }
    public String getVideoUri() {
        return this.videoUri;
    }

    public DeleteVideoRequest setResources(Boolean resources) {
        this.resources = resources;
        return this;
    }
    public Boolean getResources() {
        return this.resources;
    }

}
