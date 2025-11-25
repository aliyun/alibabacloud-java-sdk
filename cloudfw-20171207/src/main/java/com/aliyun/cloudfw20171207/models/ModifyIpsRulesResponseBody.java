// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyIpsRulesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>30FB7F84-1FC5-5A3D-BBBE-5779FC74****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyIpsRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpsRulesResponseBody self = new ModifyIpsRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyIpsRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
