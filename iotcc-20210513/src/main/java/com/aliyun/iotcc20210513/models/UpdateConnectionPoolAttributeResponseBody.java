// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateConnectionPoolAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateConnectionPoolAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnectionPoolAttributeResponseBody self = new UpdateConnectionPoolAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConnectionPoolAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
