// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class AePredictCategoryAdvanceRequest extends TeaModel {
    @NameInMap("PicUrlObject")
    @Validation(required = true)
    public java.io.InputStream picUrlObject;

    public static AePredictCategoryAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AePredictCategoryAdvanceRequest self = new AePredictCategoryAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public AePredictCategoryAdvanceRequest setPicUrlObject(java.io.InputStream picUrlObject) {
        this.picUrlObject = picUrlObject;
        return this;
    }
    public java.io.InputStream getPicUrlObject() {
        return this.picUrlObject;
    }

}
