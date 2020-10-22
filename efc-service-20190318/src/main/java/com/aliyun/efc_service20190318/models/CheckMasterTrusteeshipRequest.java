// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.efc_service20190318.models;

import com.aliyun.tea.*;

public class CheckMasterTrusteeshipRequest extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UserId")
    @Validation(required = true)
    public Long userId;

    public static CheckMasterTrusteeshipRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckMasterTrusteeshipRequest self = new CheckMasterTrusteeshipRequest();
        return TeaModel.build(map, self);
    }

    public CheckMasterTrusteeshipRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckMasterTrusteeshipRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
