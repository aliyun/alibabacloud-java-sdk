// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GrantCollectionRequest extends TeaModel {
    /**
     * <p>The name of the collection.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Collection")
    public String collection;

    /**
     * <p>The ID of the instance in reserved storage mode.</p>
     * <br>
     * <p>> You can call the [DescribeDBInstances](https://help.aliyun.com/document_detail/86911.html) operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the namespace to which you want to grant the vector collection permissions.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GrantToNamespace")
    public String grantToNamespace;

    /**
     * <p>The type of the permissions that you want to grant. Valid values:</p>
     * <br>
     * <p>*   rw: the read and write permissions.</p>
     * <p>*   ro: the read-only permission.</p>
     * <p>*   none: the delete permission.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GrantType")
    public String grantType;

    /**
     * <p>The name of the manager account that has the rds_superuser permission.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ManagerAccount")
    public String managerAccount;

    /**
     * <p>The password of the manager account.</p>
     * <br>
     * <p>This parameter is required.</p>
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
     * <p>> You can call the [DescribeRegions](https://help.aliyun.com/document_detail/86912.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GrantCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantCollectionRequest self = new GrantCollectionRequest();
        return TeaModel.build(map, self);
    }

    public GrantCollectionRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public GrantCollectionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public GrantCollectionRequest setGrantToNamespace(String grantToNamespace) {
        this.grantToNamespace = grantToNamespace;
        return this;
    }
    public String getGrantToNamespace() {
        return this.grantToNamespace;
    }

    public GrantCollectionRequest setGrantType(String grantType) {
        this.grantType = grantType;
        return this;
    }
    public String getGrantType() {
        return this.grantType;
    }

    public GrantCollectionRequest setManagerAccount(String managerAccount) {
        this.managerAccount = managerAccount;
        return this;
    }
    public String getManagerAccount() {
        return this.managerAccount;
    }

    public GrantCollectionRequest setManagerAccountPassword(String managerAccountPassword) {
        this.managerAccountPassword = managerAccountPassword;
        return this;
    }
    public String getManagerAccountPassword() {
        return this.managerAccountPassword;
    }

    public GrantCollectionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GrantCollectionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GrantCollectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
