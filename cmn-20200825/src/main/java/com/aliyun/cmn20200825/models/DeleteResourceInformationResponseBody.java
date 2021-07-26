// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteResourceInformationResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteResourceInformationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceInformationResponseBody self = new DeleteResourceInformationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteResourceInformationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
