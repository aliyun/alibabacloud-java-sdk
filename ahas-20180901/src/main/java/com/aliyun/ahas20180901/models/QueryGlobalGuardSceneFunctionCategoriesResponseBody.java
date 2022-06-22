// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryGlobalGuardSceneFunctionCategoriesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryGlobalGuardSceneFunctionCategoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGlobalGuardSceneFunctionCategoriesResponseBody self = new QueryGlobalGuardSceneFunctionCategoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGlobalGuardSceneFunctionCategoriesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryGlobalGuardSceneFunctionCategoriesResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryGlobalGuardSceneFunctionCategoriesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryGlobalGuardSceneFunctionCategoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGlobalGuardSceneFunctionCategoriesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
