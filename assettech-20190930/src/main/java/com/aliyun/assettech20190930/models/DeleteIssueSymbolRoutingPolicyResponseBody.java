// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.assettech20190930.models;

import com.aliyun.tea.*;

public class DeleteIssueSymbolRoutingPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteIssueSymbolRoutingPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIssueSymbolRoutingPolicyResponseBody self = new DeleteIssueSymbolRoutingPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIssueSymbolRoutingPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteIssueSymbolRoutingPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
