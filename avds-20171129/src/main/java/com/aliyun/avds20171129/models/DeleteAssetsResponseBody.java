// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DeleteAssetsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAssetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAssetsResponseBody self = new DeleteAssetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAssetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
