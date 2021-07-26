// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateResourceInformationResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateResourceInformationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceInformationResponseBody self = new UpdateResourceInformationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateResourceInformationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
