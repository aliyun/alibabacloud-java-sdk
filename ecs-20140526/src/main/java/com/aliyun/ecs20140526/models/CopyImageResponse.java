// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CopyImageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ImageId")
    @Validation(required = true)
    public String imageId;

    public static CopyImageResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyImageResponse self = new CopyImageResponse();
        return TeaModel.build(map, self);
    }

}
