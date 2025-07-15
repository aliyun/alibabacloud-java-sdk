// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRealtimeDeliveryAccRequest extends TeaModel {
    /**
     * <p>The streaming domain.</p>
     * <ul>
     * <li>You can query one or more domain names. If you specify multiple domain names, separate them with commas (,).</li>
     * <li>If you leave this parameter empty, the data of all domain names within your Alibaba Cloud account is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <p>The end time must be later than the start time. The maximum time range that can be specified is one year.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T21:05:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity of the query. Unit: seconds. Valid values:</p>
     * <ul>
     * <li><strong>300</strong></li>
     * <li><strong>3600</strong></li>
     * <li><strong>86400</strong></li>
     * </ul>
     * <p>If you specify an invalid value or do not specify this parameter, the default value is used. If the specified time range is no more than three days, the default value is 300. If the specified time range is more than three days and no more than 30 days, the default value is 3600. If the specified time range is more than 30 days, the default value is 86400.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The name of the Logstore to which log entries are delivered. If you leave this parameter empty, the data of all Logstores is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>logstore_example</p>
     */
    @NameInMap("LogStore")
    public String logStore;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the Log Service project that is used for real-time log delivery. If you leave this parameter empty, the data of all Log Service projects is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>project_example</p>
     */
    @NameInMap("Project")
    public String project;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
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
