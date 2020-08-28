// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceResponse self = new DeleteInstanceResponse();
        return TeaModel.build(map, self);
    }

}
