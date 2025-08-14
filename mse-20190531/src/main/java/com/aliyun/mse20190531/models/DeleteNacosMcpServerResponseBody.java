// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteNacosMcpServerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <strong>example:</strong>
     * <p>D0DB055C-51F2-5BB2-82A6-CD8A3C6EE6BA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNacosMcpServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNacosMcpServerResponseBody self = new DeleteNacosMcpServerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNacosMcpServerResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteNacosMcpServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
