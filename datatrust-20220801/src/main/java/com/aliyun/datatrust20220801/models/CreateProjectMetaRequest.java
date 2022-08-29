// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class CreateProjectMetaRequest extends TeaModel {
    @NameInMap("ProjectType")
    public Integer projectType;

    @NameInMap("SourceTableId")
    public Long sourceTableId;

    @NameInMap("TargetProjectId")
    public Long targetProjectId;

    @NameInMap("TargetTableName")
    public String targetTableName;

    public static CreateProjectMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectMetaRequest self = new CreateProjectMetaRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectMetaRequest setProjectType(Integer projectType) {
        this.projectType = projectType;
        return this;
    }
    public Integer getProjectType() {
        return this.projectType;
    }

    public CreateProjectMetaRequest setSourceTableId(Long sourceTableId) {
        this.sourceTableId = sourceTableId;
        return this;
    }
    public Long getSourceTableId() {
        return this.sourceTableId;
    }

    public CreateProjectMetaRequest setTargetProjectId(Long targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }
    public Long getTargetProjectId() {
        return this.targetProjectId;
    }

    public CreateProjectMetaRequest setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
        return this;
    }
    public String getTargetTableName() {
        return this.targetTableName;
    }

}
