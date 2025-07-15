// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveStreamBlockRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs. You can view the application name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The blocking type. Valid values: blacklist and whitelist.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>blacklist</p>
     */
    @NameInMap("BlockType")
    public String blockType;

    /**
     * <p>The streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The blocked region. If you specify multiple regions, such as CN and AS, separate them with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("LocationList")
    public String locationList;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The time when the blocking ends. The time must be in UTC. If you do not specify this parameter, the blocking is valid for 7 days by default.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-29T19:00:00Z</p>
     */
    @NameInMap("ReleaseTime")
    public String releaseTime;

    /**
     * <p>The name of the live stream. You can view the stream name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveStream****</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    public static SetLiveStreamBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLiveStreamBlockRequest self = new SetLiveStreamBlockRequest();
        return TeaModel.build(map, self);
    }

    public SetLiveStreamBlockRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SetLiveStreamBlockRequest setBlockType(String blockType) {
        this.blockType = blockType;
        return this;
    }
    public String getBlockType() {
        return this.blockType;
    }

    public SetLiveStreamBlockRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetLiveStreamBlockRequest setLocationList(String locationList) {
        this.locationList = locationList;
        return this;
    }
    public String getLocationList() {
        return this.locationList;
    }

    public SetLiveStreamBlockRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetLiveStreamBlockRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetLiveStreamBlockRequest setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }
    public String getReleaseTime() {
        return this.releaseTime;
    }

    public SetLiveStreamBlockRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}
