// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateContactGroupRequest extends TeaModel {
    @NameInMap("ContactGroupId")
    public Long contactGroupId;

    @NameInMap("ContactGroupName")
    public String contactGroupName;

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
