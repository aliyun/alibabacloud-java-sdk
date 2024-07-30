// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RunSynchronizationJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>sync_0000347vjovtcf41li0fgsd98gn24q9nj9xxxxx</p>
     */
    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    public static RunSynchronizationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunSynchronizationJobResponseBody self = new RunSynchronizationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public RunSynchronizationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunSynchronizationJobResponseBody setSynchronizationJobId(String synchronizationJobId) {
        this.synchronizationJobId = synchronizationJobId;
        return this;
    }
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

}
