// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateAlertContactGroupRequest extends TeaModel {
    @NameInMap("ContactGroupName")
    public String contactGroupName;

    @NameInMap("ContactIds")
    public String contactIds;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateAlertContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertContactGroupRequest self = new CreateAlertContactGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlertContactGroupRequest setContactGroupName(String contactGroupName) {
        this.contactGroupName = contactGroupName;
        return this;
    }
    public String getContactGroupName() {
        return this.contactGroupName;
    }

    public CreateAlertContactGroupRequest setContactIds(String contactIds) {
        this.contactIds = contactIds;
        return this;
    }
    public String getContactIds() {
        return this.contactIds;
    }

    public CreateAlertContactGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
