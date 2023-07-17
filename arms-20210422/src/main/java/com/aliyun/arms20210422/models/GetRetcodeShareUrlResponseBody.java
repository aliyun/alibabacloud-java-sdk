// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class GetRetcodeShareUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Url")
    public String url;

    public static GetRetcodeShareUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRetcodeShareUrlResponseBody self = new GetRetcodeShareUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRetcodeShareUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRetcodeShareUrlResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
