// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceIPArrayListRequest extends TeaModel {
    /**
     * <p>The name of the IP address whitelist. If you do not specify this parameter, the default whitelist is queried.</p>
     * <blockquote>
     * <p> Each instance supports up to 50 IP address whitelists.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("DBInstanceIPArrayName")
    public String DBInstanceIPArrayName;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query details about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp***************</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the resource group to which the instance belongs. For information about how to obtain the ID of a resource group, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeDBInstanceIPArrayListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceIPArrayListRequest self = new DescribeDBInstanceIPArrayListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceIPArrayListRequest setDBInstanceIPArrayName(String DBInstanceIPArrayName) {
        this.DBInstanceIPArrayName = DBInstanceIPArrayName;
        return this;
    }
    public String getDBInstanceIPArrayName() {
        return this.DBInstanceIPArrayName;
    }

    public DescribeDBInstanceIPArrayListRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceIPArrayListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
