// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class CreateCustomEntityResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CustomEntityId")
    public String customEntityId;

    /**
     * <strong>example:</strong>
     * <p>580e8ce3-3b80-44c5-9f3f-36ac3cc5bdd5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCustomEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomEntityResponseBody self = new CreateCustomEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomEntityResponseBody setCustomEntityId(String customEntityId) {
        this.customEntityId = customEntityId;
        return this;
    }
    public String getCustomEntityId() {
        return this.customEntityId;
    }

    public CreateCustomEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
