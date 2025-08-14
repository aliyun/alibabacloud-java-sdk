// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateNacosMcpServerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <strong>example:</strong>
     * <p>AF21683A-29C7-4853-AC0F-B5ADEE4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNacosMcpServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNacosMcpServerResponseBody self = new CreateNacosMcpServerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNacosMcpServerResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CreateNacosMcpServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
