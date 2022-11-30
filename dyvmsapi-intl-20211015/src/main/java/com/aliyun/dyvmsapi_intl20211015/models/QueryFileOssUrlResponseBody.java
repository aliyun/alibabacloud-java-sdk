// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class QueryFileOssUrlResponseBody extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Url")
    public String url;

    public static QueryFileOssUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFileOssUrlResponseBody self = new QueryFileOssUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFileOssUrlResponseBody setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public QueryFileOssUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFileOssUrlResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
