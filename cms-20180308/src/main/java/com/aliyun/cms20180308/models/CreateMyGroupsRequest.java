// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class CreateMyGroupsRequest extends TeaModel {
    @NameInMap("BindUrl")
    public String bindUrl;

    @NameInMap("ContactGroups")
    public String contactGroups;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("Options")
    public String options;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceId")
    public Long serviceId;

    @NameInMap("Type")
    public String type;

    public static CreateMyGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMyGroupsRequest self = new CreateMyGroupsRequest();
        return TeaModel.build(map, self);
    }

    public CreateMyGroupsRequest setBindUrl(String bindUrl) {
        this.bindUrl = bindUrl;
        return this;
    }
    public String getBindUrl() {
        return this.bindUrl;
    }

    public CreateMyGroupsRequest setContactGroups(String contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }
    public String getContactGroups() {
        return this.contactGroups;
    }

    public CreateMyGroupsRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateMyGroupsRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public CreateMyGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateMyGroupsRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public CreateMyGroupsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
