// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateQualityEntityRequest extends TeaModel {
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("EnvType")
    public String envType;

    @NameInMap("MatchExpression")
    public String matchExpression;

    @NameInMap("EntityLevel")
    public Integer entityLevel;

    public static CreateQualityEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQualityEntityRequest self = new CreateQualityEntityRequest();
        return TeaModel.build(map, self);
    }

    public CreateQualityEntityRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateQualityEntityRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public CreateQualityEntityRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public CreateQualityEntityRequest setMatchExpression(String matchExpression) {
        this.matchExpression = matchExpression;
        return this;
    }
    public String getMatchExpression() {
        return this.matchExpression;
    }

    public CreateQualityEntityRequest setEntityLevel(Integer entityLevel) {
        this.entityLevel = entityLevel;
        return this;
    }
    public Integer getEntityLevel() {
        return this.entityLevel;
    }

}
