// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteCloudDriveServicesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20CA01E9-C4FF-5A64-9775-7EF48F8E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCloudDriveServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudDriveServicesResponseBody self = new DeleteCloudDriveServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCloudDriveServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
