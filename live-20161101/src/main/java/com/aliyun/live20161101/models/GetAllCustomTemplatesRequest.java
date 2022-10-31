// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetAllCustomTemplatesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("UserId")
    public String userId;

    public static GetAllCustomTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAllCustomTemplatesRequest self = new GetAllCustomTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public GetAllCustomTemplatesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetAllCustomTemplatesRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
