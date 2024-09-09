// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class TransferPortraitStyleResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>725E87CD-F2DE-5FC4-8A09-2EBDFBF26DAA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>313123123</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static TransferPortraitStyleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransferPortraitStyleResponseBody self = new TransferPortraitStyleResponseBody();
        return TeaModel.build(map, self);
    }

    public TransferPortraitStyleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TransferPortraitStyleResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
