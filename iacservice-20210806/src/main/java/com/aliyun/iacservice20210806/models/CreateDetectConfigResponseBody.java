// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateDetectConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dc-xxxx</p>
     */
    @NameInMap("detectConfigId")
    public String detectConfigId;

    /**
     * <strong>example:</strong>
     * <p>String</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateDetectConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDetectConfigResponseBody self = new CreateDetectConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDetectConfigResponseBody setDetectConfigId(String detectConfigId) {
        this.detectConfigId = detectConfigId;
        return this;
    }
    public String getDetectConfigId() {
        return this.detectConfigId;
    }

    public CreateDetectConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
