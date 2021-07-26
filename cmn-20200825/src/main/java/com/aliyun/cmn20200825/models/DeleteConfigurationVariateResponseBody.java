// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteConfigurationVariateResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteConfigurationVariateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigurationVariateResponseBody self = new DeleteConfigurationVariateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteConfigurationVariateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
