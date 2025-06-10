// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateVideoProcessingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>352816**********</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-280B-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateVideoProcessingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoProcessingResponseBody self = new CreateVideoProcessingResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVideoProcessingResponseBody setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public CreateVideoProcessingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
