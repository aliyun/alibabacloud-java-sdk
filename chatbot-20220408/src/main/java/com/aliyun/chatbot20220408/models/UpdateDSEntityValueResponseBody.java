// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateDSEntityValueResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2342377423</p>
     */
    @NameInMap("EntityValueId")
    public Long entityValueId;

    /**
     * <strong>example:</strong>
     * <p>sDag3g43wesf2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDSEntityValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDSEntityValueResponseBody self = new UpdateDSEntityValueResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDSEntityValueResponseBody setEntityValueId(Long entityValueId) {
        this.entityValueId = entityValueId;
        return this;
    }
    public Long getEntityValueId() {
        return this.entityValueId;
    }

    public UpdateDSEntityValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
