// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteVectorIndexRequest extends TeaModel {
    /**
     * <p>The name of the collection.</p>
     */
    @NameInMap("Collection")
    public String collection;

    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>> You can call the [DescribeDBInstances](~~86911~~) operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the manager account that has the rds_superuser permission.</p>
     */
    @NameInMap("ManagerAccount")
    public String managerAccount;

    /**
     * <p>The password of the manager account.</p>
     */
    @NameInMap("ManagerAccountPassword")
    public String managerAccountPassword;

    /**
     * <p>The name of the namespace.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](~~86912~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteVectorIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVectorIndexRequest self = new DeleteVectorIndexRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVectorIndexRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public DeleteVectorIndexRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DeleteVectorIndexRequest setManagerAccount(String managerAccount) {
        this.managerAccount = managerAccount;
        return this;
    }
    public String getManagerAccount() {
        return this.managerAccount;
    }

    public DeleteVectorIndexRequest setManagerAccountPassword(String managerAccountPassword) {
        this.managerAccountPassword = managerAccountPassword;
        return this;
    }
    public String getManagerAccountPassword() {
        return this.managerAccountPassword;
    }

    public DeleteVectorIndexRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteVectorIndexRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteVectorIndexRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
