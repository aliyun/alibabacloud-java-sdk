// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateClientUserResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>726</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>58D6B23E-E5DA-5418-8F61-51A3B5A30049</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateClientUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClientUserResponseBody self = new CreateClientUserResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClientUserResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateClientUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
