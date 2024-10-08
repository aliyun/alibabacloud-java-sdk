// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForDeletingDnsHostResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8fc97e44-837a-447d-ac61-ea28d2fe8a38</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>8fc97e44-837a-447d-ac61-ea28d2fexxxx</p>
     */
    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveSingleTaskForDeletingDnsHostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForDeletingDnsHostResponseBody self = new SaveSingleTaskForDeletingDnsHostResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForDeletingDnsHostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveSingleTaskForDeletingDnsHostResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
