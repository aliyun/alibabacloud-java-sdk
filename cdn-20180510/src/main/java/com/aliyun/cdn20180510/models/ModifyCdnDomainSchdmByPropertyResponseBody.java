// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ModifyCdnDomainSchdmByPropertyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCdnDomainSchdmByPropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCdnDomainSchdmByPropertyResponseBody self = new ModifyCdnDomainSchdmByPropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCdnDomainSchdmByPropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
