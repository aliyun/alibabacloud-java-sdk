// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnBgpTrafficDataRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-11-30T00:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The data collection interval. Unit: seconds. Valid values: 300 and 3600. Default value: 300. The default value of 300 seconds is equal to 5 minutes. The value of this parameter varies based on the time range from the specified start time to the specified end time.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The ISP. Separate multiple ISPs with commas (,). If you specify multiple ISPs, the data for the ISPs is aggregated. If you do not specify this parameter, the operation returns the data for all the ISPs.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>cu: China Unicom</li>
     * <li>cmi: China Mobile</li>
     * <li>ct: China Telecom</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cu</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>The minimum data collection interval is an hour.</p>
     * <p>If you do not set this parameter, data collected in the last 24 hours is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-11-29T00:00:00Z</p>
     */
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
