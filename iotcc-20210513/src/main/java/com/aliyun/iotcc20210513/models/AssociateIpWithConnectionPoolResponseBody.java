// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class AssociateIpWithConnectionPoolResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateIpWithConnectionPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateIpWithConnectionPoolResponseBody self = new AssociateIpWithConnectionPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateIpWithConnectionPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
