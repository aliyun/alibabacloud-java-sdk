// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteJDBCDataSourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteJDBCDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteJDBCDataSourceResponseBody self = new DeleteJDBCDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteJDBCDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
