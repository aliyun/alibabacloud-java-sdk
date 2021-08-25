// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateRemediationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RemediationId")
    public String remediationId;

    public static CreateRemediationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRemediationResponseBody self = new CreateRemediationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRemediationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRemediationResponseBody setRemediationId(String remediationId) {
        this.remediationId = remediationId;
        return this;
    }
    public String getRemediationId() {
        return this.remediationId;
    }

}
