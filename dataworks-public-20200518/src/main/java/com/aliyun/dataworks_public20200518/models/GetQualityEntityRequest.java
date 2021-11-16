// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetQualityEntityRequest extends TeaModel {
    @NameInMap("EnvType")
    public String envType;

    @NameInMap("MatchExpression")
    public String matchExpression;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("TableName")
    public String tableName;

    public static GetQualityEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQualityEntityRequest self = new GetQualityEntityRequest();
        return TeaModel.build(map, self);
    }

    public GetQualityEntityRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public GetQualityEntityRequest setMatchExpression(String matchExpression) {
        this.matchExpression = matchExpression;
        return this;
    }
    public String getMatchExpression() {
        return this.matchExpression;
    }

    public GetQualityEntityRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetQualityEntityRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
