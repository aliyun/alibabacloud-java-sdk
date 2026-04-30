// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchTableAssetKnowledgeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchTableAssetKnowledgeResponseBody body;

    public static SearchTableAssetKnowledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchTableAssetKnowledgeResponse self = new SearchTableAssetKnowledgeResponse();
        return TeaModel.build(map, self);
    }

    public SearchTableAssetKnowledgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchTableAssetKnowledgeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchTableAssetKnowledgeResponse setBody(SearchTableAssetKnowledgeResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchTableAssetKnowledgeResponseBody getBody() {
        return this.body;
    }

}
