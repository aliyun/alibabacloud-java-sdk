// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyUserIPSWhitelistResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>36E89955-1E5D-5810-970C-74646F378085</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyUserIPSWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserIPSWhitelistResponseBody self = new ModifyUserIPSWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyUserIPSWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
