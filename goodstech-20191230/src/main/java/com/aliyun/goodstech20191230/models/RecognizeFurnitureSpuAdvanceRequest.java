// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.goodstech20191230.models;

import com.aliyun.tea.*;

public class RecognizeFurnitureSpuAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("XLength")
    @Validation(required = true)
    public Double XLength;

    @NameInMap("YLength")
    @Validation(required = true)
    public Double YLength;

    @NameInMap("ZLength")
    @Validation(required = true)
    public Double ZLength;

    public static RecognizeFurnitureSpuAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFurnitureSpuAdvanceRequest self = new RecognizeFurnitureSpuAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
