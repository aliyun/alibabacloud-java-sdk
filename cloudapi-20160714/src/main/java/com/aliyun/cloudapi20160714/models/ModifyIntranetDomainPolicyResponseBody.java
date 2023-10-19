// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyIntranetDomainPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyIntranetDomainPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyIntranetDomainPolicyResponseBody self = new ModifyIntranetDomainPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyIntranetDomainPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
