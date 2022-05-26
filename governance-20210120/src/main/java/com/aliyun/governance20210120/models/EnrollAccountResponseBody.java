// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class EnrollAccountResponseBody extends TeaModel {
    // 注册账号ID
    @NameInMap("AccountUid")
    public Long accountUid;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static EnrollAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnrollAccountResponseBody self = new EnrollAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public EnrollAccountResponseBody setAccountUid(Long accountUid) {
        this.accountUid = accountUid;
        return this;
    }
    public Long getAccountUid() {
        return this.accountUid;
    }

    public EnrollAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
