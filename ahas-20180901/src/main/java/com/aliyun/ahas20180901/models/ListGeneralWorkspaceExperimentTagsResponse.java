// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListGeneralWorkspaceExperimentTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListGeneralWorkspaceExperimentTagsResponseBody body;

    public static ListGeneralWorkspaceExperimentTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGeneralWorkspaceExperimentTagsResponse self = new ListGeneralWorkspaceExperimentTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListGeneralWorkspaceExperimentTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGeneralWorkspaceExperimentTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGeneralWorkspaceExperimentTagsResponse setBody(ListGeneralWorkspaceExperimentTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGeneralWorkspaceExperimentTagsResponseBody getBody() {
        return this.body;
    }

}
