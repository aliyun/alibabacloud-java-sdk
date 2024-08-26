// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForReserveDropListDomainResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B7AB5469-5E38-4AA9-A920-C65B7A9C8E6E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>3cb1adc3-20e8-44ae-9e76-e812fa6fc9d8</p>
     */
    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveBatchTaskForReserveDropListDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForReserveDropListDomainResponseBody self = new SaveBatchTaskForReserveDropListDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForReserveDropListDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveBatchTaskForReserveDropListDomainResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
