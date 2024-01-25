// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("UserId")
    public String userId;

    public static UpdateAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorizationRequest self = new UpdateAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorizationRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateAuthorizationRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
