// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteRegistryModuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>545995A8-243D-5963-A940-B74FAF6009B5</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteRegistryModuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRegistryModuleResponseBody self = new DeleteRegistryModuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRegistryModuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
