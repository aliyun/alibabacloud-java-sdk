// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class ModifyOrgResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0296EDF8-3C8A-5128-8682-27B29C99****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyOrgResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyOrgResponseBody self = new ModifyOrgResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyOrgResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
