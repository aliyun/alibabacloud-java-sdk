// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetUpdateTaskResultRequest extends TeaModel {
    /**
     * <p>The operation ID, which is used to query the result of the asynchronous node update. You can obtain this ID from the UpdateTaskAsync operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e15ad21c-b0e9-4792-8f55-b037xxxxxxxx</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    public static GetUpdateTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUpdateTaskResultRequest self = new GetUpdateTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public GetUpdateTaskResultRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
