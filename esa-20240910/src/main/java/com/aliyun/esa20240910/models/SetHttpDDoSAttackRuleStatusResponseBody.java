// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetHttpDDoSAttackRuleStatusResponseBody extends TeaModel {
    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F7B84CF8-F8A4-53F8-9B91-2643FD72042B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetHttpDDoSAttackRuleStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetHttpDDoSAttackRuleStatusResponseBody self = new SetHttpDDoSAttackRuleStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetHttpDDoSAttackRuleStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
