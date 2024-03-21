// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteAccessPointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAccessPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessPointResponseBody self = new DeleteAccessPointResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAccessPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
