// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateRamPolicyExportTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rpe-436057ffe0252e48f9286a</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>9AC66641-C0F1-533B-AB58-982FC7B1C32A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateRamPolicyExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRamPolicyExportTaskResponseBody self = new CreateRamPolicyExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRamPolicyExportTaskResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateRamPolicyExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
