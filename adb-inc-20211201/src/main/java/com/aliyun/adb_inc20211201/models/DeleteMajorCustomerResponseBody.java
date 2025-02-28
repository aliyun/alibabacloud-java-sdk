// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DeleteMajorCustomerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMajorCustomerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMajorCustomerResponseBody self = new DeleteMajorCustomerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMajorCustomerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
