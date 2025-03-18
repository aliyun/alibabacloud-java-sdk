// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteAlertContactShrinkRequest extends TeaModel {
    /**
     * <p>The list of alert contact IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("contact_ids")
    public String contactIdsShrink;

    public static DeleteAlertContactShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertContactShrinkRequest self = new DeleteAlertContactShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertContactShrinkRequest setContactIdsShrink(String contactIdsShrink) {
        this.contactIdsShrink = contactIdsShrink;
        return this;
    }
    public String getContactIdsShrink() {
        return this.contactIdsShrink;
    }

}
