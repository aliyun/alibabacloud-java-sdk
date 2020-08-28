// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstancesResponse self = new DeleteInstancesResponse();
        return TeaModel.build(map, self);
    }

}
