// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteRamPolicyExportTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3E49127A-BB65-5CCD-AB93-0EC0A43E5446</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteRamPolicyExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRamPolicyExportTaskResponseBody self = new DeleteRamPolicyExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRamPolicyExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
