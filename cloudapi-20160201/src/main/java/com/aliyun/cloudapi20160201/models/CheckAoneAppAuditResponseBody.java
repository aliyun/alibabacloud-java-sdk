// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class CheckAoneAppAuditResponseBody extends TeaModel {
    @NameInMap("CheckResult")
    public Boolean checkResult;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckAoneAppAuditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckAoneAppAuditResponseBody self = new CheckAoneAppAuditResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckAoneAppAuditResponseBody setCheckResult(Boolean checkResult) {
        this.checkResult = checkResult;
        return this;
    }
    public Boolean getCheckResult() {
        return this.checkResult;
    }

    public CheckAoneAppAuditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
