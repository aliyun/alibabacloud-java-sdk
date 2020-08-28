// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DeleteContainerGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteContainerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContainerGroupResponse self = new DeleteContainerGroupResponse();
        return TeaModel.build(map, self);
    }

}
