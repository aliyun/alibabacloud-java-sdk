// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifySnatEntryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>125B04C7-3D0D-4245-AF96-14E3758E3F06</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySnatEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySnatEntryResponseBody self = new ModifySnatEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySnatEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
