// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetUserInRecycleBinRequest extends TeaModel {
    @NameInMap("UserAccessKeyId")
    public String userAccessKeyId;

    @NameInMap("UserId")
    public String userId;

    public static GetUserInRecycleBinRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserInRecycleBinRequest self = new GetUserInRecycleBinRequest();
        return TeaModel.build(map, self);
    }

    public GetUserInRecycleBinRequest setUserAccessKeyId(String userAccessKeyId) {
        this.userAccessKeyId = userAccessKeyId;
        return this;
    }
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    public GetUserInRecycleBinRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
