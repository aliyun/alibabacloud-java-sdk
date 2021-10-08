// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ConfirmAuthorizationRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("Uid")
    public Long uid;

    public static ConfirmAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmAuthorizationRequest self = new ConfirmAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmAuthorizationRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ConfirmAuthorizationRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
