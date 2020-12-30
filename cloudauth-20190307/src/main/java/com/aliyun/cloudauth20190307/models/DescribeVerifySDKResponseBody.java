// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifySDKResponseBody extends TeaModel {
    @NameInMap("SdkUrl")
    public String sdkUrl;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVerifySDKResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifySDKResponseBody self = new DescribeVerifySDKResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVerifySDKResponseBody setSdkUrl(String sdkUrl) {
        this.sdkUrl = sdkUrl;
        return this;
    }
    public String getSdkUrl() {
        return this.sdkUrl;
    }

    public DescribeVerifySDKResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
