// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyJDBCDataSourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyJDBCDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyJDBCDataSourceResponseBody self = new ModifyJDBCDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyJDBCDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
