// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DeleteTenantSkillsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTenantSkillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTenantSkillsResponseBody self = new DeleteTenantSkillsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTenantSkillsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
