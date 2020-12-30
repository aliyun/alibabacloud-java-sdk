// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeSdkUrlResponseBody extends TeaModel {
    @NameInMap("SdkUrl")
    public String sdkUrl;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSdkUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSdkUrlResponseBody self = new DescribeSdkUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSdkUrlResponseBody setSdkUrl(String sdkUrl) {
        this.sdkUrl = sdkUrl;
        return this;
    }
    public String getSdkUrl() {
        return this.sdkUrl;
    }

    public DescribeSdkUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
