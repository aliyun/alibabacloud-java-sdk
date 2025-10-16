// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyIpsRulesToDefaultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B713361D-62E2-5FF0-9D29-BBFAAF40****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyIpsRulesToDefaultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpsRulesToDefaultResponseBody self = new ModifyIpsRulesToDefaultResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyIpsRulesToDefaultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
