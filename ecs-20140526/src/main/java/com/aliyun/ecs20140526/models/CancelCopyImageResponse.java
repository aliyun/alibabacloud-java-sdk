// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CancelCopyImageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CancelCopyImageResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelCopyImageResponse self = new CancelCopyImageResponse();
        return TeaModel.build(map, self);
    }

}
