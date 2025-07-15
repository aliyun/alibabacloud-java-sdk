// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class BatchGetOnlineUsersRequest extends TeaModel {
    /**
     * <p>The ID of the interactive messaging application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a494caec-***-695ef345db77</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the message group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23wcaec-***695ef</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The list of user IDs. Separate multiple user IDs with commas (,). You can specify a maximum of 20 user IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>de1<strong>a0,hu</strong>9</p>
     */
    @NameInMap("UserIds")
    public String userIds;

    public static BatchGetOnlineUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetOnlineUsersRequest self = new BatchGetOnlineUsersRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetOnlineUsersRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BatchGetOnlineUsersRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public BatchGetOnlineUsersRequest setUserIds(String userIds) {
        this.userIds = userIds;
        return this;
    }
    public String getUserIds() {
        return this.userIds;
    }

}
