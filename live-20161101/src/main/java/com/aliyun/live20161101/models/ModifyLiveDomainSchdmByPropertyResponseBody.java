// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveDomainSchdmByPropertyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLiveDomainSchdmByPropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveDomainSchdmByPropertyResponseBody self = new ModifyLiveDomainSchdmByPropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLiveDomainSchdmByPropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
