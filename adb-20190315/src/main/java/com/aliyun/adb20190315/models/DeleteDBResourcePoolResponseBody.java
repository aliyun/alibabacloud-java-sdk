// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DeleteDBResourcePoolResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDBResourcePoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBResourcePoolResponseBody self = new DeleteDBResourcePoolResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDBResourcePoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
