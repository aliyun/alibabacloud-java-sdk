// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyJDBCDataSourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2C125605-266F-41CA-8AC5-3A643D4F42C5</p>
     */
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
