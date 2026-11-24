// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class AutoRenewInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    /**
     * <strong>example:</strong>
     * <p>2D29E31F-73C7-4E82-8A44-035E39DCB601</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AutoRenewInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AutoRenewInstanceResponseBody self = new AutoRenewInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public AutoRenewInstanceResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public AutoRenewInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AutoRenewInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
