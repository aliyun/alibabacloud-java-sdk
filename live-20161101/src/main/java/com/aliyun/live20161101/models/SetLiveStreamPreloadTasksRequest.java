// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveStreamPreloadTasksRequest extends TeaModel {
    /**
     * <p>The prefetch area. Valid values:</p>
     * <ul>
     * <li>domestic: the Chinese mainland.</li>
     * <li>overseas: outside the Chinese mainland, including Hong Kong (China), Macao (China), and Taiwan (China).</li>
     * <li>global: global acceleration.</li>
     * </ul>
     * <p>If you do not specify this parameter, the default prefetch area is the acceleration region configured for your domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>domestic</p>
     */
    @NameInMap("Area")
    public String area;

    /**
     * <p>The streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The live stream URLs. You can specify multiple URLs separated by commas (,). A maximum of 100 URLs can be specified.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PlayUrl")
    public String playUrl;

    /**
     * <p>The end time of the prefetch task in UTC. Example: 2016-06-30T19:00:00Z. The interval between EndTime and StartTime cannot exceed 6 hours.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-30T19:00:00Z</p>
     */
    @NameInMap("PreloadedEndTime")
    public String preloadedEndTime;

    /**
     * <p>The start time of the prefetch task in UTC. Example: 2016-06-29T19:00:00Z. If you do not specify this parameter, the default prefetch duration is 1 hour.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-29T19:00:00Z</p>
     */
    @NameInMap("PreloadedStartTime")
    public String preloadedStartTime;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static SetLiveStreamPreloadTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLiveStreamPreloadTasksRequest self = new SetLiveStreamPreloadTasksRequest();
        return TeaModel.build(map, self);
    }

    public SetLiveStreamPreloadTasksRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public SetLiveStreamPreloadTasksRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetLiveStreamPreloadTasksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetLiveStreamPreloadTasksRequest setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
        return this;
    }
    public String getPlayUrl() {
        return this.playUrl;
    }

    public SetLiveStreamPreloadTasksRequest setPreloadedEndTime(String preloadedEndTime) {
        this.preloadedEndTime = preloadedEndTime;
        return this;
    }
    public String getPreloadedEndTime() {
        return this.preloadedEndTime;
    }

    public SetLiveStreamPreloadTasksRequest setPreloadedStartTime(String preloadedStartTime) {
        this.preloadedStartTime = preloadedStartTime;
        return this;
    }
    public String getPreloadedStartTime() {
        return this.preloadedStartTime;
    }

    public SetLiveStreamPreloadTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
