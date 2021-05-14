// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ModifyDrdsInstanceDescriptionResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDrdsInstanceDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDrdsInstanceDescriptionResponseBody self = new ModifyDrdsInstanceDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDrdsInstanceDescriptionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ModifyDrdsInstanceDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
