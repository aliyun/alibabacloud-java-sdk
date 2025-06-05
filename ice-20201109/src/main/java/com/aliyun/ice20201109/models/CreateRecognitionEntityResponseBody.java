// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateRecognitionEntityResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>**<strong><strong><strong><strong><strong><strong>544cb84754</strong></strong></strong></strong></strong></strong></p>
     */
    @NameInMap("EntityId")
    public String entityId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRecognitionEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRecognitionEntityResponseBody self = new CreateRecognitionEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRecognitionEntityResponseBody setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public CreateRecognitionEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
