// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteAuthorizationResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BF72A6FB-B071-5F2E-A036-9D62545B962C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuthorizationResponseBody self = new DeleteAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
