// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class DeleteWhitelistUserRequest extends TeaModel {
    @NameInMap("userId")
    public String userId;

    public static DeleteWhitelistUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWhitelistUserRequest self = new DeleteWhitelistUserRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWhitelistUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
