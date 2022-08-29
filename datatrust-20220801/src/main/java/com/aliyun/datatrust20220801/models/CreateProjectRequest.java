// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("MemberId")
    public Long memberId;

    @NameInMap("ProjectModeList")
    public java.util.List<Integer> projectModeList;

    @NameInMap("ProjectName")
    public String projectName;

    public static CreateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectRequest self = new CreateProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProjectRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

    public CreateProjectRequest setProjectModeList(java.util.List<Integer> projectModeList) {
        this.projectModeList = projectModeList;
        return this;
    }
    public java.util.List<Integer> getProjectModeList() {
        return this.projectModeList;
    }

    public CreateProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
