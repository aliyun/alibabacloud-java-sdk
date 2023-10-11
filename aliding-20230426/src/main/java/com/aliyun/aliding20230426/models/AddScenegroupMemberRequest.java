// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddScenegroupMemberRequest extends TeaModel {
    @NameInMap("OpenConversationId")
    public String openConversationId;

    @NameInMap("UserIds")
    public String userIds;

    public static AddScenegroupMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddScenegroupMemberRequest self = new AddScenegroupMemberRequest();
        return TeaModel.build(map, self);
    }

    public AddScenegroupMemberRequest setOpenConversationId(String openConversationId) {
        this.openConversationId = openConversationId;
        return this;
    }
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    public AddScenegroupMemberRequest setUserIds(String userIds) {
        this.userIds = userIds;
        return this;
    }
    public String getUserIds() {
        return this.userIds;
    }

}
