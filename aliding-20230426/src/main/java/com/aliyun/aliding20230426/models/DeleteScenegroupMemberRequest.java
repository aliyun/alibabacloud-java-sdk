// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteScenegroupMemberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OpenConversationId")
    public String openConversationId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserIds")
    public String userIds;

    public static DeleteScenegroupMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScenegroupMemberRequest self = new DeleteScenegroupMemberRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScenegroupMemberRequest setOpenConversationId(String openConversationId) {
        this.openConversationId = openConversationId;
        return this;
    }
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    public DeleteScenegroupMemberRequest setUserIds(String userIds) {
        this.userIds = userIds;
        return this;
    }
    public String getUserIds() {
        return this.userIds;
    }

}
