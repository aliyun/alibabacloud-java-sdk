// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteUserInRecycleBinResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4507D1CD-526A-4E2B-A1E2-3AB045D1EE0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUserInRecycleBinResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserInRecycleBinResponseBody self = new DeleteUserInRecycleBinResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserInRecycleBinResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
