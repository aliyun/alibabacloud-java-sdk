// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteContactsRequest extends TeaModel {
    /**
     * <p>The IDs of the contacts.</p>
     */
    @NameInMap("contactIds")
    public java.util.List<String> contactIds;

    public static DeleteContactsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactsRequest self = new DeleteContactsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteContactsRequest setContactIds(java.util.List<String> contactIds) {
        this.contactIds = contactIds;
        return this;
    }
    public java.util.List<String> getContactIds() {
        return this.contactIds;
    }

}
