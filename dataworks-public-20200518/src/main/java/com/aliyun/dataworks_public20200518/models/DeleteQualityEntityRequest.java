// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteQualityEntityRequest extends TeaModel {
    /**
     * <p>The ID of the partition filter expression.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("EntityId")
    public Long entityId;

    /**
     * <p>The type of the compute engine or data source. The following types are supported: E-MapReduce (EMR), Hologres, AnalyticDB for PostgreSQL, CDH, MaxCompute, Kafka, and DataHub.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>odps</li>
     * <li>emr</li>
     * <li>hadoop</li>
     * <li>cdh</li>
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
     * <p>The DataWorks workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
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

    public static DeleteQualityEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualityEntityRequest self = new DeleteQualityEntityRequest();
        return TeaModel.build(map, self);
    }

    public DeleteQualityEntityRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public DeleteQualityEntityRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public DeleteQualityEntityRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DeleteQualityEntityRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
