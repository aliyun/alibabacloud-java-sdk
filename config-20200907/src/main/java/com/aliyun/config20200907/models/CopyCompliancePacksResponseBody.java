// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CopyCompliancePacksResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the compliance packages are successfully replicated. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("CopyRulesResult")
    public Boolean copyRulesResult;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CopyCompliancePacksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyCompliancePacksResponseBody self = new CopyCompliancePacksResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyCompliancePacksResponseBody setCopyRulesResult(Boolean copyRulesResult) {
        this.copyRulesResult = copyRulesResult;
        return this;
    }
    public Boolean getCopyRulesResult() {
        return this.copyRulesResult;
    }

    public CopyCompliancePacksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
