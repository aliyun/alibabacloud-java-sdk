// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainStreamTranscodeDataRequest extends TeaModel {
    /**
     * <p>The streaming domain of the streamer to query.</p>
     * <ul>
     * <li>You can query a single domain name or multiple domain names at a time. Separate multiple domain names with commas (,).</li>
     * <li>If this parameter is left empty, the merged data of all live streaming domain names is returned by default.</li>
     * <li>When you specify DomainName, make sure that the specified domain name is a live streaming domain name and that the user calling this operation has the permissions to operate on the specified domain name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-10T22:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity of the query. Unit: seconds. Valid values:</p>
     * <ul>
     * <li><strong>3600</strong>: by hour.</li>
     * <li><strong>86400</strong>: by day.</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is left empty, the default granularity is by hour.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Interval")
    public String interval;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The time precision of the query. Valid values:</p>
     * <ul>
     * <li><strong>min</strong> (default): in minutes.</li>
     * <li><strong>sec</strong>: in seconds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>min</p>
     */
    @NameInMap("Precision")
    public String precision;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The grouping key. Valid values:</p>
     * <ul>
     * <li><strong>domain</strong>: domain name. If the Split (grouping key) parameter is set to domain, the Domain response parameter takes effect.</li>
     * <li><strong>region</strong>: live center region. If the Split (grouping key) parameter is set to region, the Region response parameter takes effect.</li>
     * <li><strong>transcode_type</strong>: transcoding type. If the Split (grouping key) parameter is set to transcode_type, the TanscodeType response parameter takes effect.</li>
     * <li><strong>resolution</strong>: resolution. If the Split (grouping key) parameter is set to resolution, the Resolution response parameter takes effect.</li>
     * <li><strong>fps</strong>: frame rate. If the Split (grouping key) parameter is set to fps, the Fps response parameter takes effect.</li>
     * </ul>
     * <p>You can specify one or more values. Separate multiple values with commas (,).</p>
     * <p>Default value: <code>domain,region,transcode_type,resolution,fps</code>, which means all grouping keys are applied.</p>
     * 
     * <strong>example:</strong>
     * <p>domain</p>
     */
    @NameInMap("Split")
    public String split;

    /**
     * <p>The beginning of the time range to query. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format in UTC.</p>
     * <ul>
     * <li>The minimum data time granularity is 1 hour.</li>
     * <li>If this parameter is left empty, data from the last 24 hours is read by default.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeLiveDomainStreamTranscodeDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainStreamTranscodeDataRequest self = new DescribeLiveDomainStreamTranscodeDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainStreamTranscodeDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainStreamTranscodeDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainStreamTranscodeDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeLiveDomainStreamTranscodeDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveDomainStreamTranscodeDataRequest setPrecision(String precision) {
        this.precision = precision;
        return this;
    }
    public String getPrecision() {
        return this.precision;
    }

    public DescribeLiveDomainStreamTranscodeDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveDomainStreamTranscodeDataRequest setSplit(String split) {
        this.split = split;
        return this;
    }
    public String getSplit() {
        return this.split;
    }

    public DescribeLiveDomainStreamTranscodeDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
