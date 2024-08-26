// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForModifyingDnsHostResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0F1B3547-BE50-4206-8F78-9540FFB85BC1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>e9b8e8b4-7334-4548-9cec-c30b6891f292</p>
     */
    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveSingleTaskForModifyingDnsHostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForModifyingDnsHostResponseBody self = new SaveSingleTaskForModifyingDnsHostResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForModifyingDnsHostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveSingleTaskForModifyingDnsHostResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
