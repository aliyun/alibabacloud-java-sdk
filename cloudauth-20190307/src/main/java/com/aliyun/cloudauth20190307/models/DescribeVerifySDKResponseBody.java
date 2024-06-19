// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifySDKResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p><a href="https://www.xxx.com">https://www.xxx.com</a></p>
     */
    @NameInMap("SdkUrl")
    public String sdkUrl;

    public static DescribeVerifySDKResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifySDKResponseBody self = new DescribeVerifySDKResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVerifySDKResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifySDKResponseBody setSdkUrl(String sdkUrl) {
        this.sdkUrl = sdkUrl;
        return this;
    }
    public String getSdkUrl() {
        return this.sdkUrl;
    }

}
