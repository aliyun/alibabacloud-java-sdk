// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateClientUserResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BE4FB974-11BC-5453-9BE1-1606A73EACA6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateClientUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateClientUserResponseBody self = new UpdateClientUserResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateClientUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
