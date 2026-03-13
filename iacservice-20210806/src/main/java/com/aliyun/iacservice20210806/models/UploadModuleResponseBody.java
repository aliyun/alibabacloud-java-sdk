// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UploadModuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0DDD8773-5756-5508-BE36-D03DE43E2450</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UploadModuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadModuleResponseBody self = new UploadModuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadModuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
