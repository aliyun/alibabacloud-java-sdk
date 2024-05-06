// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class CreateGlobalResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateGlobalResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalResourceResponseBody self = new CreateGlobalResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGlobalResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
