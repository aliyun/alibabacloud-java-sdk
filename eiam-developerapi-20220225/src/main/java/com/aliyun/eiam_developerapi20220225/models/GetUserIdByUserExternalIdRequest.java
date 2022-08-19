// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetUserIdByUserExternalIdRequest extends TeaModel {
    @NameInMap("userExternalId")
    public String userExternalId;

    @NameInMap("userSourceId")
    public String userSourceId;

    @NameInMap("userSourceType")
    public String userSourceType;

    public static GetUserIdByUserExternalIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdByUserExternalIdRequest self = new GetUserIdByUserExternalIdRequest();
        return TeaModel.build(map, self);
    }

    public GetUserIdByUserExternalIdRequest setUserExternalId(String userExternalId) {
        this.userExternalId = userExternalId;
        return this;
    }
    public String getUserExternalId() {
        return this.userExternalId;
    }

    public GetUserIdByUserExternalIdRequest setUserSourceId(String userSourceId) {
        this.userSourceId = userSourceId;
        return this;
    }
    public String getUserSourceId() {
        return this.userSourceId;
    }

    public GetUserIdByUserExternalIdRequest setUserSourceType(String userSourceType) {
        this.userSourceType = userSourceType;
        return this;
    }
    public String getUserSourceType() {
        return this.userSourceType;
    }

}
