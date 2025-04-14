// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDatabaseResponseBody extends TeaModel {
    @NameInMap("Database")
    public Database database;

    /**
     * <strong>example:</strong>
     * <p>1AFAE64E-D1BE-432B-A9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseResponseBody self = new GetDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatabaseResponseBody setDatabase(Database database) {
        this.database = database;
        return this;
    }
    public Database getDatabase() {
        return this.database;
    }

    public GetDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDatabaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
