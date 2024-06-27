// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateJDBCDataSourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <strong>example:</strong>
     * <p>2C125605-266F-41CA-8AC5-3A643D4F42C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateJDBCDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateJDBCDataSourceResponseBody self = new CreateJDBCDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateJDBCDataSourceResponseBody setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public CreateJDBCDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
