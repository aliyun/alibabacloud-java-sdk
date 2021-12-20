// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class AddCidrToConnectionPoolResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddCidrToConnectionPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCidrToConnectionPoolResponseBody self = new AddCidrToConnectionPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCidrToConnectionPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
