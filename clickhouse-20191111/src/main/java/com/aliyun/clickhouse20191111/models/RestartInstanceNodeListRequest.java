// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class RestartInstanceNodeListRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp108z124a8o7****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The list of nodes to restart.</p>
     */
    @NameInMap("NodeList")
    public java.util.List<String> nodeList;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values:</p>
     * <ul>
     * <li><p><strong>30</strong> (default)</p>
     * </li>
     * <li><p><strong>50</strong></p>
     * </li>
     * <li><p><strong>100</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The scheduled restart time. The time is in the yyyy-MM-ddTHH:mmZ format and is in UTC.</p>
     * <blockquote>
     * <p>If this parameter is left empty or set to a time earlier than the current time, the cluster restarts immediately.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2023-03-22T00:00:50Z</p>
     */
    @NameInMap("RestartTime")
    public String restartTime;

    public static RestartInstanceNodeListRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartInstanceNodeListRequest self = new RestartInstanceNodeListRequest();
        return TeaModel.build(map, self);
    }

    public RestartInstanceNodeListRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public RestartInstanceNodeListRequest setNodeList(java.util.List<String> nodeList) {
        this.nodeList = nodeList;
        return this;
    }
    public java.util.List<String> getNodeList() {
        return this.nodeList;
    }

    public RestartInstanceNodeListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RestartInstanceNodeListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RestartInstanceNodeListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public RestartInstanceNodeListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public RestartInstanceNodeListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RestartInstanceNodeListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RestartInstanceNodeListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RestartInstanceNodeListRequest setRestartTime(String restartTime) {
        this.restartTime = restartTime;
        return this;
    }
    public String getRestartTime() {
        return this.restartTime;
    }

}
