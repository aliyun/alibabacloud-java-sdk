// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeUnBlockCountResponseBody extends TeaModel {
    @NameInMap("RemainCount")
    public Integer remainCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeUnBlockCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUnBlockCountResponseBody self = new DescribeUnBlockCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUnBlockCountResponseBody setRemainCount(Integer remainCount) {
        this.remainCount = remainCount;
        return this;
    }
    public Integer getRemainCount() {
        return this.remainCount;
    }

    public DescribeUnBlockCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUnBlockCountResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
