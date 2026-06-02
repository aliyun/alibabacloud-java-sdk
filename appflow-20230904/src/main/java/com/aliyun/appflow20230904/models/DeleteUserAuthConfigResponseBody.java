// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class DeleteUserAuthConfigResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C38D3F9-B340-5230-B108-77E675452733</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUserAuthConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserAuthConfigResponseBody self = new DeleteUserAuthConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserAuthConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
