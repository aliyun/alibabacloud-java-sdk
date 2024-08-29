// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CopyConfigRulesResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the rules are replicated. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CopyRulesResult")
    public Boolean copyRulesResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7BD81ECF-3194-5A6B-8719-9FC283167AD4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CopyConfigRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyConfigRulesResponseBody self = new CopyConfigRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyConfigRulesResponseBody setCopyRulesResult(Boolean copyRulesResult) {
        this.copyRulesResult = copyRulesResult;
        return this;
    }
    public Boolean getCopyRulesResult() {
        return this.copyRulesResult;
    }

    public CopyConfigRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
