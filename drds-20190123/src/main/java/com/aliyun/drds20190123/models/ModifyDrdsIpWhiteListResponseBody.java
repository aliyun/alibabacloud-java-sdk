// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ModifyDrdsIpWhiteListResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDrdsIpWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDrdsIpWhiteListResponseBody self = new ModifyDrdsIpWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDrdsIpWhiteListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ModifyDrdsIpWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
