// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteEditingProjectMaterialsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>36-3C1E-4417-BDB2-1E034F</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEditingProjectMaterialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEditingProjectMaterialsResponseBody self = new DeleteEditingProjectMaterialsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEditingProjectMaterialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
