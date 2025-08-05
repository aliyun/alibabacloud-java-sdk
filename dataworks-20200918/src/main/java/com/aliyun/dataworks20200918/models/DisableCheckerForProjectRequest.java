// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class DisableCheckerForProjectRequest extends TeaModel {
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

    public static DisableCheckerForProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableCheckerForProjectRequest self = new DisableCheckerForProjectRequest();
        return TeaModel.build(map, self);
    }

    public DisableCheckerForProjectRequest setCheckerIdentifier(String checkerIdentifier) {
        this.checkerIdentifier = checkerIdentifier;
        return this;
    }
    public String getCheckerIdentifier() {
        return this.checkerIdentifier;
    }

    public DisableCheckerForProjectRequest setCheckerType(String checkerType) {
        this.checkerType = checkerType;
        return this;
    }
    public String getCheckerType() {
        return this.checkerType;
    }

    public DisableCheckerForProjectRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DisableCheckerForProjectRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

}
