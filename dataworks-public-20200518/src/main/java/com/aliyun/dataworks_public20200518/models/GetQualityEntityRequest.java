// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetQualityEntityRequest extends TeaModel {
    /**
     * <p>The type of the engine or data source. Valid values:</p>
     * <ul>
     * <li>cdh</li>
     * <li>analyticdb_for_mysql</li>
     * <li>odps</li>
     * <li>emr</li>
     * <li>hadoop</li>
     * <li>holodb</li>
     * <li>hybriddb_for_postgresql</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>odps</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The partition expression.</p>
     * 
     * <strong>example:</strong>
     * <p>dt=$[yyyymmdd]</p>
     */
    @NameInMap("MatchExpression")
    public String matchExpression;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the workspace configuration page to obtain the workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the engine or data source. You can obtain the name from the datasource config.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>autotest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The name of the partitioned table. You can call <a href="https://help.aliyun.com/document_detail/173923.html">GetMetaTablePartition</a> to query the partitioned table name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dual</p>
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
