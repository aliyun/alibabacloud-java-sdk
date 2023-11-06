// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ModifyDrdsInstanceDescriptionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyDrdsInstanceDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDrdsInstanceDescriptionResponseBody self = new ModifyDrdsInstanceDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDrdsInstanceDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDrdsInstanceDescriptionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
