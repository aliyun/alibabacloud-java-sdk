// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class GetUserPhoneResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>18612345678</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CEADB586-51CB-1B6B-95BD-AB85A7A08E97</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetUserPhoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserPhoneResponseBody self = new GetUserPhoneResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserPhoneResponseBody setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public GetUserPhoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
