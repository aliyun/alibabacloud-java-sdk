// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CancelProjectBuildResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C7070EC3-DF66-58BA-A1DD-A8574FF53143</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CancelProjectBuildResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelProjectBuildResponseBody self = new CancelProjectBuildResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelProjectBuildResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
