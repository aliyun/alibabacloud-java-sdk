// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class UpdateAlertContactGroupRequest extends TeaModel {
    @NameInMap("ContactGroupId")
    public Long contactGroupId;

    @NameInMap("ContactGroupName")
    public String contactGroupName;

    @NameInMap("ContactIds")
    public String contactIds;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateAlertContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertContactGroupRequest self = new UpdateAlertContactGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlertContactGroupRequest setContactGroupId(Long contactGroupId) {
        this.contactGroupId = contactGroupId;
        return this;
    }
    public Long getContactGroupId() {
        return this.contactGroupId;
    }

    public UpdateAlertContactGroupRequest setContactGroupName(String contactGroupName) {
        this.contactGroupName = contactGroupName;
        return this;
    }
    public String getContactGroupName() {
        return this.contactGroupName;
    }

    public UpdateAlertContactGroupRequest setContactIds(String contactIds) {
        this.contactIds = contactIds;
        return this;
    }
    public String getContactIds() {
        return this.contactIds;
    }

    public UpdateAlertContactGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
