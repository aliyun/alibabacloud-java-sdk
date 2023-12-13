// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupRequest extends TeaModel {
    /**
     * <p>The alert groups that receive alert notifications for the application group. The alarm notifications for the application group are sent to the alert contacts in the alarm groups.</p>
     * <br>
     * <p>>  An alert group is a group of one or more alert contacts. For more information about how to create alert contacts and alert groups, see [PutContact](~~114923~~) and [PutContactGroup](~~114929~~).</p>
     */
    @NameInMap("ContactGroups")
    public String contactGroups;

    /**
     * <p>The name of the application group.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateMonitorGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorGroupRequest self = new CreateMonitorGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitorGroupRequest setContactGroups(String contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }
    public String getContactGroups() {
        return this.contactGroups;
    }

    public CreateMonitorGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateMonitorGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
