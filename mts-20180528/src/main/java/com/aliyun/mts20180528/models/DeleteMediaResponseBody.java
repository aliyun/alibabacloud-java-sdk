// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class DeleteMediaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaResponseBody self = new DeleteMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
