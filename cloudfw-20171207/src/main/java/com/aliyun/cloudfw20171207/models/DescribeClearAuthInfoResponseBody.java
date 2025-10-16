// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeClearAuthInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1755964800</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("LeftTimes")
    public Integer leftTimes;

    /**
     * <strong>example:</strong>
     * <p>8DDEE254-5639-5548-82D1-AAAC7347****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClearAuthInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClearAuthInfoResponseBody self = new DescribeClearAuthInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClearAuthInfoResponseBody setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public DescribeClearAuthInfoResponseBody setLeftTimes(Integer leftTimes) {
        this.leftTimes = leftTimes;
        return this;
    }
    public Integer getLeftTimes() {
        return this.leftTimes;
    }

    public DescribeClearAuthInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
