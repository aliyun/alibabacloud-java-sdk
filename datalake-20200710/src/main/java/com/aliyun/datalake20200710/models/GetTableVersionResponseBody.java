// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetTableVersionResponseBody extends TeaModel {
    // Code
    @NameInMap("Code")
    public String code;

    // Message
    @NameInMap("Message")
    public String message;

    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    // Success
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TableVersion")
    public TableVersion tableVersion;

    public static GetTableVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableVersionResponseBody self = new GetTableVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTableVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTableVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTableVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTableVersionResponseBody setTableVersion(TableVersion tableVersion) {
        this.tableVersion = tableVersion;
        return this;
    }
    public TableVersion getTableVersion() {
        return this.tableVersion;
    }

}
