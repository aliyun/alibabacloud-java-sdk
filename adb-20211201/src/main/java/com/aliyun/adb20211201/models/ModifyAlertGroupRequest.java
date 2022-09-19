// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyAlertGroupRequest extends TeaModel {
    @NameInMap("AlertGroupId")
    public Integer alertGroupId;

    @NameInMap("AlertInstanceIds")
    public String alertInstanceIds;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Description")
    public String description;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyAlertGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAlertGroupRequest self = new ModifyAlertGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAlertGroupRequest setAlertGroupId(Integer alertGroupId) {
        this.alertGroupId = alertGroupId;
        return this;
    }
    public Integer getAlertGroupId() {
        return this.alertGroupId;
    }

    public ModifyAlertGroupRequest setAlertInstanceIds(String alertInstanceIds) {
        this.alertInstanceIds = alertInstanceIds;
        return this;
    }
    public String getAlertInstanceIds() {
        return this.alertInstanceIds;
    }

    public ModifyAlertGroupRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyAlertGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyAlertGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifyAlertGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
