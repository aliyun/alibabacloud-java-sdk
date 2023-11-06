// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ModifyAccountPrivilegeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyAccountPrivilegeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountPrivilegeResponseBody self = new ModifyAccountPrivilegeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAccountPrivilegeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyAccountPrivilegeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
