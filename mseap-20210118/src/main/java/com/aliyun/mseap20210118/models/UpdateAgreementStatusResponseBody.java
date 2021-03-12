// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class UpdateAgreementStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAgreementStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgreementStatusResponseBody self = new UpdateAgreementStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAgreementStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
