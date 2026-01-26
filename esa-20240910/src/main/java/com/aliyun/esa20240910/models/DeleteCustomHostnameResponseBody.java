// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteCustomHostnameResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>156A6B-677B1A-4297B7-9187B7-2B44792</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCustomHostnameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomHostnameResponseBody self = new DeleteCustomHostnameResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCustomHostnameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
