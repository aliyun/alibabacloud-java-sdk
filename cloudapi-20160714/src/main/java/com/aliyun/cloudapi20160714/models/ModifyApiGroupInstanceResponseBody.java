// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyApiGroupInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E07AEFF0-9FB0-599E-8F12-B418D8AE1F3D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyApiGroupInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiGroupInstanceResponseBody self = new ModifyApiGroupInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyApiGroupInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
