// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeDDoSBpsMaxResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2023-04-07T02:34:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>10000000000</p>
     */
    @NameInMap("MaxAtkBps")
    public Long maxAtkBps;

    /**
     * <strong>example:</strong>
     * <p>100000000</p>
     */
    @NameInMap("MaxAtkPps")
    public Long maxAtkPps;

    /**
     * <strong>example:</strong>
     * <p>A3790430-3A06-535F-A424-0998BD9A6C9F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2023-02-14T17:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDDoSBpsMaxResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSBpsMaxResponseBody self = new DescribeDDoSBpsMaxResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSBpsMaxResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDDoSBpsMaxResponseBody setMaxAtkBps(Long maxAtkBps) {
        this.maxAtkBps = maxAtkBps;
        return this;
    }
    public Long getMaxAtkBps() {
        return this.maxAtkBps;
    }

    public DescribeDDoSBpsMaxResponseBody setMaxAtkPps(Long maxAtkPps) {
        this.maxAtkPps = maxAtkPps;
        return this;
    }
    public Long getMaxAtkPps() {
        return this.maxAtkPps;
    }

    public DescribeDDoSBpsMaxResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDDoSBpsMaxResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
