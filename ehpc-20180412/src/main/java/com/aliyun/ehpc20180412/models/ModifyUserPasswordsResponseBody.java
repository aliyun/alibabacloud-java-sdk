// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyUserPasswordsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyUserPasswordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserPasswordsResponseBody self = new ModifyUserPasswordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyUserPasswordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
