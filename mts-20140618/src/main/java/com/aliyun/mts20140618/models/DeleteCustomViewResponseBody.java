// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeleteCustomViewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCustomViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomViewResponseBody self = new DeleteCustomViewResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCustomViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
