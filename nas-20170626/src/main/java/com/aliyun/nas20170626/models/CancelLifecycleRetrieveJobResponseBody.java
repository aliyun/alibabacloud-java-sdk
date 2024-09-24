// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CancelLifecycleRetrieveJobResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BC7C825C-5F65-4B56-BEF6-98C56C7C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelLifecycleRetrieveJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelLifecycleRetrieveJobResponseBody self = new CancelLifecycleRetrieveJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelLifecycleRetrieveJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
