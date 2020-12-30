// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DeleteMnsServeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMnsServeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMnsServeResponseBody self = new DeleteMnsServeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMnsServeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
