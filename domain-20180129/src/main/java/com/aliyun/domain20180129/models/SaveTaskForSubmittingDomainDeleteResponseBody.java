// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveTaskForSubmittingDomainDeleteResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>23C9B3C4-9E2C-4405-A88D-BD33E459D140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>3cb1adc3-20e8-44ae-9e76-e812fa6fc9d8</p>
     */
    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveTaskForSubmittingDomainDeleteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForSubmittingDomainDeleteResponseBody self = new SaveTaskForSubmittingDomainDeleteResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveTaskForSubmittingDomainDeleteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveTaskForSubmittingDomainDeleteResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
