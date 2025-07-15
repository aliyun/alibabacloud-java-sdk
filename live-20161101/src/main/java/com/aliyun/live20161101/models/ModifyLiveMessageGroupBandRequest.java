// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveMessageGroupBandRequest extends TeaModel {
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
    public java.util.List<String> bannnedUsers;

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
    public java.util.List<String> exceptUsers;

    /**
     * <p>The group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>grouptest</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    public static ModifyLiveMessageGroupBandRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveMessageGroupBandRequest self = new ModifyLiveMessageGroupBandRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLiveMessageGroupBandRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyLiveMessageGroupBandRequest setBannedAll(Boolean bannedAll) {
        this.bannedAll = bannedAll;
        return this;
    }
    public Boolean getBannedAll() {
        return this.bannedAll;
    }

    public ModifyLiveMessageGroupBandRequest setBannnedUsers(java.util.List<String> bannnedUsers) {
        this.bannnedUsers = bannnedUsers;
        return this;
    }
    public java.util.List<String> getBannnedUsers() {
        return this.bannnedUsers;
    }

    public ModifyLiveMessageGroupBandRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public ModifyLiveMessageGroupBandRequest setExceptUsers(java.util.List<String> exceptUsers) {
        this.exceptUsers = exceptUsers;
        return this;
    }
    public java.util.List<String> getExceptUsers() {
        return this.exceptUsers;
    }

    public ModifyLiveMessageGroupBandRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
