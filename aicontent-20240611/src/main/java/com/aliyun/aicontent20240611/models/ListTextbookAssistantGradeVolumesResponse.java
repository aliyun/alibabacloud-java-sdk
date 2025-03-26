// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ListTextbookAssistantGradeVolumesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTextbookAssistantGradeVolumesResponseBody body;

    public static ListTextbookAssistantGradeVolumesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTextbookAssistantGradeVolumesResponse self = new ListTextbookAssistantGradeVolumesResponse();
        return TeaModel.build(map, self);
    }

    public ListTextbookAssistantGradeVolumesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTextbookAssistantGradeVolumesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTextbookAssistantGradeVolumesResponse setBody(ListTextbookAssistantGradeVolumesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTextbookAssistantGradeVolumesResponseBody getBody() {
        return this.body;
    }

}
