// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateConfigurationSpecificationResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateConfigurationSpecificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigurationSpecificationResponseBody self = new UpdateConfigurationSpecificationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConfigurationSpecificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
