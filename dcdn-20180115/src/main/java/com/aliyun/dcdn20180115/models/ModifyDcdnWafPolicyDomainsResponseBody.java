// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ModifyDcdnWafPolicyDomainsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-2B35-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDcdnWafPolicyDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDcdnWafPolicyDomainsResponseBody self = new ModifyDcdnWafPolicyDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDcdnWafPolicyDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
