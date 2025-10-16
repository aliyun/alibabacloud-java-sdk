// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInvadeEventStatisticResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HighOpenEventCnt")
    public Integer highOpenEventCnt;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LowOpenEventCnt")
    public Integer lowOpenEventCnt;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MiddleOpenEventCnt")
    public Integer middleOpenEventCnt;

    /**
     * <strong>example:</strong>
     * <p>1530A01A-6901-5B72-AB88-28B6E96B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalOpenEventCnt")
    public Integer totalOpenEventCnt;

    public static DescribeInvadeEventStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvadeEventStatisticResponseBody self = new DescribeInvadeEventStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInvadeEventStatisticResponseBody setHighOpenEventCnt(Integer highOpenEventCnt) {
        this.highOpenEventCnt = highOpenEventCnt;
        return this;
    }
    public Integer getHighOpenEventCnt() {
        return this.highOpenEventCnt;
    }

    public DescribeInvadeEventStatisticResponseBody setLowOpenEventCnt(Integer lowOpenEventCnt) {
        this.lowOpenEventCnt = lowOpenEventCnt;
        return this;
    }
    public Integer getLowOpenEventCnt() {
        return this.lowOpenEventCnt;
    }

    public DescribeInvadeEventStatisticResponseBody setMiddleOpenEventCnt(Integer middleOpenEventCnt) {
        this.middleOpenEventCnt = middleOpenEventCnt;
        return this;
    }
    public Integer getMiddleOpenEventCnt() {
        return this.middleOpenEventCnt;
    }

    public DescribeInvadeEventStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInvadeEventStatisticResponseBody setTotalOpenEventCnt(Integer totalOpenEventCnt) {
        this.totalOpenEventCnt = totalOpenEventCnt;
        return this;
    }
    public Integer getTotalOpenEventCnt() {
        return this.totalOpenEventCnt;
    }

}
