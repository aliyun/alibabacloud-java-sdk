// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetUserProfilePathRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetUserProfilePathRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetUserProfilePathRulesResponseBody self = new SetUserProfilePathRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public SetUserProfilePathRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
