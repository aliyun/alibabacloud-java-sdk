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

    // token
    @NameInMap("Token")
    public String token;

    // param1
    @NameInMap("Param1")
    public String param1;

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

    public QueryTaskResultRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public QueryTaskResultRequest setParam1(String param1) {
        this.param1 = param1;
        return this;
    }
    public String getParam1() {
        return this.param1;
    }

}
