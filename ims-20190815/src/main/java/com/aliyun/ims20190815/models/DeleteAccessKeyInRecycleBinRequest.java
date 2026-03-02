// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteAccessKeyInRecycleBinRequest extends TeaModel {
    @NameInMap("UserAccessKeyId")
    public String userAccessKeyId;

    @NameInMap("UserId")
    public String userId;

    public static DeleteAccessKeyInRecycleBinRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessKeyInRecycleBinRequest self = new DeleteAccessKeyInRecycleBinRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAccessKeyInRecycleBinRequest setUserAccessKeyId(String userAccessKeyId) {
        this.userAccessKeyId = userAccessKeyId;
        return this;
    }
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    public DeleteAccessKeyInRecycleBinRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
