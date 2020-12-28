// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetDatabaseResponseBody extends TeaModel {
    // Response Code
    @NameInMap("Code")
    public String code;

    @NameInMap("Database")
    public Database database;

    // Response Message
    @NameInMap("Message")
    public String message;

    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    // API is success or not
    @NameInMap("Success")
    public Boolean success;

    public static GetDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseResponseBody self = new GetDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatabaseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDatabaseResponseBody setDatabase(Database database) {
        this.database = database;
        return this;
    }
    public Database getDatabase() {
        return this.database;
    }

    public GetDatabaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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
