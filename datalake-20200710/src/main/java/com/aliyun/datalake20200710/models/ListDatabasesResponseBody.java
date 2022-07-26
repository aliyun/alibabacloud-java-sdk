// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListDatabasesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Databases")
    public java.util.List<Database> databases;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListDatabasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatabasesResponseBody self = new ListDatabasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatabasesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDatabasesResponseBody setDatabases(java.util.List<Database> databases) {
        this.databases = databases;
        return this;
    }
    public java.util.List<Database> getDatabases() {
        return this.databases;
    }

    public ListDatabasesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDatabasesResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListDatabasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatabasesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
