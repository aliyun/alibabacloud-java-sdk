// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponseBody extends TeaModel {
    /**
     * <p>A unique ID for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EDC28FEC-6BE0-4583-95BC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the asynchronous task.</p>
     * 
     * <strong>example:</strong>
     * <p>880f1579-be51-4dd3-a69d</p>
     */
    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponseBody self = new SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
