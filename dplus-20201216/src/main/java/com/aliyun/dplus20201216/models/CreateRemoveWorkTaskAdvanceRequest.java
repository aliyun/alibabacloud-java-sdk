// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class CreateRemoveWorkTaskAdvanceRequest extends TeaModel {
    @NameInMap("PicUrlObject")
    @Validation(required = true)
    public java.io.InputStream picUrlObject;

    @NameInMap("ItemIdentity")
    public String itemIdentity;

    public static CreateRemoveWorkTaskAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRemoveWorkTaskAdvanceRequest self = new CreateRemoveWorkTaskAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateRemoveWorkTaskAdvanceRequest setPicUrlObject(java.io.InputStream picUrlObject) {
        this.picUrlObject = picUrlObject;
        return this;
    }
    public java.io.InputStream getPicUrlObject() {
        return this.picUrlObject;
    }

    public CreateRemoveWorkTaskAdvanceRequest setItemIdentity(String itemIdentity) {
        this.itemIdentity = itemIdentity;
        return this;
    }
    public String getItemIdentity() {
        return this.itemIdentity;
    }

}
