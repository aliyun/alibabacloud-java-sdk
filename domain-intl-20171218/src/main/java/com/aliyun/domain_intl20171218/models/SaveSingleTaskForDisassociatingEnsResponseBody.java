// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForDisassociatingEnsResponseBody extends TeaModel {
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
