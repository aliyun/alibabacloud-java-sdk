// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteCustomizedPropertyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCustomizedPropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomizedPropertyResponseBody self = new DeleteCustomizedPropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCustomizedPropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
