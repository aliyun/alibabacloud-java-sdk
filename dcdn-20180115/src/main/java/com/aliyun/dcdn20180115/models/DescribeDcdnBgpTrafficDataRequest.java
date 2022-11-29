// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnBgpTrafficDataRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Interval")
    public String interval;

    @NameInMap("Isp")
    public String isp;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnBgpTrafficDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnBgpTrafficDataRequest self = new DescribeDcdnBgpTrafficDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnBgpTrafficDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnBgpTrafficDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeDcdnBgpTrafficDataRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public DescribeDcdnBgpTrafficDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
