// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class HibernateDesktopsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static HibernateDesktopsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HibernateDesktopsResponseBody self = new HibernateDesktopsResponseBody();
        return TeaModel.build(map, self);
    }

    public HibernateDesktopsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
