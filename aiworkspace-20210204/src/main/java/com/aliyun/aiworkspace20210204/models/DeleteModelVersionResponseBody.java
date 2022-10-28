// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteModelVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteModelVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelVersionResponseBody self = new DeleteModelVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteModelVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
