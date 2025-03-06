// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ModifyNamespaceSpecV2ResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>23A9C718-DDAB-1696-B025-18FBC830F7C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyNamespaceSpecV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyNamespaceSpecV2ResponseBody self = new ModifyNamespaceSpecV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyNamespaceSpecV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyNamespaceSpecV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
