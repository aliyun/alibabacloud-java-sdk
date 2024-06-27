// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBResourceGroupRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the resource group.</p>
     * <blockquote>
     * <p> If you specify this parameter, the information about the specified resource group is returned. If you do not specify this parameter, the information about all resource groups is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testgroup</p>
     */
    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    public static DescribeDBResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBResourceGroupRequest self = new DescribeDBResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBResourceGroupRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBResourceGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBResourceGroupRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

}
