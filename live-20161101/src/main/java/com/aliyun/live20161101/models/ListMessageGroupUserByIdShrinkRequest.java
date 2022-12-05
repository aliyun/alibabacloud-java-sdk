// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListMessageGroupUserByIdShrinkRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("UserIdList")
    public String userIdListShrink;

    public static ListMessageGroupUserByIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMessageGroupUserByIdShrinkRequest self = new ListMessageGroupUserByIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListMessageGroupUserByIdShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListMessageGroupUserByIdShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListMessageGroupUserByIdShrinkRequest setUserIdListShrink(String userIdListShrink) {
        this.userIdListShrink = userIdListShrink;
        return this;
    }
    public String getUserIdListShrink() {
        return this.userIdListShrink;
    }

}
