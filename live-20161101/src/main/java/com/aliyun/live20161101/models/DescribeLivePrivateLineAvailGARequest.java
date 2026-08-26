// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLivePrivateLineAvailGARequest extends TeaModel {
    /**
     * <p>The acceleration channel.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-southeast-1</p>
     */
    @NameInMap("AccelerationArea")
    public String accelerationArea;

    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>live</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The streamer\&quot;s streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Specifies whether to query the Alibaba Cloud Global Accelerator (GA) instance. Valid values:</p>
     * <ul>
     * <li>yes: Queries the GA instance status.</li>
     * <li>no: Queries the attachment details between the GA instance and the live streaming link.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>no</p>
     */
    @NameInMap("IsGaInstance")
    public String isGaInstance;

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
     * <p>The live stream name.</p>
     * 
     * <strong>example:</strong>
     * <p>testStream</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    /**
     * <p>The live center. Valid values: cn-beijing, cn-shanghai, cn-shenzhen, cn-qingdao, ap-northeast-1, ap-southeast-5, eu-central-1, and ap-southeast-1, ap-south-1, which represent the live centers located in Beijing, Shanghai, Shenzhen, Qingdao, Japan, Indonesia, Germany, and Singapore.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("VideoCenter")
    public String videoCenter;

    public static DescribeLivePrivateLineAvailGARequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePrivateLineAvailGARequest self = new DescribeLivePrivateLineAvailGARequest();
        return TeaModel.build(map, self);
    }

    public DescribeLivePrivateLineAvailGARequest setAccelerationArea(String accelerationArea) {
        this.accelerationArea = accelerationArea;
        return this;
    }
    public String getAccelerationArea() {
        return this.accelerationArea;
    }

    public DescribeLivePrivateLineAvailGARequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeLivePrivateLineAvailGARequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLivePrivateLineAvailGARequest setIsGaInstance(String isGaInstance) {
        this.isGaInstance = isGaInstance;
        return this;
    }
    public String getIsGaInstance() {
        return this.isGaInstance;
    }

    public DescribeLivePrivateLineAvailGARequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLivePrivateLineAvailGARequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLivePrivateLineAvailGARequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public DescribeLivePrivateLineAvailGARequest setVideoCenter(String videoCenter) {
        this.videoCenter = videoCenter;
        return this;
    }
    public String getVideoCenter() {
        return this.videoCenter;
    }

}
