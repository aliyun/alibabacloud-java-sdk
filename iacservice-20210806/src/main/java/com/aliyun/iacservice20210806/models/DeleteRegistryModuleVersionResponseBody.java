// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteRegistryModuleVersionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>491A1E2E-EA1E-5F90-958A-A53EB67780FC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteRegistryModuleVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRegistryModuleVersionResponseBody self = new DeleteRegistryModuleVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRegistryModuleVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
