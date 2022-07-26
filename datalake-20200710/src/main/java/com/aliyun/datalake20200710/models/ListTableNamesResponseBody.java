// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListTableNamesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TableNames")
    public java.util.List<String> tableNames;

    public static ListTableNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTableNamesResponseBody self = new ListTableNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTableNamesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTableNamesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTableNamesResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListTableNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTableNamesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTableNamesResponseBody setTableNames(java.util.List<String> tableNames) {
        this.tableNames = tableNames;
        return this;
    }
    public java.util.List<String> getTableNames() {
        return this.tableNames;
    }

}
