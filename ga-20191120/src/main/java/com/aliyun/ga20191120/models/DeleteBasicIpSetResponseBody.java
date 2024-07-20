// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteBasicIpSetResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6D2BFF54-6AF2-4679-88C4-2F2E187F16CB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBasicIpSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBasicIpSetResponseBody self = new DeleteBasicIpSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBasicIpSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
