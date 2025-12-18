// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyCfwInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F0F82705-CFC7-5F83-86C8-A063892F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCfwInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCfwInstanceResponseBody self = new ModifyCfwInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCfwInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
