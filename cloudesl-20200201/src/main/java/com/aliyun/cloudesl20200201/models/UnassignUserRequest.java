// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class UnassignUserRequest extends TeaModel {
    @NameInMap("ExtraParams")
    public String extraParams;

    @NameInMap("UserId")
    public String userId;

    public static UnassignUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UnassignUserRequest self = new UnassignUserRequest();
        return TeaModel.build(map, self);
    }

    public UnassignUserRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

    public UnassignUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
