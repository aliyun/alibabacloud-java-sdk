// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainStreamTranscodeDataRequest extends TeaModel {
    /**
     * <p>The main streaming domain to query.</p>
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
     * <li><strong>3600</strong>: 1 hour</li>
     * <li><strong>86400</strong>: 1 day</li>
     * </ul>
     * <blockquote>
     * <p> If you do not specify this parameter, the time granularity of 1 hour is used by default.</p>
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

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The key that is used to group data. Valid values:</p>
     * <ul>
     * <li><strong>domain</strong>: The DomainName parameter is available in the response only if Split is set to domain.</li>
     * <li><strong>region</strong>: The Region parameter is available in the response only if Split is set to region.</li>
     * <li><strong>transcode_type</strong>: The TanscodeType parameter is available in the response only if Split is set to transcode_type.</li>
     * <li><strong>resolution</strong>: The Resolution parameter is available in the response only if Split is set to resolution.</li>
     * <li><strong>fps</strong>: The Fps parameter is available in the response only if Split is set to fps.</li>
     * </ul>
     * <p>You can specify one or more keys. If you specify multiple keys, separate them with commas (,).</p>
     * <p>Default value: <code>domain,region,transcode_type,resolution,fps</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>domain</p>
     */
    @NameInMap("Split")
    public String split;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <ul>
     * <li>The minimum query interval is 1 hour.</li>
     * <li>If you do not set this parameter, the transcoding length for the last 24 hours is returned.</li>
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
