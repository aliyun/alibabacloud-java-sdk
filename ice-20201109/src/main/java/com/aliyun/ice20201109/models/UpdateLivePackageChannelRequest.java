// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLivePackageChannelRequest extends TeaModel {
    /**
     * <p>The name of the channel. The name must be 1 to 200 characters in length and can contain only letters, digits, hyphens (-), and underscores (<em>). Format: [A-Za-z0-9</em>-]+.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>channel-1</p>
     */
    @NameInMap("ChannelName")
    public String channelName;

    /**
     * <p>The description of the channel. The description can be up to 1,000 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a test channel</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the channel group. The name must be 1 to 200 characters in length and can contain only letters, digits, hyphens (-), and underscores (<em>). Format: [A-Za-z0-9</em>-]+.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>channel-group-1</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The input protocol. Valid values: HLS, HLS_CMAF, and SRT_RTMP. If you select SRT_RTMP, you must output the stream to this MediaPackage channel through MediaLive.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HLS</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The number of m3u8 segments in the input stream. Valid values: 2 to 100. This parameter is required when the input protocol is HLS or HLS_CMAF.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SegmentCount")
    public Integer segmentCount;

    /**
     * <p>The duration of each segment in the input stream. Valid values: 1 to 30. This parameter is required when the input protocol is HLS or HLS_CMAF.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("SegmentDuration")
    public Integer segmentDuration;

    public static UpdateLivePackageChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLivePackageChannelRequest self = new UpdateLivePackageChannelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLivePackageChannelRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public UpdateLivePackageChannelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLivePackageChannelRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateLivePackageChannelRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public UpdateLivePackageChannelRequest setSegmentCount(Integer segmentCount) {
        this.segmentCount = segmentCount;
        return this;
    }
    public Integer getSegmentCount() {
        return this.segmentCount;
    }

    public UpdateLivePackageChannelRequest setSegmentDuration(Integer segmentDuration) {
        this.segmentDuration = segmentDuration;
        return this;
    }
    public Integer getSegmentDuration() {
        return this.segmentDuration;
    }

}
