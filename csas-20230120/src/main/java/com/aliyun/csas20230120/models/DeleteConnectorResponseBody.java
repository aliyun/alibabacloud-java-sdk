// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteConnectorResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>EA4D25BE-BBAB-553E-B18C-32976CFDE86B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteConnectorResponseBody self = new DeleteConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
