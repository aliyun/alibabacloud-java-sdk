// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveGrtnDurationRequest extends TeaModel {
    /**
     * <p>Application ID. You can query multiple application IDs separated by commas (half-width). A maximum of 30 IDs can be queried. By default, aggregated data for all applications is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>4346289a-a790-4869-9e23-22766d5e****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The area code. Valid values:</p>
     * <ul>
     * <li>CN: Chinese mainland.</li>
     * <li>OverSeas: Overseas regions.</li>
     * <li>AP1: Asia Pacific 1, including Hong Kong (China), Macao (China), Taiwan (China), Japan, and Southeast Asian countries except Vietnam and Indonesia.</li>
     * <li>AP2: Asia Pacific 2, including Indonesia, South Korea, and Vietnam.</li>
     * <li>AP3: Asia Pacific 3, including Australia and New Zealand.</li>
     * <li>NA: North America, including the United States and Canada.</li>
     * <li>SA: South America, specifically Brazil.</li>
     * <li>EU: Europe, including Ukraine, the United Kingdom, France, the Netherlands, Spain, Italy, Sweden, and Germany.</li>
     * <li>MEAA: Middle East and Africa, including South Africa, Oman, the United Arab Emirates, and Kuwait.</li>
     * </ul>
     * <p>If not specified, aggregated data for all areas is returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("Area")
    public String area;

    /**
     * <p>The end time must be later than the start time. The query granularity must be ≥ 5 minutes and ≤ 31 days. The date format follows the ISO 8601 notation and uses UTC time in the format: YYYY-MM-DDThh:mm:ssZ.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity for querying data. Unit: seconds. Valid values:</p>
     * <ul>
     * <li>300</li>
     * <li>3600</li>
     * <li>86400</li>
     * </ul>
     * <p>If not specified or an unsupported value is passed, the default value of 3600 seconds is used.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Interval")
    public String interval;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time for data retrieval. The date format follows the ISO 8601 notation and uses UTC time in the format: YYYY-MM-DDThh:mm:ssZ.</p>
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
