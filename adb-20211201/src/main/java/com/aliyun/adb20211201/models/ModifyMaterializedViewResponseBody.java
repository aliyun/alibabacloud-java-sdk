// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyMaterializedViewResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CF8BA882-C9D8-5BEF-AAA3-AD03875F3E18</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyMaterializedViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyMaterializedViewResponseBody self = new ModifyMaterializedViewResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyMaterializedViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
