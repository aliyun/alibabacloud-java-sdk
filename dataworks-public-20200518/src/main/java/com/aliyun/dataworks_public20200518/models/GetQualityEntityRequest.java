// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetQualityEntityRequest extends TeaModel {
    /**
     * <p>The type of the compute engine instance or data source.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The partition filter expression.</p>
     */
    @NameInMap("MatchExpression")
    public String matchExpression;

    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the compute engine instance or data source. You can obtain the name from data source configurations.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The name of the partitioned table. You can call the [GetMetaTablePartition](https://help.aliyun.com/document_detail/173923.html) operation to obtain the name.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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

    public GetQualityEntityRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
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
