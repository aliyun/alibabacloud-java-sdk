// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateExplorerModuleAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>25B274BA-E672-58C0-8602-541281B6F758</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateExplorerModuleAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateExplorerModuleAttributeResponseBody self = new UpdateExplorerModuleAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateExplorerModuleAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
