// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteOfficeSiteAcceleratorResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>EE9472BC-0B5D-5458-85CD-C52BDD******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteOfficeSiteAcceleratorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteOfficeSiteAcceleratorResponseBody self = new DeleteOfficeSiteAcceleratorResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteOfficeSiteAcceleratorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
