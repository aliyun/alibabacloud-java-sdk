// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateDSEntityResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>23436345</p>
     */
    @NameInMap("EntityId")
    public Long entityId;

    /**
     * <strong>example:</strong>
     * <p>adfad2343f1f2r</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDSEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDSEntityResponseBody self = new CreateDSEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDSEntityResponseBody setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public CreateDSEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
