// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CancelUserAdminResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CancelUserAdminResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelUserAdminResponseBody self = new CancelUserAdminResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelUserAdminResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
