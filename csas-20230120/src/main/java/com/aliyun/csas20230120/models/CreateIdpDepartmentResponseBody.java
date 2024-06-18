// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateIdpDepartmentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>726</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>D6707286-A50E-57B1-B2CF-EFAC59E850D8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateIdpDepartmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIdpDepartmentResponseBody self = new CreateIdpDepartmentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIdpDepartmentResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateIdpDepartmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
