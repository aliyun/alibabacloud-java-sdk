// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class ModifyPrepayNamespaceSpecResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ModifyPrepayNamespaceSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrepayNamespaceSpecResponseBody self = new ModifyPrepayNamespaceSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPrepayNamespaceSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyPrepayNamespaceSpecResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
