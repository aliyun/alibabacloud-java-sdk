// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteQualityEntityRequest extends TeaModel {
    /**
     * <p>The ID of the partition filter expression.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EntityId")
    public Long entityId;

    /**
     * <p>The type of the compute engine instance or data source. Valid values: EMR, Hologres, AnalyticDB for PostgreSQL, CDH, MaxCompute, Kafka and DataHub.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EnvType")
    public String envType;

    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the compute engine instance or data source.</p>
     * <br>
     * <p>This parameter is required.</p>
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
