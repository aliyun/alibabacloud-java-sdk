// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ResetAccountPasswordResponseBody extends TeaModel {
    /**
     * <p>The account for which you want to reset the password. Set the value to **root**.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResetAccountPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetAccountPasswordResponseBody self = new ResetAccountPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetAccountPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
