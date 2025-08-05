// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class EnableCheckerForProjectRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CheckerIdentifier")
    public String checkerIdentifier;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CheckerType")
    public String checkerType;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    public static EnableCheckerForProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableCheckerForProjectRequest self = new EnableCheckerForProjectRequest();
        return TeaModel.build(map, self);
    }

    public EnableCheckerForProjectRequest setCheckerIdentifier(String checkerIdentifier) {
        this.checkerIdentifier = checkerIdentifier;
        return this;
    }
    public String getCheckerIdentifier() {
        return this.checkerIdentifier;
    }

    public EnableCheckerForProjectRequest setCheckerType(String checkerType) {
        this.checkerType = checkerType;
        return this;
    }
    public String getCheckerType() {
        return this.checkerType;
    }

    public EnableCheckerForProjectRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public EnableCheckerForProjectRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

}
