// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteContactGroupRequest extends TeaModel {
    /**
     * <p>The name of the alert contact group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>contact_group_2019_templatedfkXQ</p>
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
