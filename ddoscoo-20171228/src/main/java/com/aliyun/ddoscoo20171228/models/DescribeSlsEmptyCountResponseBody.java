// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeSlsEmptyCountResponseBody extends TeaModel {
    @NameInMap("AvailableCount")
    public Integer availableCount;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSlsEmptyCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsEmptyCountResponseBody self = new DescribeSlsEmptyCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlsEmptyCountResponseBody setAvailableCount(Integer availableCount) {
        this.availableCount = availableCount;
        return this;
    }
    public Integer getAvailableCount() {
        return this.availableCount;
    }

    public DescribeSlsEmptyCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
