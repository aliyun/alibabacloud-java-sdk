// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLivePrivateLineRequest extends TeaModel {
    /**
     * <p>The acceleration channel.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-southeast-1</p>
     */
    @NameInMap("AccelerationArea")
    public String accelerationArea;

    /**
     * <p>The acceleration type. Valid values:</p>
     * <ul>
     * <li>play: streaming acceleration.</li>
     * <li>publish: stream ingest acceleration.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>play</p>
     */
    @NameInMap("AccelerationType")
    public String accelerationType;

    /**
     * <p>The application name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>live</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The streamer streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the acceleration channel to reuse. This parameter is required when Reuse is set to yes.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1iovsdpf01ym9su****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The acceleration bandwidth. Unit: Mbit/s. This parameter is required when Reuse is set to no.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("MaxBandwidth")
    public String maxBandwidth;

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
     * <p>Specifies whether to reuse an existing acceleration channel. Valid values:</p>
     * <ul>
     * <li>yes: Reuse an existing acceleration channel.</li>
     * <li>no: Create a new acceleration channel.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>no</p>
     */
    @NameInMap("Reuse")
    public String reuse;

    /**
     * <p>The live stream name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testStream</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    /**
     * <p>The live center. Valid values: cn-beijing, cn-shanghai, cn-shenzhen, cn-qingdao, ap-northeast-1, ap-southeast-5, eu-central-1, ap-southeast-1, and ap-south-1, which represent the live centers in Beijing, Shanghai, Shenzhen, Qingdao, Japan, Indonesia, Germany, and Singapore respectively.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("VideoCenter")
    public String videoCenter;

    public static CreateLivePrivateLineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLivePrivateLineRequest self = new CreateLivePrivateLineRequest();
        return TeaModel.build(map, self);
    }

    public CreateLivePrivateLineRequest setAccelerationArea(String accelerationArea) {
        this.accelerationArea = accelerationArea;
        return this;
    }
    public String getAccelerationArea() {
        return this.accelerationArea;
    }

    public CreateLivePrivateLineRequest setAccelerationType(String accelerationType) {
        this.accelerationType = accelerationType;
        return this;
    }
    public String getAccelerationType() {
        return this.accelerationType;
    }

    public CreateLivePrivateLineRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateLivePrivateLineRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateLivePrivateLineRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateLivePrivateLineRequest setMaxBandwidth(String maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
        return this;
    }
    public String getMaxBandwidth() {
        return this.maxBandwidth;
    }

    public CreateLivePrivateLineRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateLivePrivateLineRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateLivePrivateLineRequest setReuse(String reuse) {
        this.reuse = reuse;
        return this;
    }
    public String getReuse() {
        return this.reuse;
    }

    public CreateLivePrivateLineRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public CreateLivePrivateLineRequest setVideoCenter(String videoCenter) {
        this.videoCenter = videoCenter;
        return this;
    }
    public String getVideoCenter() {
        return this.videoCenter;
    }

}
