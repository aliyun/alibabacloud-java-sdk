// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ModifyDcdnWafPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-C730-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDcdnWafPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDcdnWafPolicyResponseBody self = new ModifyDcdnWafPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDcdnWafPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
