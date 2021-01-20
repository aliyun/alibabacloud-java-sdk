// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyMonitorGroupRequest extends TeaModel {
    @NameInMap("BindUrls")
    public String bindUrls;

    @NameInMap("ServiceId")
    public Long serviceId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("ContactGroups")
    public String contactGroups;

    public static ModifyMonitorGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMonitorGroupRequest self = new ModifyMonitorGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMonitorGroupRequest setBindUrls(String bindUrls) {
        this.bindUrls = bindUrls;
        return this;
    }
    public String getBindUrls() {
        return this.bindUrls;
    }

    public ModifyMonitorGroupRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public ModifyMonitorGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ModifyMonitorGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifyMonitorGroupRequest setContactGroups(String contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }
    public String getContactGroups() {
        return this.contactGroups;
    }

}
