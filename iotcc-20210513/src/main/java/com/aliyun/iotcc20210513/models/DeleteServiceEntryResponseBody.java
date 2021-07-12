// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteServiceEntryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteServiceEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceEntryResponseBody self = new DeleteServiceEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteServiceEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
