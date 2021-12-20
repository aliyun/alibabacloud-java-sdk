// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DissociateIpFromConnectionPoolResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DissociateIpFromConnectionPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DissociateIpFromConnectionPoolResponseBody self = new DissociateIpFromConnectionPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public DissociateIpFromConnectionPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
