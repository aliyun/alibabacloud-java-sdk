// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateMigrationTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c-xxxxxx</p>
     */
    @NameInMap("clusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>migration from Nginx</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>env-xxxx</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <strong>example:</strong>
     * <p>gw-xxxx</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <strong>example:</strong>
     * <p>api-xxxx</p>
     */
    @NameInMap("httpApiId")
    public String httpApiId;

    /**
     * <strong>example:</strong>
     * <p>nginx</p>
     */
    @NameInMap("ingressClass")
    public String ingressClass;

    /**
     * <strong>example:</strong>
     * <p>Nginx Ingress</p>
     */
    @NameInMap("migrationType")
    public String migrationType;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("watchNamespace")
    public String watchNamespace;

    public static CreateMigrationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrationTaskRequest self = new CreateMigrationTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateMigrationTaskRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateMigrationTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMigrationTaskRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public CreateMigrationTaskRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CreateMigrationTaskRequest setHttpApiId(String httpApiId) {
        this.httpApiId = httpApiId;
        return this;
    }
    public String getHttpApiId() {
        return this.httpApiId;
    }

    public CreateMigrationTaskRequest setIngressClass(String ingressClass) {
        this.ingressClass = ingressClass;
        return this;
    }
    public String getIngressClass() {
        return this.ingressClass;
    }

    public CreateMigrationTaskRequest setMigrationType(String migrationType) {
        this.migrationType = migrationType;
        return this;
    }
    public String getMigrationType() {
        return this.migrationType;
    }

    public CreateMigrationTaskRequest setWatchNamespace(String watchNamespace) {
        this.watchNamespace = watchNamespace;
        return this;
    }
    public String getWatchNamespace() {
        return this.watchNamespace;
    }

}
