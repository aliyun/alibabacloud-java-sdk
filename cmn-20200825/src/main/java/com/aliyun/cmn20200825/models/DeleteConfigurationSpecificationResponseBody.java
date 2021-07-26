// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteConfigurationSpecificationResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteConfigurationSpecificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigurationSpecificationResponseBody self = new DeleteConfigurationSpecificationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteConfigurationSpecificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
