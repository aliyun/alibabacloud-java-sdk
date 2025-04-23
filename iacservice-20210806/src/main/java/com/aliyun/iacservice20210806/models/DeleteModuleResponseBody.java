// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteModuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>49DA6457-E545-5095-A930-EB8F0BCD4DAA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteModuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteModuleResponseBody self = new DeleteModuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteModuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
