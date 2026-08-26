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
     * <p>The data center. This must be the same data center that you specified when you called <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageApp</a>.</p>
     * <blockquote>
     * <p>Valid values: \<code>cn-shanghai\\</code> (Shanghai) and \<code>ap-southeast-1\\</code> (Singapore).</p>
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
     * <p>The list of users to unmute. You can specify up to 30 users. Separate multiple user IDs with commas (,).</p>
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
