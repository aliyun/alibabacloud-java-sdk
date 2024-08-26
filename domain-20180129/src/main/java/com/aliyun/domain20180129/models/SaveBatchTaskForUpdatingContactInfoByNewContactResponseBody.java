// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForUpdatingContactInfoByNewContactResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>464AF466-CA8E-43A8-B61D-test</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>65de2165-ca09-491f-9fe0-test</p>
     */
    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveBatchTaskForUpdatingContactInfoByNewContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForUpdatingContactInfoByNewContactResponseBody self = new SaveBatchTaskForUpdatingContactInfoByNewContactResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
