// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyResourceTypeAutoEnableResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B14757D0-4640-4B44-AC67-7F558F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyResourceTypeAutoEnableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourceTypeAutoEnableResponseBody self = new ModifyResourceTypeAutoEnableResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyResourceTypeAutoEnableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
