// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceSignedUrlResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p><a href="https://foo-115**.console.cn-hangzhou.eas.pai-ml.com?expire=1735202661&signature=ey">https://foo-115**.console.cn-hangzhou.eas.pai-ml.com?expire=1735202661&amp;signature=ey</a>*******</p>
     */
    @NameInMap("SignedUrl")
    public String signedUrl;

    public static DescribeServiceSignedUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceSignedUrlResponseBody self = new DescribeServiceSignedUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceSignedUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceSignedUrlResponseBody setSignedUrl(String signedUrl) {
        this.signedUrl = signedUrl;
        return this;
    }
    public String getSignedUrl() {
        return this.signedUrl;
    }

}
