// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class TbPredictCategoryAdvanceRequest extends TeaModel {
    @NameInMap("PicUrlObject")
    @Validation(required = true)
    public java.io.InputStream picUrlObject;

    public static TbPredictCategoryAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        TbPredictCategoryAdvanceRequest self = new TbPredictCategoryAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public TbPredictCategoryAdvanceRequest setPicUrlObject(java.io.InputStream picUrlObject) {
        this.picUrlObject = picUrlObject;
        return this;
    }
    public java.io.InputStream getPicUrlObject() {
        return this.picUrlObject;
    }

}
