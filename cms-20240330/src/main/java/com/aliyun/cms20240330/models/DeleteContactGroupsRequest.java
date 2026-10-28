// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteContactGroupsRequest extends TeaModel {
    /**
     * <p>The IDs of the contact groups.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("contactGroupIds")
    public java.util.List<String> contactGroupIds;

    public static DeleteContactGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactGroupsRequest self = new DeleteContactGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteContactGroupsRequest setContactGroupIds(java.util.List<String> contactGroupIds) {
        this.contactGroupIds = contactGroupIds;
        return this;
    }
    public java.util.List<String> getContactGroupIds() {
        return this.contactGroupIds;
    }

}
