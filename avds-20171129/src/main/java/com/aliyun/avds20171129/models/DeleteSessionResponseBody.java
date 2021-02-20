// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DeleteSessionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSessionResponseBody self = new DeleteSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
