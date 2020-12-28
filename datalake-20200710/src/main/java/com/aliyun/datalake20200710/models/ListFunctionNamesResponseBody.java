// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListFunctionNamesResponseBody extends TeaModel {
    // Code
    @NameInMap("Code")
    public String code;

    // FunctionNames
    @NameInMap("FunctionNames")
    public java.util.List<String> functionNames;

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

    public static ListFunctionNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionNamesResponseBody self = new ListFunctionNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFunctionNamesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFunctionNamesResponseBody setFunctionNames(java.util.List<String> functionNames) {
        this.functionNames = functionNames;
        return this;
    }
    public java.util.List<String> getFunctionNames() {
        return this.functionNames;
    }

    public ListFunctionNamesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFunctionNamesResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListFunctionNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFunctionNamesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
