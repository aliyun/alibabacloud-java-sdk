// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyMonitorGroupRequest extends TeaModel {
    /**
     * <p>The alert groups that can receive alert notifications for the application group.</p>
     */
    @NameInMap("ContactGroups")
    public String contactGroups;

    /**
     * <p>The ID of the application group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the application group.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyMonitorGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMonitorGroupRequest self = new ModifyMonitorGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMonitorGroupRequest setContactGroups(String contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }
    public String getContactGroups() {
        return this.contactGroups;
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

    public ModifyMonitorGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
