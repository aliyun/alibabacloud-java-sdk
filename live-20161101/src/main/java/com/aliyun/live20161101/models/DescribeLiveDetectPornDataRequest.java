// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDetectPornDataRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>The main streaming domain to query.</p>
     * <ul>
     * <li>You can query one or more domain names. If you specify multiple domain names, separate them with commas (,).</li>
     * <li>If you do not specify this parameter, the data of all domain names within your Alibaba Cloud account is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-10T09:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether a quota of free image scanning is available. Valid values:</p>
     * <ul>
     * <li><strong>free</strong>: specifies that a quota of free image scanning is available.</li>
     * <li><strong>charge</strong>: specifies that a quota of free image scanning is not available and fees are charged.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>free</p>
     */
    @NameInMap("Fee")
    public String fee;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the domain name resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The moderation scenario. Valid values:</p>
     * <ul>
     * <li><strong>porn</strong>: pornography detection. This is the default value.</li>
     * <li><strong>terrorism</strong>: terrorism detection</li>
     * <li><strong>ad</strong>: ad violation detection</li>
     * <li><strong>live</strong>: undesirable scene detection</li>
     * <li><strong>logo</strong>: logo detection</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>porn</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <p>The fields based on which data is grouped. Separate multiple fields with commas (,).</p>
     * <blockquote>
     * <p>If you leave the <strong>SplitBy</strong> parameter empty, only the <strong>TimeStamp</strong> and <strong>Count</strong> parameters are returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>liveApp****,liveStream****</p>
     */
    @NameInMap("SplitBy")
    public String splitBy;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You can query data in the last 90 days.</p>
     * </li>
     * <li><p>The minimum data granularity is 5 minutes. If you do not specify this parameter, data in the last 24 hours is queried.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2017-12-10T08:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the live stream.</p>
     * 
     * <strong>example:</strong>
     * <p>liveStream****</p>
     */
    @NameInMap("Stream")
    public String stream;

    public static DescribeLiveDetectPornDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDetectPornDataRequest self = new DescribeLiveDetectPornDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDetectPornDataRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public DescribeLiveDetectPornDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDetectPornDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDetectPornDataRequest setFee(String fee) {
        this.fee = fee;
        return this;
    }
    public String getFee() {
        return this.fee;
    }

    public DescribeLiveDetectPornDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveDetectPornDataRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeLiveDetectPornDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveDetectPornDataRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public DescribeLiveDetectPornDataRequest setSplitBy(String splitBy) {
        this.splitBy = splitBy;
        return this;
    }
    public String getSplitBy() {
        return this.splitBy;
    }

    public DescribeLiveDetectPornDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveDetectPornDataRequest setStream(String stream) {
        this.stream = stream;
        return this;
    }
    public String getStream() {
        return this.stream;
    }

}
