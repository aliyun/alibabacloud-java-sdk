// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class DeleteServiceInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteServiceInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceInstancesResponseBody self = new DeleteServiceInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteServiceInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
