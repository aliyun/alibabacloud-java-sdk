// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class DeleteAlertContactGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ContactGroupId")
    public Long contactGroupId;

    public static DeleteAlertContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertContactGroupRequest self = new DeleteAlertContactGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertContactGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteAlertContactGroupRequest setContactGroupId(Long contactGroupId) {
        this.contactGroupId = contactGroupId;
        return this;
    }
    public Long getContactGroupId() {
        return this.contactGroupId;
    }

}
