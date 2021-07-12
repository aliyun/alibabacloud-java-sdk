// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateServiceEntryAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateServiceEntryAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceEntryAttributeResponseBody self = new UpdateServiceEntryAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceEntryAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
