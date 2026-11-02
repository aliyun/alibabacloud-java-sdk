// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLivePackageChannelRequest extends TeaModel {
    /**
     * <p>The name of the channel. The name can contain only uppercase and lowercase letters, digits, hyphens, and underscores. It must be 1 to 200 characters in length. Format: [A-Za-z0-9_-]+.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>channel-1</p>
     */
    @NameInMap("ChannelName")
    public String channelName;

    /**
     * <p>The client token used to ensure request idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>12e8864746a0a398</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the channel. It can be up to 1,000 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a test channel</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the channel group. The name can contain only uppercase and lowercase letters, digits, hyphens, and underscores. It must be 1 to 200 characters in length. Format: [A-Za-z0-9_-]+.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>channel-group-1</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The ingest protocol. Valid values: HLS, HLS_CMAF, and SRT_RTMP. If you select SRT_RTMP, you must output the stream to this MediaPackage channel through MediaLive.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HLS</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The number of m3u8 segments for the ingest stream. Valid values: 2 to 100. This parameter is required when the ingest protocol is HLS or HLS_CMAF.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SegmentCount")
    public Integer segmentCount;

    /**
     * <p>The segment duration for the ingest stream. Valid values: 1 to 30. This parameter is required when the ingest protocol is HLS or HLS_CMAF.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("SegmentDuration")
    public Integer segmentDuration;

    public static CreateLivePackageChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLivePackageChannelRequest self = new CreateLivePackageChannelRequest();
        return TeaModel.build(map, self);
    }

    public CreateLivePackageChannelRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public CreateLivePackageChannelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateLivePackageChannelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLivePackageChannelRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateLivePackageChannelRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateLivePackageChannelRequest setSegmentCount(Integer segmentCount) {
        this.segmentCount = segmentCount;
        return this;
    }
    public Integer getSegmentCount() {
        return this.segmentCount;
    }

    public CreateLivePackageChannelRequest setSegmentDuration(Integer segmentDuration) {
        this.segmentDuration = segmentDuration;
        return this;
    }
    public Integer getSegmentDuration() {
        return this.segmentDuration;
    }

}
