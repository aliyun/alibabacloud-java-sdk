// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class DetectImageElementsRequest extends TeaModel {
    @NameInMap("Url")
    @Validation(required = true)
    public String url;

    public static DetectImageElementsRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectImageElementsRequest self = new DetectImageElementsRequest();
        return TeaModel.build(map, self);
    }

}
