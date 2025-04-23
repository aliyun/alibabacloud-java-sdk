// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteUsersResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUsersResponseBody self = new DeleteUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
