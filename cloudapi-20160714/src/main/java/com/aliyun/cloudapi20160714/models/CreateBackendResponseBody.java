// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateBackendResponseBody extends TeaModel {
    /**
     * <p>The ID of the backend service.</p>
     * 
     * <strong>example:</strong>
     * <p>0d105f80a8f340408bd34954d4e4ff22</p>
     */
    @NameInMap("BackendId")
    public String backendId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>66D84355-164D-53ED-81FF-03DCF181DE24</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBackendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBackendResponseBody self = new CreateBackendResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBackendResponseBody setBackendId(String backendId) {
        this.backendId = backendId;
        return this;
    }
    public String getBackendId() {
        return this.backendId;
    }

    public CreateBackendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
