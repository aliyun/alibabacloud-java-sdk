// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class GetCmsUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Url")
    public String url;

    public static GetCmsUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCmsUrlResponseBody self = new GetCmsUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCmsUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCmsUrlResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
