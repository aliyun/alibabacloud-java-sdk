// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainTimeShiftDataRequest extends TeaModel {
    /**
     * <p>The streaming domain to query.</p>
     * <blockquote>
     * <ul>
     * <li>When you specify DomainName, make sure that the specified domain is a live streaming domain and that the user calling this operation has permissions on the specified domain.</li>
     * <li>You can specify a single domain or multiple domains. Separate multiple domains with commas (,).</li>
     * <li>If this parameter is left empty, the merged data of all live streaming domains is returned by default.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end time. The end time must be later than the start time. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-03-03T02:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity of the queried data. Unit: seconds. Valid values:</p>
     * <ul>
     * <li><ol start="300">
     * <li></li>
     * </ol>
     * </li>
     * <li><ol start="3600">
     * <li></li>
     * </ol>
     * </li>
     * <li><ol start="86400">
     * <li></li>
     * </ol>
     * </li>
     * </ul>
     * <p>If you do not specify this parameter or specify an unsupported value, the default value 300 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public String interval;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format in UTC.</p>
     * <blockquote>
     * <ul>
     * <li>The minimum data granularity is 5 minutes.</li>
     * <li>If you do not specify this parameter, data of the last 24 hours is returned by default.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-03-03T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeLiveDomainTimeShiftDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainTimeShiftDataRequest self = new DescribeLiveDomainTimeShiftDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainTimeShiftDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainTimeShiftDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainTimeShiftDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeLiveDomainTimeShiftDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveDomainTimeShiftDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveDomainTimeShiftDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
