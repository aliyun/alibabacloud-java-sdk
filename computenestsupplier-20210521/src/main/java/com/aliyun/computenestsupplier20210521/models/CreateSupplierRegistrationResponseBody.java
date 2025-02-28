// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CreateSupplierRegistrationResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C4A145D8-xxxx-xxxx-xxxx-9730CDA27578</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSupplierRegistrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSupplierRegistrationResponseBody self = new CreateSupplierRegistrationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSupplierRegistrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
