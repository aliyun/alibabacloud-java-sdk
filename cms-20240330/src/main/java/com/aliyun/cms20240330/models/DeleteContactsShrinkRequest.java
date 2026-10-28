// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteContactsShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of the contacts.</p>
     */
    @NameInMap("contactIds")
    public String contactIdsShrink;

    public static DeleteContactsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactsShrinkRequest self = new DeleteContactsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteContactsShrinkRequest setContactIdsShrink(String contactIdsShrink) {
        this.contactIdsShrink = contactIdsShrink;
        return this;
    }
    public String getContactIdsShrink() {
        return this.contactIdsShrink;
    }

}
