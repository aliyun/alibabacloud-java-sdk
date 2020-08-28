// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class RefineMaskRequest extends TeaModel {
    @NameInMap("MaskImageURL")
    @Validation(required = true)
    public String maskImageURL;

    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static RefineMaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RefineMaskRequest self = new RefineMaskRequest();
        return TeaModel.build(map, self);
    }

}
