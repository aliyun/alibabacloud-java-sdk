// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DeleteServerlessInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteServerlessInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteServerlessInstanceResponseBody self = new DeleteServerlessInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteServerlessInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
