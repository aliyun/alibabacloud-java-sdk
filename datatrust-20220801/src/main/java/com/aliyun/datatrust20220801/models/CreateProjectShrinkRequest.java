// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class CreateProjectShrinkRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("MemberId")
    public Long memberId;

    @NameInMap("ProjectModeList")
    public String projectModeListShrink;

    @NameInMap("ProjectName")
    public String projectName;

    public static CreateProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectShrinkRequest self = new CreateProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProjectShrinkRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

    public CreateProjectShrinkRequest setProjectModeListShrink(String projectModeListShrink) {
        this.projectModeListShrink = projectModeListShrink;
        return this;
    }
    public String getProjectModeListShrink() {
        return this.projectModeListShrink;
    }

    public CreateProjectShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
