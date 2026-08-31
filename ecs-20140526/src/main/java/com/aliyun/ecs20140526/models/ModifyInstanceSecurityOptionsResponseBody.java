// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceSecurityOptionsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceSecurityOptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceSecurityOptionsResponseBody self = new ModifyInstanceSecurityOptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceSecurityOptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
