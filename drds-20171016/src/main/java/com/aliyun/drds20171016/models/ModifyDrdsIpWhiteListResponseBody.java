// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class ModifyDrdsIpWhiteListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ModifyDrdsIpWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDrdsIpWhiteListResponseBody self = new ModifyDrdsIpWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDrdsIpWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDrdsIpWhiteListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
