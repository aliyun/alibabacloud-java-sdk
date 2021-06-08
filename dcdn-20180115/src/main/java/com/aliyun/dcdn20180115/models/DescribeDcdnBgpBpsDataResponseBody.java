// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnBgpBpsDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BgpDataInterval")
    public java.util.List<DescribeDcdnBgpBpsDataResponseBodyBgpDataInterval> bgpDataInterval;

    public static DescribeDcdnBgpBpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnBgpBpsDataResponseBody self = new DescribeDcdnBgpBpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnBgpBpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnBgpBpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnBgpBpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnBgpBpsDataResponseBody setBgpDataInterval(java.util.List<DescribeDcdnBgpBpsDataResponseBodyBgpDataInterval> bgpDataInterval) {
        this.bgpDataInterval = bgpDataInterval;
        return this;
    }
    public java.util.List<DescribeDcdnBgpBpsDataResponseBodyBgpDataInterval> getBgpDataInterval() {
        return this.bgpDataInterval;
    }

    public static class DescribeDcdnBgpBpsDataResponseBodyBgpDataInterval extends TeaModel {
        @NameInMap("Out")
        public Float out;

        @NameInMap("In")
        public Float in;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDcdnBgpBpsDataResponseBodyBgpDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnBgpBpsDataResponseBodyBgpDataInterval self = new DescribeDcdnBgpBpsDataResponseBodyBgpDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnBgpBpsDataResponseBodyBgpDataInterval setOut(Float out) {
            this.out = out;
            return this;
        }
        public Float getOut() {
            return this.out;
        }

        public DescribeDcdnBgpBpsDataResponseBodyBgpDataInterval setIn(Float in) {
            this.in = in;
            return this;
        }
        public Float getIn() {
            return this.in;
        }

        public DescribeDcdnBgpBpsDataResponseBodyBgpDataInterval setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

}
