// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class CreateOrgResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>org-evk12ozjvmlxl****</p>
     */
    @NameInMap("OrgId")
    public String orgId;

    /**
     * <strong>example:</strong>
     * <p>7A2C3803-C975-5871-A232-80A91009****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOrgResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrgResponseBody self = new CreateOrgResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrgResponseBody setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CreateOrgResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
