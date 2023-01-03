// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateAlertContactGroupRequest extends TeaModel {
    // The name of the alert contact group.
    @NameInMap("ContactGroupName")
    public String contactGroupName;

    // The IDs of contacts in the contact group. Separate multiple contact IDs with spaces. You can call the SearchAlertContact operation to query the contact IDs. For more information, see [SearchAlertContact](~~130703~~).
    @NameInMap("ContactIds")
    public String contactIds;

    // The ID of the region. Default value: `cn-hangzhou`.
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
