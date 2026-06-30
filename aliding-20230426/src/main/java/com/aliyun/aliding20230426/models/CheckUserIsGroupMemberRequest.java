// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CheckUserIsGroupMemberRequest extends TeaModel {
    @NameInMap("OpenConversationId")
    public String openConversationId;

    public static CheckUserIsGroupMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckUserIsGroupMemberRequest self = new CheckUserIsGroupMemberRequest();
        return TeaModel.build(map, self);
    }

    public CheckUserIsGroupMemberRequest setOpenConversationId(String openConversationId) {
        this.openConversationId = openConversationId;
        return this;
    }
    public String getOpenConversationId() {
        return this.openConversationId;
    }

}
