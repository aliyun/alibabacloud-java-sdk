// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F4AD2E65-482B-46B6-942E-765989B1C8A3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySecurityGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupsResponseBody self = new ModifySecurityGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySecurityGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
