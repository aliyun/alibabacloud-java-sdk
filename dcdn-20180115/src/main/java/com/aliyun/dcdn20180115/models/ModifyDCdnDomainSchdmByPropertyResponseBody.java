// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ModifyDCdnDomainSchdmByPropertyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDCdnDomainSchdmByPropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDCdnDomainSchdmByPropertyResponseBody self = new ModifyDCdnDomainSchdmByPropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDCdnDomainSchdmByPropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
