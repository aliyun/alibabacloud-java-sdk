// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class AePredictCategoryRequest extends TeaModel {
    @NameInMap("PicUrl")
    public String picUrl;

    public static AePredictCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        AePredictCategoryRequest self = new AePredictCategoryRequest();
        return TeaModel.build(map, self);
    }

    public AePredictCategoryRequest setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

}
