// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class DetectFruitsAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static DetectFruitsAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectFruitsAdvanceRequest self = new DetectFruitsAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
