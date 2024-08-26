// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CreateServiceUsageResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E73F09DC-6C13-5CB1-A10F-7A4E125ABD2C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateServiceUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceUsageResponseBody self = new CreateServiceUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
