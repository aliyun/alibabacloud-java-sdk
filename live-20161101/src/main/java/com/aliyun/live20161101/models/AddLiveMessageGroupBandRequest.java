// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveMessageGroupBandRequest extends TeaModel {
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
     * <p>The users whom you want to mute.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BannedUsers")
    public java.util.List<String> bannedUsers;

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

    public static AddLiveMessageGroupBandRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveMessageGroupBandRequest self = new AddLiveMessageGroupBandRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveMessageGroupBandRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AddLiveMessageGroupBandRequest setBannedUsers(java.util.List<String> bannedUsers) {
        this.bannedUsers = bannedUsers;
        return this;
    }
    public java.util.List<String> getBannedUsers() {
        return this.bannedUsers;
    }

    public AddLiveMessageGroupBandRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public AddLiveMessageGroupBandRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
