// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DeleteMyGroupInstancesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("InstanceIdList")
    public String instanceIdList;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteMyGroupInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMyGroupInstancesRequest self = new DeleteMyGroupInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMyGroupInstancesRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DeleteMyGroupInstancesRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DeleteMyGroupInstancesRequest setInstanceIdList(String instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public String getInstanceIdList() {
        return this.instanceIdList;
    }

    public DeleteMyGroupInstancesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public DeleteMyGroupInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
