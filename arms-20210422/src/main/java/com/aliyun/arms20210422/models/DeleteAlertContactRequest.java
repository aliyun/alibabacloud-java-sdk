// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class DeleteAlertContactRequest extends TeaModel {
    @NameInMap("ContactId")
    public Long contactId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteAlertContactRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertContactRequest self = new DeleteAlertContactRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertContactRequest setContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }
    public Long getContactId() {
        return this.contactId;
    }

    public DeleteAlertContactRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
