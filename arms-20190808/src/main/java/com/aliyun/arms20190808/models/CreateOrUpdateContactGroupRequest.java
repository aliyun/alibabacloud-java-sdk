// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateContactGroupRequest extends TeaModel {
    // The ID of the alert contact group.
    // 
    // *   If you do not specify this parameter, an alert contact group is created.
    // *   If you specify this parameter, the specified alert contact group is modified.
    @NameInMap("ContactGroupId")
    public Long contactGroupId;

    // The name of the alert contact group.
    @NameInMap("ContactGroupName")
    public String contactGroupName;

    // The ID of the contact that you want to add to the contact group. Separate multiple IDs with commas (,).
    @NameInMap("ContactIds")
    public String contactIds;

    public static CreateOrUpdateContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateContactGroupRequest self = new CreateOrUpdateContactGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateContactGroupRequest setContactGroupId(Long contactGroupId) {
        this.contactGroupId = contactGroupId;
        return this;
    }
    public Long getContactGroupId() {
        return this.contactGroupId;
    }

    public CreateOrUpdateContactGroupRequest setContactGroupName(String contactGroupName) {
        this.contactGroupName = contactGroupName;
        return this;
    }
    public String getContactGroupName() {
        return this.contactGroupName;
    }

    public CreateOrUpdateContactGroupRequest setContactIds(String contactIds) {
        this.contactIds = contactIds;
        return this;
    }
    public String getContactIds() {
        return this.contactIds;
    }

}
