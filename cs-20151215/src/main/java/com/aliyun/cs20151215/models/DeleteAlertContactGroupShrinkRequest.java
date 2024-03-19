// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteAlertContactGroupShrinkRequest extends TeaModel {
    @NameInMap("contact_group_ids")
    public String contactGroupIdsShrink;

    public static DeleteAlertContactGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertContactGroupShrinkRequest self = new DeleteAlertContactGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertContactGroupShrinkRequest setContactGroupIdsShrink(String contactGroupIdsShrink) {
        this.contactGroupIdsShrink = contactGroupIdsShrink;
        return this;
    }
    public String getContactGroupIdsShrink() {
        return this.contactGroupIdsShrink;
    }

}
