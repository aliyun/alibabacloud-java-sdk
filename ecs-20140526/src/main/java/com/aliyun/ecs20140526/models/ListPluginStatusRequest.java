// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ListPluginStatusRequest extends TeaModel {
    // The IDs of ECS instances. You can specify up to 50 instance IDs in each request.
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    // The name of the Cloud Assistant plug-in. The name supports all character sets and must be 1 to 255 characters in length.
    // 
    // * If this parameter is not specified, the states of all Cloud Assistant plug-ins that are installed on the specified ECS instances are queried.
    // 
    //     > If this parameter is not specified, only a single instance ID can be specified.
    // 
    // * If this parameter is specified, the state of the specified Cloud Assistant plug-in is queried.
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return.
    // 
    // *   Pages start from page 1.
    // *   Default value: 1.
    @NameInMap("PageNumber")
    public Long pageNumber;

    // The number of entries to return on each page.
    // 
    // *   Maximum value: 50.
    // *   Default value: 10.
    @NameInMap("PageSize")
    public Long pageSize;

    // The region ID of the ECS instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ListPluginStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPluginStatusRequest self = new ListPluginStatusRequest();
        return TeaModel.build(map, self);
    }

    public ListPluginStatusRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public ListPluginStatusRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListPluginStatusRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListPluginStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListPluginStatusRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListPluginStatusRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPluginStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListPluginStatusRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListPluginStatusRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
