// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlEditorHistoryDimensionsResponseBody extends TeaModel {
    @NameInMap("DatabaseUsers")
    public java.util.List<String> databaseUsers;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeSqlEditorHistoryDimensionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlEditorHistoryDimensionsResponseBody self = new DescribeSqlEditorHistoryDimensionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSqlEditorHistoryDimensionsResponseBody setDatabaseUsers(java.util.List<String> databaseUsers) {
        this.databaseUsers = databaseUsers;
        return this;
    }
    public java.util.List<String> getDatabaseUsers() {
        return this.databaseUsers;
    }

    public DescribeSqlEditorHistoryDimensionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSqlEditorHistoryDimensionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSqlEditorHistoryDimensionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
