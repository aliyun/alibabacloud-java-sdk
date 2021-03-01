// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetSubAccountInfoRequest extends TeaModel {
    @NameInMap("TargetUserId")
    public String targetUserId;

    public static GetSubAccountInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSubAccountInfoRequest self = new GetSubAccountInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetSubAccountInfoRequest setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public String getTargetUserId() {
        return this.targetUserId;
    }

}
