// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class RemoveWordsAdvanceRequest extends TeaModel {
    @NameInMap("PicUrlObject")
    @Validation(required = true)
    public java.io.InputStream picUrlObject;

    public static RemoveWordsAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveWordsAdvanceRequest self = new RemoveWordsAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RemoveWordsAdvanceRequest setPicUrlObject(java.io.InputStream picUrlObject) {
        this.picUrlObject = picUrlObject;
        return this;
    }
    public java.io.InputStream getPicUrlObject() {
        return this.picUrlObject;
    }

}
