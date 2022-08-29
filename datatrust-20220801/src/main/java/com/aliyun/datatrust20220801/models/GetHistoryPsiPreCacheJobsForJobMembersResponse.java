// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetHistoryPsiPreCacheJobsForJobMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetHistoryPsiPreCacheJobsForJobMembersResponseBody body;

    public static GetHistoryPsiPreCacheJobsForJobMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHistoryPsiPreCacheJobsForJobMembersResponse self = new GetHistoryPsiPreCacheJobsForJobMembersResponse();
        return TeaModel.build(map, self);
    }

    public GetHistoryPsiPreCacheJobsForJobMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHistoryPsiPreCacheJobsForJobMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHistoryPsiPreCacheJobsForJobMembersResponse setBody(GetHistoryPsiPreCacheJobsForJobMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHistoryPsiPreCacheJobsForJobMembersResponseBody getBody() {
        return this.body;
    }

}
