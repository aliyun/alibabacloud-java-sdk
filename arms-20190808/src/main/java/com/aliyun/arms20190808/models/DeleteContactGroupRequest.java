// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteContactGroupRequest extends TeaModel {
    /**
     * <p>The ID of the alert contact group.</p>
     */
    @NameInMap("ContactGroupId")
    public Long contactGroupId;

    public static DeleteContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactGroupRequest self = new DeleteContactGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteContactGroupRequest setContactGroupId(Long contactGroupId) {
        this.contactGroupId = contactGroupId;
        return this;
    }
    public Long getContactGroupId() {
        return this.contactGroupId;
    }

}
