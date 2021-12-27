// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetUserCommercialStatusRequest extends TeaModel {
    @NameInMap("ParentId")
    public String parentId;

    @NameInMap("TargetUserId")
    public String targetUserId;

    @NameInMap("UserId")
    public String userId;

    public static GetUserCommercialStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserCommercialStatusRequest self = new GetUserCommercialStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetUserCommercialStatusRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public GetUserCommercialStatusRequest setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public String getTargetUserId() {
        return this.targetUserId;
    }

    public GetUserCommercialStatusRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
