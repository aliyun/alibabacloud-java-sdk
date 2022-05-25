// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetUserIdByExternalIdRequest extends TeaModel {
    // 账户外部ID
    @NameInMap("userExternalId")
    public String userExternalId;

    public static GetUserIdByExternalIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdByExternalIdRequest self = new GetUserIdByExternalIdRequest();
        return TeaModel.build(map, self);
    }

    public GetUserIdByExternalIdRequest setUserExternalId(String userExternalId) {
        this.userExternalId = userExternalId;
        return this;
    }
    public String getUserExternalId() {
        return this.userExternalId;
    }

}
