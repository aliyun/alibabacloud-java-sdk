// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.goodstech20191230.models;

import com.aliyun.tea.*;

public class RecognizeFurnitureSpuRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    @NameInMap("XLength")
    @Validation(required = true)
    public Double XLength;

    @NameInMap("YLength")
    @Validation(required = true)
    public Double YLength;

    @NameInMap("ZLength")
    @Validation(required = true)
    public Double ZLength;

    public static RecognizeFurnitureSpuRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFurnitureSpuRequest self = new RecognizeFurnitureSpuRequest();
        return TeaModel.build(map, self);
    }

}
