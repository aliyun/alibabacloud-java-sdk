// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifySensitiveSwitchResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6169C0A4-B91A-5D48-AE4D-B9432D15****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySensitiveSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySensitiveSwitchResponseBody self = new ModifySensitiveSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySensitiveSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
