// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RemoveLiveMessageGroupBandShrinkRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The data center. It must be the same as the data center that was specified when you called the <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageApp</a> operation to create the interactive messaging application.</p>
     * <blockquote>
     * <p> Valid values: cn-shanghai and ap-southeast-1 (Singapore).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>grouptest</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The users whom you want to unmute.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UnbannedUsers")
    public String unbannedUsersShrink;

    public static RemoveLiveMessageGroupBandShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveLiveMessageGroupBandShrinkRequest self = new RemoveLiveMessageGroupBandShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveLiveMessageGroupBandShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RemoveLiveMessageGroupBandShrinkRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public RemoveLiveMessageGroupBandShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RemoveLiveMessageGroupBandShrinkRequest setUnbannedUsersShrink(String unbannedUsersShrink) {
        this.unbannedUsersShrink = unbannedUsersShrink;
        return this;
    }
    public String getUnbannedUsersShrink() {
        return this.unbannedUsersShrink;
    }

}
