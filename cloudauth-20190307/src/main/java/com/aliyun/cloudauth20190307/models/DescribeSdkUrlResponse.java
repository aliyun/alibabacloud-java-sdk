// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeSdkUrlResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SdkUrl")
    @Validation(required = true)
    public String sdkUrl;

    public static DescribeSdkUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSdkUrlResponse self = new DescribeSdkUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSdkUrlResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSdkUrlResponse setSdkUrl(String sdkUrl) {
        this.sdkUrl = sdkUrl;
        return this;
    }
    public String getSdkUrl() {
        return this.sdkUrl;
    }

}
