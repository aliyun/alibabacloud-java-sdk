// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForDisassociatingEnsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E2598CAF-DBFE-494E-95EF-B42A33C178AA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>e893148f-6343-4ae1-9eba-6e2a4116e142</p>
     */
    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveSingleTaskForDisassociatingEnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForDisassociatingEnsResponseBody self = new SaveSingleTaskForDisassociatingEnsResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForDisassociatingEnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveSingleTaskForDisassociatingEnsResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
