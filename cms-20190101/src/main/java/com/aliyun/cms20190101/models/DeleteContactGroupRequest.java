// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteContactGroupRequest extends TeaModel {
    /**
     * <p>The name of the alert group.</p>
     */
    @NameInMap("ContactGroupName")
    public String contactGroupName;

    public static DeleteContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactGroupRequest self = new DeleteContactGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteContactGroupRequest setContactGroupName(String contactGroupName) {
        this.contactGroupName = contactGroupName;
        return this;
    }
    public String getContactGroupName() {
        return this.contactGroupName;
    }

}
