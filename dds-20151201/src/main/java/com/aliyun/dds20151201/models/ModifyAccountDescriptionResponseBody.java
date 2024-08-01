// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyAccountDescriptionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>59DE9FC2-7B40-45CF-9011-7327A8A771A2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAccountDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountDescriptionResponseBody self = new ModifyAccountDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAccountDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
