// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLivePackageChannelRequest extends TeaModel {
    /**
     * <p>频道名称，字符必须为大小写英文字母或-、<em>。
     * 1 ~ 200个字符。
     * 格式：[A-Za-z0-9</em>-]+</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>channel-1</p>
     */
    @NameInMap("ChannelName")
    public String channelName;

    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>频道描述，最大1000个字符</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>频道组名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>channel-group-1</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>输入协议，目前仅支持HLS</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HLS</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>输入流m3u8切片个数，2～100</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SegmentCount")
    public Integer segmentCount;

    /**
     * <p>输入流切片时长，1～30</p>
     * <p>This parameter is required.</p>
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
