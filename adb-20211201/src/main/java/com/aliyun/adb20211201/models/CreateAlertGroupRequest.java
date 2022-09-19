// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateAlertGroupRequest extends TeaModel {
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

    public static CreateAlertGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertGroupRequest self = new CreateAlertGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlertGroupRequest setAlertInstanceIds(String alertInstanceIds) {
        this.alertInstanceIds = alertInstanceIds;
        return this;
    }
    public String getAlertInstanceIds() {
        return this.alertInstanceIds;
    }

    public CreateAlertGroupRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateAlertGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAlertGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateAlertGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
