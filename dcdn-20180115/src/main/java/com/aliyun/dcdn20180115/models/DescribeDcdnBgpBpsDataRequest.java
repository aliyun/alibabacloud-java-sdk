// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnBgpBpsDataRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("DevicePort")
    public String devicePort;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Interval")
    public String interval;

    @NameInMap("Isp")
    public String isp;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnBgpBpsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnBgpBpsDataRequest self = new DescribeDcdnBgpBpsDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnBgpBpsDataRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public DescribeDcdnBgpBpsDataRequest setDevicePort(String devicePort) {
        this.devicePort = devicePort;
        return this;
    }
    public String getDevicePort() {
        return this.devicePort;
    }

    public DescribeDcdnBgpBpsDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnBgpBpsDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeDcdnBgpBpsDataRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public DescribeDcdnBgpBpsDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
