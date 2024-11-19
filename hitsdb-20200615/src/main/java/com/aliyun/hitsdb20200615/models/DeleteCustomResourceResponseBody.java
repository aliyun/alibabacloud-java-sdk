// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class DeleteCustomResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCustomResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomResourceResponseBody self = new DeleteCustomResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCustomResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
