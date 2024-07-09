// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteDirectoriesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5CC5E450-FC43-4F5B-B540-9964BD313427</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDirectoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDirectoriesResponseBody self = new DeleteDirectoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDirectoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
