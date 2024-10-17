// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateQualityEntityRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated.</p>
     * <p>The value 0 indicates that the partition filter expression is at the SQL level, and the system checks data quality after each SQL statement is executed.</p>
     * <ul>
     * <li>0</li>
     * <li>1</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EntityLevel")
    public Integer entityLevel;

    /**
     * <p>The type of the compute engine or data source.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>odps</li>
     * <li>emr</li>
     * <li>hadoop</li>
     * <li>cdh</li>
     * <li>analyticdb_for_mysql</li>
     * <li>hybriddb_for_postgresql</li>
     * <li>holodb</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ODPS</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The partition filter expression.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dt=$[yyyymmdd]</p>
     */
    @NameInMap("MatchExpression")
    public String matchExpression;

    /**
     * <p>The DataWorks workspace ID. You can log on to the DataWorks console to query the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the compute engine or data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>autotest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The name of the table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dual</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static CreateQualityEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQualityEntityRequest self = new CreateQualityEntityRequest();
        return TeaModel.build(map, self);
    }

    public CreateQualityEntityRequest setEntityLevel(Integer entityLevel) {
        this.entityLevel = entityLevel;
        return this;
    }
    public Integer getEntityLevel() {
        return this.entityLevel;
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

    public CreateQualityEntityRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
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

}
