// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceAttributeRequest extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> API to view the instance IDs of all AnalyticDB for PostgreSQL instances in the destination region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp13ue79qk8y1****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is deprecated and does not need to be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeDBInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceAttributeRequest self = new DescribeDBInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceAttributeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBInstanceAttributeRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
