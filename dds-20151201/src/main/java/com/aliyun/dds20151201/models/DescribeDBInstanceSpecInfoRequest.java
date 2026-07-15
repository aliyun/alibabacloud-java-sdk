// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSpecInfoRequest extends TeaModel {
    /**
     * <p>The instance type. You can query this parameter by calling the <a href="https://next.api.aliyun.com/api/Dds/2015-12-01/DescribeDBInstanceAttribute">DescribeDBInstanceAttribute</a> operation.</p>
     * <p>For instance types of different instance categories, see the following topics:</p>
     * <ul>
     * <li><p><a href="https://help.aliyun.com/document_detail/311407.html">Specifications of standalone instances</a></p>
     * </li>
     * <li><p><a href="https://help.aliyun.com/document_detail/311410.html">Specifications of replica set instances</a></p>
     * </li>
     * <li><p><a href="https://help.aliyun.com/document_detail/311414.html">Specifications of sharded cluster instances</a></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mdb.shard.4x.large.d</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeDBInstanceSpecInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceSpecInfoRequest self = new DescribeDBInstanceSpecInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceSpecInfoRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public DescribeDBInstanceSpecInfoRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDBInstanceSpecInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBInstanceSpecInfoRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDBInstanceSpecInfoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDBInstanceSpecInfoRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
