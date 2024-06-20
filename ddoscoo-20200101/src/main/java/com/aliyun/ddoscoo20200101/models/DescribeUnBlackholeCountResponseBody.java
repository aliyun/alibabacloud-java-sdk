// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeUnBlackholeCountResponseBody extends TeaModel {
    /**
     * <p>The remaining quota that you can deactivate blackhole filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("RemainCount")
    public Integer remainCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>232929FA-40B6-4C53-9476-EE335ABA44CD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total quota that you can deactivate blackhole filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeUnBlackholeCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUnBlackholeCountResponseBody self = new DescribeUnBlackholeCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUnBlackholeCountResponseBody setRemainCount(Integer remainCount) {
        this.remainCount = remainCount;
        return this;
    }
    public Integer getRemainCount() {
        return this.remainCount;
    }

    public DescribeUnBlackholeCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUnBlackholeCountResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
