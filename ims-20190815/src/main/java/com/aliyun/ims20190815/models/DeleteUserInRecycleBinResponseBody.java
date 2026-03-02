// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteUserInRecycleBinResponseBody extends TeaModel {
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
