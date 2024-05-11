// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListNamespacesRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>> You can call the [DescribeDBInstances](https://help.aliyun.com/document_detail/86911.html) operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

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

    public static ListNamespacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNamespacesRequest self = new ListNamespacesRequest();
        return TeaModel.build(map, self);
    }

    public ListNamespacesRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ListNamespacesRequest setManagerAccount(String managerAccount) {
        this.managerAccount = managerAccount;
        return this;
    }
    public String getManagerAccount() {
        return this.managerAccount;
    }

    public ListNamespacesRequest setManagerAccountPassword(String managerAccountPassword) {
        this.managerAccountPassword = managerAccountPassword;
        return this;
    }
    public String getManagerAccountPassword() {
        return this.managerAccountPassword;
    }

    public ListNamespacesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListNamespacesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
