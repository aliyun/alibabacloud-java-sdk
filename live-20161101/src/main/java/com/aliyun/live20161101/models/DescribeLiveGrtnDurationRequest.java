// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveGrtnDurationRequest extends TeaModel {
    /**
     * <p>The ID of the application. Separate multiple application IDs with commas (,). You can specify up to 30 application IDs. By default, the aggregated data of all applications is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>4346289a-a790-4869-9e23-22766d5e****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the billable region. Valid values:</p>
     * <ul>
     * <li>CN: Chinese mainland</li>
     * <li>OverSeas: countries and regions outside the Chinese mainland</li>
     * <li>AP1: Asia Pacific 1, including Hong Kong (China), Macao (China), Taiwan (China), Japan, and other Southeast Asia countries and regions except Vietnam and Indonesia</li>
     * <li>AP2: Asia Pacific 2, including Indonesia, South Korea, and Vietnam</li>
     * <li>AP3: Asia Pacific 3, including Australia and New Zealand</li>
     * <li>NA: North America, including US and Canada</li>
     * <li>SA: South America, specifically meaning Brazil</li>
     * <li>EU: Europe, including Ukraine, UK, France, Netherlands, Spain, Italy, Sweden, and Germany</li>
     * <li>MEAA: Middle East and Africa, including South Africa, Oman, UAE, and Kuwait</li>
     * </ul>
     * <p>If you do not specify this parameter, data of all regions is aggregated and returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("Area")
    public String area;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The end time must be later than the start time. The time range that can be specified is greater than or equal to 5 minutes and less than or equal to 31 days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity of the query. Unit: seconds. Valid values:</p>
     * <ul>
     * <li>300</li>
     * <li>3600</li>
     * <li>86400</li>
     * </ul>
     * <p>If you specify an invalid value or do not specify this parameter, the default value 3600 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Interval")
    public String interval;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeLiveGrtnDurationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveGrtnDurationRequest self = new DescribeLiveGrtnDurationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveGrtnDurationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeLiveGrtnDurationRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public DescribeLiveGrtnDurationRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveGrtnDurationRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeLiveGrtnDurationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveGrtnDurationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveGrtnDurationRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
