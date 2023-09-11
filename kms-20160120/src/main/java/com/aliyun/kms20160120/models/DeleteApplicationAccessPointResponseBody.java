// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteApplicationAccessPointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteApplicationAccessPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationAccessPointResponseBody self = new DeleteApplicationAccessPointResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationAccessPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
