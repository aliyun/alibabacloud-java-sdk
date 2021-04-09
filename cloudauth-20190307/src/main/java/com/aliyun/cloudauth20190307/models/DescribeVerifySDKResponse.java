// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifySDKResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SdkUrl")
    @Validation(required = true)
    public String sdkUrl;

    public static DescribeVerifySDKResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifySDKResponse self = new DescribeVerifySDKResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVerifySDKResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifySDKResponse setSdkUrl(String sdkUrl) {
        this.sdkUrl = sdkUrl;
        return this;
    }
    public String getSdkUrl() {
        return this.sdkUrl;
    }

}
