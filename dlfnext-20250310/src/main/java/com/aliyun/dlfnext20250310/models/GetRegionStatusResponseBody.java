// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetRegionStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("serviceRoleExists")
    public Boolean serviceRoleExists;

    /**
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    public static GetRegionStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRegionStatusResponseBody self = new GetRegionStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRegionStatusResponseBody setServiceRoleExists(Boolean serviceRoleExists) {
        this.serviceRoleExists = serviceRoleExists;
        return this;
    }
    public Boolean getServiceRoleExists() {
        return this.serviceRoleExists;
    }

    public GetRegionStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
