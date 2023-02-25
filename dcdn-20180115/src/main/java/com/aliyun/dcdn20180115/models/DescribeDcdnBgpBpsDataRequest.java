// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnBgpBpsDataRequest extends TeaModel {
    /**
     * <p>The name of the device. If you specify this parameter, the data of the device is returned. Otherwise, the data of all devices is returned.</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The port of the device. If you specify this parameter, the data of the port is returned. Otherwise, the data of all ports is returned. This parameter takes effect only when the **DeviceName** parameter is specified.</p>
     */
    @NameInMap("DevicePort")
    public String devicePort;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The data collection interval. Unit: seconds. Valid values: 300 and 3600. Default value: 300. The default value of 300 seconds is equal to 5 minutes. The value of this parameter varies based on the time range from the specified start time to the specified end time.</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The ISPs. If you need to specify multiple ISPs, separate them with commas (,). If you specify multiple ISPs, the data for the ISPs is aggregated. If you do not specify this parameter, the operation returns the data for all the ISPs.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   cu: China Unicom</p>
     * <p>*   cmi: China Mobile</p>
     * <p>*   ct: China Telecom</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>The minimum data collection interval is an hour.</p>
     * <br>
     * <p>If you do not set this parameter, data collected in the last 24 hours is queried.</p>
     */
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
