// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class RestartInstanceRequest extends TeaModel {
    /**
     * <p>The cluster ID. You can call the [DescribeDBClusters](~~170879~~) operation to query information about all the clusters that are deployed in a specific region. The information includes the cluster IDs.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <br>
     * <p>*   30 (default)</p>
     * <p>*   50</p>
     * <p>*   100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~170875~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The scheduled restart time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time must be in Coordinated Universal Time (UTC).</p>
     * <br>
     * <p>>  If this parameter is left empty or the time specified by this parameter is earlier than the current time, the cluster is immediately restarted.</p>
     */
    @NameInMap("RestartTime")
    public String restartTime;

    public static RestartInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartInstanceRequest self = new RestartInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RestartInstanceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public RestartInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RestartInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RestartInstanceRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public RestartInstanceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public RestartInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RestartInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RestartInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RestartInstanceRequest setRestartTime(String restartTime) {
        this.restartTime = restartTime;
        return this;
    }
    public String getRestartTime() {
        return this.restartTime;
    }

}
