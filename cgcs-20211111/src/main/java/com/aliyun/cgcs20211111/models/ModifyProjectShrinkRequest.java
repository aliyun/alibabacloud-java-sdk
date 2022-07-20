// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ModifyProjectShrinkRequest extends TeaModel {
    @NameInMap("BoundAppIdList")
    public String boundAppIdListShrink;

    // 请求操作人Id
    @NameInMap("OperatorId")
    public String operatorId;

    // 请求操作人类型
    @NameInMap("OperatorType")
    public String operatorType;

    // project Id
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ProjectMemo")
    public String projectMemo;

    // project name
    @NameInMap("ProjectName")
    public String projectName;

    // key : districtId
    @NameInMap("ProjectQuotaLimit")
    public String projectQuotaLimitShrink;

    public static ModifyProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyProjectShrinkRequest self = new ModifyProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyProjectShrinkRequest setBoundAppIdListShrink(String boundAppIdListShrink) {
        this.boundAppIdListShrink = boundAppIdListShrink;
        return this;
    }
    public String getBoundAppIdListShrink() {
        return this.boundAppIdListShrink;
    }

    public ModifyProjectShrinkRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public ModifyProjectShrinkRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public ModifyProjectShrinkRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ModifyProjectShrinkRequest setProjectMemo(String projectMemo) {
        this.projectMemo = projectMemo;
        return this;
    }
    public String getProjectMemo() {
        return this.projectMemo;
    }

    public ModifyProjectShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ModifyProjectShrinkRequest setProjectQuotaLimitShrink(String projectQuotaLimitShrink) {
        this.projectQuotaLimitShrink = projectQuotaLimitShrink;
        return this;
    }
    public String getProjectQuotaLimitShrink() {
        return this.projectQuotaLimitShrink;
    }

}
