// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateGlobalResourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1AB9ABDF-7E1E-44AD-8610-70A005115DD1</p>
     */
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
