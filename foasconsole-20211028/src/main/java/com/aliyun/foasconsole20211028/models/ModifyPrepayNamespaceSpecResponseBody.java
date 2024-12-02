// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ModifyPrepayNamespaceSpecResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>67F33190-946B-1105-B6A1-E2DF0426DD51</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
