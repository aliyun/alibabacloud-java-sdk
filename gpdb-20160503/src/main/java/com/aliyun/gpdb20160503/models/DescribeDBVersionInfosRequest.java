// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBVersionInfosRequest extends TeaModel {
    /**
     * <p>The resource type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>StorageElastic</strong>: elastic storage mode.</li>
     * <li><strong>Serverless</strong>: Serverless mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>StorageElastic</p>
     */
    @NameInMap("DBInstanceMode")
    public String DBInstanceMode;

    /**
     * <p>The minor version number that does not include the prefix.</p>
     * 
     * <strong>example:</strong>
     * <p>6.3.10.20</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs. For information about how to obtain the ID of a resource group, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeDBVersionInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBVersionInfosRequest self = new DescribeDBVersionInfosRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBVersionInfosRequest setDBInstanceMode(String DBInstanceMode) {
        this.DBInstanceMode = DBInstanceMode;
        return this;
    }
    public String getDBInstanceMode() {
        return this.DBInstanceMode;
    }

    public DescribeDBVersionInfosRequest setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeDBVersionInfosRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBVersionInfosRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBVersionInfosRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
