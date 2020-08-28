// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class RefineMaskAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("MaskImageURL")
    @Validation(required = true)
    public String maskImageURL;

    public static RefineMaskAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RefineMaskAdvanceRequest self = new RefineMaskAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
