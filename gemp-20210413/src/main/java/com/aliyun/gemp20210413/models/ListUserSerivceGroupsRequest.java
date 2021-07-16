// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListUserSerivceGroupsRequest extends TeaModel {
    // 用户ID
    @NameInMap("userId")
    public Long userId;

    // clientToken
    @NameInMap("clientToken")
    public String clientToken;

    public static ListUserSerivceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserSerivceGroupsRequest self = new ListUserSerivceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserSerivceGroupsRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public ListUserSerivceGroupsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
