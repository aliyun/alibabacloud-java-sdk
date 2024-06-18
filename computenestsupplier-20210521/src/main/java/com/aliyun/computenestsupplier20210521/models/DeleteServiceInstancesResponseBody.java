// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class DeleteServiceInstancesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DB140E67-D75F-5585-946E-41D8DC8F4E00</p>
     */
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
