// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeImageAgreementResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static DescribeImageAgreementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageAgreementResponseBody self = new DescribeImageAgreementResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageAgreementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageAgreementResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
