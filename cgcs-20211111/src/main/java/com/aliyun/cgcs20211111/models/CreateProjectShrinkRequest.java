// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateProjectShrinkRequest extends TeaModel {
    @NameInMap("BoundAppIdList")
    public String boundAppIdListShrink;

    // 请求操作人Id
    @NameInMap("OperatorId")
    public String operatorId;

    // 请求操作人类型
    @NameInMap("OperatorType")
    public String operatorType;

    @NameInMap("ProjectMemo")
    public String projectMemo;

    // project name
    @NameInMap("ProjectName")
    public String projectName;

    // key : districtId
    @NameInMap("ProjectQuotaLimit")
    public String projectQuotaLimitShrink;

    public static CreateProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectShrinkRequest self = new CreateProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectShrinkRequest setBoundAppIdListShrink(String boundAppIdListShrink) {
        this.boundAppIdListShrink = boundAppIdListShrink;
        return this;
    }
    public String getBoundAppIdListShrink() {
        return this.boundAppIdListShrink;
    }

    public CreateProjectShrinkRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public CreateProjectShrinkRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public CreateProjectShrinkRequest setProjectMemo(String projectMemo) {
        this.projectMemo = projectMemo;
        return this;
    }
    public String getProjectMemo() {
        return this.projectMemo;
    }

    public CreateProjectShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateProjectShrinkRequest setProjectQuotaLimitShrink(String projectQuotaLimitShrink) {
        this.projectQuotaLimitShrink = projectQuotaLimitShrink;
        return this;
    }
    public String getProjectQuotaLimitShrink() {
        return this.projectQuotaLimitShrink;
    }

}
