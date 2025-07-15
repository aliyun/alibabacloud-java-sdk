// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveMessageGroupBandShrinkRequest extends TeaModel {
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
     * <p>Specifies whether to mute all users.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BannedAll")
    public Boolean bannedAll;

    /**
     * <p>The ID of the user whom you want to mute. Separate multiple user IDs with commas (,). You can specify up to 30 users IDs.</p>
     */
    @NameInMap("BannnedUsers")
    public String bannnedUsersShrink;

    /**
     * <p>The data center. It must be the same as the data center that was specified when you called the <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageApp</a> operation to create the interactive messaging application. Valid values: cn-shanghai and ap-southeast-1 (Singapore).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The ID of the user whom you do not want to mute when you set the BannedAll parameter to true. Separate multiple user IDs with commas (,). You can specify up to 30 users IDs.</p>
     */
    @NameInMap("ExceptUsers")
    public String exceptUsersShrink;

    /**
     * <p>The group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>grouptest</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    public static ModifyLiveMessageGroupBandShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveMessageGroupBandShrinkRequest self = new ModifyLiveMessageGroupBandShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLiveMessageGroupBandShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyLiveMessageGroupBandShrinkRequest setBannedAll(Boolean bannedAll) {
        this.bannedAll = bannedAll;
        return this;
    }
    public Boolean getBannedAll() {
        return this.bannedAll;
    }

    public ModifyLiveMessageGroupBandShrinkRequest setBannnedUsersShrink(String bannnedUsersShrink) {
        this.bannnedUsersShrink = bannnedUsersShrink;
        return this;
    }
    public String getBannnedUsersShrink() {
        return this.bannnedUsersShrink;
    }

    public ModifyLiveMessageGroupBandShrinkRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public ModifyLiveMessageGroupBandShrinkRequest setExceptUsersShrink(String exceptUsersShrink) {
        this.exceptUsersShrink = exceptUsersShrink;
        return this;
    }
    public String getExceptUsersShrink() {
        return this.exceptUsersShrink;
    }

    public ModifyLiveMessageGroupBandShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
