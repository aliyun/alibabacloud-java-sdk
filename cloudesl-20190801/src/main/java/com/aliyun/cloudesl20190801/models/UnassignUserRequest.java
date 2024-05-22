// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class UnassignUserRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static UnassignUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UnassignUserRequest self = new UnassignUserRequest();
        return TeaModel.build(map, self);
    }

    public UnassignUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
