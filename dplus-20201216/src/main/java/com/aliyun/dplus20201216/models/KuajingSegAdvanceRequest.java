// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class KuajingSegAdvanceRequest extends TeaModel {
    @NameInMap("PicUrlObject")
    @Validation(required = true)
    public java.io.InputStream picUrlObject;

    @NameInMap("ReturnPicFormat")
    public String returnPicFormat;

    @NameInMap("ReturnPicType")
    public String returnPicType;

    public static KuajingSegAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        KuajingSegAdvanceRequest self = new KuajingSegAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public KuajingSegAdvanceRequest setPicUrlObject(java.io.InputStream picUrlObject) {
        this.picUrlObject = picUrlObject;
        return this;
    }
    public java.io.InputStream getPicUrlObject() {
        return this.picUrlObject;
    }

    public KuajingSegAdvanceRequest setReturnPicFormat(String returnPicFormat) {
        this.returnPicFormat = returnPicFormat;
        return this;
    }
    public String getReturnPicFormat() {
        return this.returnPicFormat;
    }

    public KuajingSegAdvanceRequest setReturnPicType(String returnPicType) {
        this.returnPicType = returnPicType;
        return this;
    }
    public String getReturnPicType() {
        return this.returnPicType;
    }

}
