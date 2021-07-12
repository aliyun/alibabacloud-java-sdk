// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteConnectionPoolResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteConnectionPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteConnectionPoolResponseBody self = new DeleteConnectionPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteConnectionPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
