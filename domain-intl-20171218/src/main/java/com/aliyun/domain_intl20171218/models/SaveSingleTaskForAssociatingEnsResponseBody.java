// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForAssociatingEnsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A9C35C47-3366-482E-B872-8C9EA4733FE9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>561bc091-f16f-4132-8d63-f15edce45731</p>
     */
    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveSingleTaskForAssociatingEnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForAssociatingEnsResponseBody self = new SaveSingleTaskForAssociatingEnsResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForAssociatingEnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveSingleTaskForAssociatingEnsResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
