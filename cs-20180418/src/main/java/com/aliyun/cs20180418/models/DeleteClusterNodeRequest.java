// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class DeleteClusterNodeRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    public DeleteClusterNodeQuery query;

    public static DeleteClusterNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterNodeRequest self = new DeleteClusterNodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClusterNodeRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClusterNodeRequest setQuery(DeleteClusterNodeQuery query) {
        this.query = query;
        return this;
    }
    public DeleteClusterNodeQuery getQuery() {
        return this.query;
    }

}
