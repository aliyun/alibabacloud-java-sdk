// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class GetMyGroupsRequest extends TeaModel {
    @NameInMap("BindUrl")
    public String bindUrl;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SelectContactGroups")
    public Boolean selectContactGroups;

    @NameInMap("Type")
    public String type;

    public static GetMyGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMyGroupsRequest self = new GetMyGroupsRequest();
        return TeaModel.build(map, self);
    }

    public GetMyGroupsRequest setBindUrl(String bindUrl) {
        this.bindUrl = bindUrl;
        return this;
    }
    public String getBindUrl() {
        return this.bindUrl;
    }

    public GetMyGroupsRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public GetMyGroupsRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public GetMyGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetMyGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetMyGroupsRequest setSelectContactGroups(Boolean selectContactGroups) {
        this.selectContactGroups = selectContactGroups;
        return this;
    }
    public Boolean getSelectContactGroups() {
        return this.selectContactGroups;
    }

    public GetMyGroupsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
