// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.goodstech20191230.models;

import com.aliyun.tea.*;

public class ClassifyCommodityAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static ClassifyCommodityAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ClassifyCommodityAdvanceRequest self = new ClassifyCommodityAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
