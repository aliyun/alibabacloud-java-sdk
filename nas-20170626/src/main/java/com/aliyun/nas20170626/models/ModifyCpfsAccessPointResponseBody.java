// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyCpfsAccessPointResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>70EACC9C-D07A-4A34-ADA4-77506C42B023</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCpfsAccessPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCpfsAccessPointResponseBody self = new ModifyCpfsAccessPointResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCpfsAccessPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
