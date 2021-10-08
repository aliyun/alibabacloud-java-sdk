// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ApplyAuthorizationRequest extends TeaModel {
    @NameInMap("Uid")
    public Long uid;

    public static ApplyAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyAuthorizationRequest self = new ApplyAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public ApplyAuthorizationRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
