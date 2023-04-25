// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnBgpTrafficDataResponseBody extends TeaModel {
    /**
     * <p>The BGP traffic at each time interval.</p>
     */
    @NameInMap("BgpDataInterval")
    public java.util.List<DescribeDcdnBgpTrafficDataResponseBodyBgpDataInterval> bgpDataInterval;

    /**
     * <p>The end of the time range during which data was queried.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start of the time range during which data was queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnBgpTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnBgpTrafficDataResponseBody self = new DescribeDcdnBgpTrafficDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnBgpTrafficDataResponseBody setBgpDataInterval(java.util.List<DescribeDcdnBgpTrafficDataResponseBodyBgpDataInterval> bgpDataInterval) {
        this.bgpDataInterval = bgpDataInterval;
        return this;
    }
    public java.util.List<DescribeDcdnBgpTrafficDataResponseBodyBgpDataInterval> getBgpDataInterval() {
        return this.bgpDataInterval;
    }

    public DescribeDcdnBgpTrafficDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnBgpTrafficDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnBgpTrafficDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDcdnBgpTrafficDataResponseBodyBgpDataInterval extends TeaModel {
        /**
         * <p>The inbound traffic. Unit: bytes.</p>
         */
        @NameInMap("In")
        public Long in;

        /**
         * <p>The outbound traffic. Unit: bytes.</p>
         */
        @NameInMap("Out")
        public Long out;

        /**
         * <p>The timestamp of the data returned.</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDcdnBgpTrafficDataResponseBodyBgpDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnBgpTrafficDataResponseBodyBgpDataInterval self = new DescribeDcdnBgpTrafficDataResponseBodyBgpDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnBgpTrafficDataResponseBodyBgpDataInterval setIn(Long in) {
            this.in = in;
            return this;
        }
        public Long getIn() {
            return this.in;
        }

        public DescribeDcdnBgpTrafficDataResponseBodyBgpDataInterval setOut(Long out) {
            this.out = out;
            return this;
        }
        public Long getOut() {
            return this.out;
        }

        public DescribeDcdnBgpTrafficDataResponseBodyBgpDataInterval setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

}
