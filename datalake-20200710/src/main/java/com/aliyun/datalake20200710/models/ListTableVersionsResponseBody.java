// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListTableVersionsResponseBody extends TeaModel {
    // Code
    @NameInMap("Code")
    public String code;

    // Message
    @NameInMap("Message")
    public String message;

    // NextPageToken
    @NameInMap("NextPageToken")
    public String nextPageToken;

    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    // Success
    @NameInMap("Success")
    public Boolean success;

    // table versions
    @NameInMap("TableVersions")
    public java.util.List<TableVersion> tableVersions;

    public static ListTableVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTableVersionsResponseBody self = new ListTableVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTableVersionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTableVersionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTableVersionsResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListTableVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTableVersionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTableVersionsResponseBody setTableVersions(java.util.List<TableVersion> tableVersions) {
        this.tableVersions = tableVersions;
        return this;
    }
    public java.util.List<TableVersion> getTableVersions() {
        return this.tableVersions;
    }

}
