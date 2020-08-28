// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class UpdateContainerGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateContainerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerGroupResponse self = new UpdateContainerGroupResponse();
        return TeaModel.build(map, self);
    }

}
