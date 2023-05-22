// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnSubTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDcdnSubTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDcdnSubTaskResponseBody self = new UpdateDcdnSubTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDcdnSubTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
