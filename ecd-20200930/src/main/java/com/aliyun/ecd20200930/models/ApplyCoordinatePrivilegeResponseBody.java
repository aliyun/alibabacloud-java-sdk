// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ApplyCoordinatePrivilegeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C43EEAC3-84F8-5C1E-A067-4751C3D1422E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ApplyCoordinatePrivilegeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyCoordinatePrivilegeResponseBody self = new ApplyCoordinatePrivilegeResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyCoordinatePrivilegeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
