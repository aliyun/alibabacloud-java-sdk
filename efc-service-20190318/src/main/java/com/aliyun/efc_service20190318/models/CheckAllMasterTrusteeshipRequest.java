// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.efc_service20190318.models;

import com.aliyun.tea.*;

public class CheckAllMasterTrusteeshipRequest extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UserId")
    @Validation(required = true)
    public Long userId;

    public static CheckAllMasterTrusteeshipRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAllMasterTrusteeshipRequest self = new CheckAllMasterTrusteeshipRequest();
        return TeaModel.build(map, self);
    }

    public CheckAllMasterTrusteeshipRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckAllMasterTrusteeshipRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
