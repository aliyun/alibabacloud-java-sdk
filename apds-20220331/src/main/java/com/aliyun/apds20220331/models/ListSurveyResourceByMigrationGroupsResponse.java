// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class ListSurveyResourceByMigrationGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSurveyResourceByMigrationGroupsResponseBody body;

    public static ListSurveyResourceByMigrationGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSurveyResourceByMigrationGroupsResponse self = new ListSurveyResourceByMigrationGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListSurveyResourceByMigrationGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSurveyResourceByMigrationGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSurveyResourceByMigrationGroupsResponse setBody(ListSurveyResourceByMigrationGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSurveyResourceByMigrationGroupsResponseBody getBody() {
        return this.body;
    }

}
