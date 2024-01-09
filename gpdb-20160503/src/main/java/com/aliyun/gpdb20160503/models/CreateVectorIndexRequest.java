// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateVectorIndexRequest extends TeaModel {
    @NameInMap("Collection")
    public String collection;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Dimension")
    public Integer dimension;

    @NameInMap("ExternalStorage")
    public Integer externalStorage;

    @NameInMap("HnswM")
    public Integer hnswM;

    @NameInMap("ManagerAccount")
    public String managerAccount;

    @NameInMap("ManagerAccountPassword")
    public String managerAccountPassword;

    /**
     * <p>Distance Metrics。</p>
     */
    @NameInMap("Metrics")
    public String metrics;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PqEnable")
    public Integer pqEnable;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateVectorIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVectorIndexRequest self = new CreateVectorIndexRequest();
        return TeaModel.build(map, self);
    }

    public CreateVectorIndexRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public CreateVectorIndexRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateVectorIndexRequest setDimension(Integer dimension) {
        this.dimension = dimension;
        return this;
    }
    public Integer getDimension() {
        return this.dimension;
    }

    public CreateVectorIndexRequest setExternalStorage(Integer externalStorage) {
        this.externalStorage = externalStorage;
        return this;
    }
    public Integer getExternalStorage() {
        return this.externalStorage;
    }

    public CreateVectorIndexRequest setHnswM(Integer hnswM) {
        this.hnswM = hnswM;
        return this;
    }
    public Integer getHnswM() {
        return this.hnswM;
    }

    public CreateVectorIndexRequest setManagerAccount(String managerAccount) {
        this.managerAccount = managerAccount;
        return this;
    }
    public String getManagerAccount() {
        return this.managerAccount;
    }

    public CreateVectorIndexRequest setManagerAccountPassword(String managerAccountPassword) {
        this.managerAccountPassword = managerAccountPassword;
        return this;
    }
    public String getManagerAccountPassword() {
        return this.managerAccountPassword;
    }

    public CreateVectorIndexRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public CreateVectorIndexRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateVectorIndexRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateVectorIndexRequest setPqEnable(Integer pqEnable) {
        this.pqEnable = pqEnable;
        return this;
    }
    public Integer getPqEnable() {
        return this.pqEnable;
    }

    public CreateVectorIndexRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
