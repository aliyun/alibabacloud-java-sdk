// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyHaVipAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F3B261DD-3858-4D3C-877D-303ADF374600</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyHaVipAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHaVipAttributeResponseBody self = new ModifyHaVipAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHaVipAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
