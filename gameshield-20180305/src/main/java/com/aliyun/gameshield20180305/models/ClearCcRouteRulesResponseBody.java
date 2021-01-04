// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class ClearCcRouteRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static ClearCcRouteRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClearCcRouteRulesResponseBody self = new ClearCcRouteRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ClearCcRouteRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ClearCcRouteRulesResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

}
