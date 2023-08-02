// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnWafGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDcdnWafGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnWafGroupResponseBody self = new DeleteDcdnWafGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnWafGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
