// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DeleteSetResponseBody extends TeaModel {
    @NameInMap("SetId")
    public String setId;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSetResponseBody self = new DeleteSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSetResponseBody setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public DeleteSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
