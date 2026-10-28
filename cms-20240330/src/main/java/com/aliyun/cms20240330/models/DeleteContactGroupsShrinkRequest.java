// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteContactGroupsShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of the contact groups.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("contactGroupIds")
    public String contactGroupIdsShrink;

    public static DeleteContactGroupsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactGroupsShrinkRequest self = new DeleteContactGroupsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteContactGroupsShrinkRequest setContactGroupIdsShrink(String contactGroupIdsShrink) {
        this.contactGroupIdsShrink = contactGroupIdsShrink;
        return this;
    }
    public String getContactGroupIdsShrink() {
        return this.contactGroupIdsShrink;
    }

}
