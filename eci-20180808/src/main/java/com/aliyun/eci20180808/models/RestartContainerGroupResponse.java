// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class RestartContainerGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RestartContainerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartContainerGroupResponse self = new RestartContainerGroupResponse();
        return TeaModel.build(map, self);
    }

}
