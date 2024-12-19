// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateDataFlowSubTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the data streaming task.</p>
     * 
     * <strong>example:</strong>
     * <p>subTaskId-370kyfmyknxcyzw****</p>
     */
    @NameInMap("DataFlowSubTaskId")
    public String dataFlowSubTaskId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A70BEE5D-76D3-49FB-B58F-1F398211A5C3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDataFlowSubTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataFlowSubTaskResponseBody self = new CreateDataFlowSubTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataFlowSubTaskResponseBody setDataFlowSubTaskId(String dataFlowSubTaskId) {
        this.dataFlowSubTaskId = dataFlowSubTaskId;
        return this;
    }
    public String getDataFlowSubTaskId() {
        return this.dataFlowSubTaskId;
    }

    public CreateDataFlowSubTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
