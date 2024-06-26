// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeQRCodeAuthorityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static DescribeQRCodeAuthorityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeQRCodeAuthorityResponseBody self = new DescribeQRCodeAuthorityResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeQRCodeAuthorityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeQRCodeAuthorityResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
