// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteAccessKeyInRecycleBinResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAccessKeyInRecycleBinResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessKeyInRecycleBinResponseBody self = new DeleteAccessKeyInRecycleBinResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAccessKeyInRecycleBinResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
