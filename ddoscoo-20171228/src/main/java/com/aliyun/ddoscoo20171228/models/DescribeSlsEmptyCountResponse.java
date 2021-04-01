// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeSlsEmptyCountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AvailableCount")
    @Validation(required = true)
    public Integer availableCount;

    public static DescribeSlsEmptyCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsEmptyCountResponse self = new DescribeSlsEmptyCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlsEmptyCountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlsEmptyCountResponse setAvailableCount(Integer availableCount) {
        this.availableCount = availableCount;
        return this;
    }
    public Integer getAvailableCount() {
        return this.availableCount;
    }

}
