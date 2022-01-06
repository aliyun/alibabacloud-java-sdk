// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class TbPredictCategoryRequest extends TeaModel {
    @NameInMap("PicUrl")
    public String picUrl;

    public static TbPredictCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        TbPredictCategoryRequest self = new TbPredictCategoryRequest();
        return TeaModel.build(map, self);
    }

    public TbPredictCategoryRequest setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

}
