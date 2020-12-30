// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DeleteResourcePoolResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteResourcePoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourcePoolResponseBody self = new DeleteResourcePoolResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteResourcePoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
