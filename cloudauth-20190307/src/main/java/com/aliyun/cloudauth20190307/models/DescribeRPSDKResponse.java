// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeRPSDKResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SdkUrl")
    @Validation(required = true)
    public String sdkUrl;

    public static DescribeRPSDKResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRPSDKResponse self = new DescribeRPSDKResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRPSDKResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRPSDKResponse setSdkUrl(String sdkUrl) {
        this.sdkUrl = sdkUrl;
        return this;
    }
    public String getSdkUrl() {
        return this.sdkUrl;
    }

}
