// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class CreateBusinessResponseBody extends TeaModel {
    @NameInMap("BusinessId")
    public Long businessId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateBusinessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessResponseBody self = new CreateBusinessResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBusinessResponseBody setBusinessId(Long businessId) {
        this.businessId = businessId;
        return this;
    }
    public Long getBusinessId() {
        return this.businessId;
    }

    public CreateBusinessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
