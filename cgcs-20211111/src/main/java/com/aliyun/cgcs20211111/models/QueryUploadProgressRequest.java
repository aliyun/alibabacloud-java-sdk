// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class QueryUploadProgressRequest extends TeaModel {
    @NameInMap("QueryUploadProgressRequests")
    public String queryUploadProgressRequests;

    public static QueryUploadProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUploadProgressRequest self = new QueryUploadProgressRequest();
        return TeaModel.build(map, self);
    }

    public QueryUploadProgressRequest setQueryUploadProgressRequests(String queryUploadProgressRequests) {
        this.queryUploadProgressRequests = queryUploadProgressRequests;
        return this;
    }
    public String getQueryUploadProgressRequests() {
        return this.queryUploadProgressRequests;
    }

}
