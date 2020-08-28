// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class TagResourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static TagResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        TagResourceResponse self = new TagResourceResponse();
        return TeaModel.build(map, self);
    }

}
