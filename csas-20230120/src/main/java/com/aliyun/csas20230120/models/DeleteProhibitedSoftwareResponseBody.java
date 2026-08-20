// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteProhibitedSoftwareResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8E53BDC2-5630-58A6-BA3D-5761D4A80A99</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteProhibitedSoftwareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProhibitedSoftwareResponseBody self = new DeleteProhibitedSoftwareResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProhibitedSoftwareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
