// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class ChangeUserPasswordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AA8D67CB-345D-5CDA-986E-FFAC7D0****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ChangeUserPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeUserPasswordResponseBody self = new ChangeUserPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeUserPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
