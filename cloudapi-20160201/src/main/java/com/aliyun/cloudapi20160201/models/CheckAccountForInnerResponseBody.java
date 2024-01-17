// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class CheckAccountForInnerResponseBody extends TeaModel {
    @NameInMap("CheckResult")
    public Boolean checkResult;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckAccountForInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckAccountForInnerResponseBody self = new CheckAccountForInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckAccountForInnerResponseBody setCheckResult(Boolean checkResult) {
        this.checkResult = checkResult;
        return this;
    }
    public Boolean getCheckResult() {
        return this.checkResult;
    }

    public CheckAccountForInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
