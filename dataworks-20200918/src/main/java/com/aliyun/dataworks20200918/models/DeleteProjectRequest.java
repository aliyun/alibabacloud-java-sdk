// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class DeleteProjectRequest extends TeaModel {
    @NameInMap("Immediate")
    public Boolean immediate;

    @NameInMap("NeedDeleteCalc")
    public Boolean needDeleteCalc;

    @NameInMap("Operator")
    public String operator;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static DeleteProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectRequest self = new DeleteProjectRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProjectRequest setImmediate(Boolean immediate) {
        this.immediate = immediate;
        return this;
    }
    public Boolean getImmediate() {
        return this.immediate;
    }

    public DeleteProjectRequest setNeedDeleteCalc(Boolean needDeleteCalc) {
        this.needDeleteCalc = needDeleteCalc;
        return this;
    }
    public Boolean getNeedDeleteCalc() {
        return this.needDeleteCalc;
    }

    public DeleteProjectRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public DeleteProjectRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
