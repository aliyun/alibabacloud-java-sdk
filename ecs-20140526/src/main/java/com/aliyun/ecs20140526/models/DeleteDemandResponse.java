// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteDemandResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDemandResponse self = new DeleteDemandResponse();
        return TeaModel.build(map, self);
    }

}
