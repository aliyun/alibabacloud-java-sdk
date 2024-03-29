// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryTaskResultRequest extends TeaModel {
    // app
    @NameInMap("App")
    public String app;

    // operator
    @NameInMap("Operator")
    public String operator;

    // param1
    @NameInMap("Param1")
    public String param1;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // token
    @NameInMap("Token")
    public String token;

    public static QueryTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskResultRequest self = new QueryTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public QueryTaskResultRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public QueryTaskResultRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public QueryTaskResultRequest setParam1(String param1) {
        this.param1 = param1;
        return this;
    }
    public String getParam1() {
        return this.param1;
    }

    public QueryTaskResultRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTaskResultRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
