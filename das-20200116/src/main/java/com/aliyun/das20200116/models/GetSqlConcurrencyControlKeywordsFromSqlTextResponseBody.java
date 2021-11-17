// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetSqlConcurrencyControlKeywordsFromSqlTextResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetSqlConcurrencyControlKeywordsFromSqlTextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSqlConcurrencyControlKeywordsFromSqlTextResponseBody self = new GetSqlConcurrencyControlKeywordsFromSqlTextResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSqlConcurrencyControlKeywordsFromSqlTextResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSqlConcurrencyControlKeywordsFromSqlTextResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetSqlConcurrencyControlKeywordsFromSqlTextResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSqlConcurrencyControlKeywordsFromSqlTextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSqlConcurrencyControlKeywordsFromSqlTextResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
