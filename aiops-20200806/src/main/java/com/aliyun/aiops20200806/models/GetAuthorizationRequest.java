// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAuthorizationRequest extends TeaModel {
    @NameInMap("UserId")
    public String userId;

    public static GetAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationRequest self = new GetAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
