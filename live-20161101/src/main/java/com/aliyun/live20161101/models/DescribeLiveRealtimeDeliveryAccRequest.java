// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRealtimeDeliveryAccRequest extends TeaModel {
    /**
     * <p>The streaming domain.</p>
     * <ul>
     * <li>You can specify a single domain name or multiple domain names. Separate multiple domain names with commas (,).</li>
     * <li>If this parameter is not specified, the merged data of all live streaming domain names is returned by default.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end time. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * <p>The end time must be later than the start time. The interval between the start time and end time cannot exceed one year.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T21:05:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity of the queried data. Unit: seconds. Valid values:</p>
     * <ul>
     * <li><strong>300</strong></li>
     * <li><strong>3600</strong></li>
     * <li><strong>86400</strong></li>
     * </ul>
     * <p>If this parameter is not specified or the specified value is not supported, the default value is 300 seconds when the time span does not exceed 3 days, 3600 seconds when the time span exceeds 3 days, and 86400 seconds when the time span exceeds 30 days.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The Logstore for real-time log delivery. If this parameter is not specified, the merged data of all Logstores is returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>logstore_example</p>
     */
    @NameInMap("LogStore")
    public String logStore;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The Project for real-time log delivery. If this parameter is not specified, the merged data of all Projects is returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>project_example</p>
     */
    @NameInMap("Project")
    public String project;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeLiveRealtimeDeliveryAccRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveRealtimeDeliveryAccRequest self = new DescribeLiveRealtimeDeliveryAccRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveRealtimeDeliveryAccRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveRealtimeDeliveryAccRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveRealtimeDeliveryAccRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeLiveRealtimeDeliveryAccRequest setLogStore(String logStore) {
        this.logStore = logStore;
        return this;
    }
    public String getLogStore() {
        return this.logStore;
    }

    public DescribeLiveRealtimeDeliveryAccRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveRealtimeDeliveryAccRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DescribeLiveRealtimeDeliveryAccRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveRealtimeDeliveryAccRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
