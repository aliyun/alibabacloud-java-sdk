// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateExplorerTaskResponseBody extends TeaModel {
    @NameInMap("explorerTaskId")
    public String explorerTaskId;

    @NameInMap("requestId")
    public String requestId;

    public static CreateExplorerTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExplorerTaskResponseBody self = new CreateExplorerTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExplorerTaskResponseBody setExplorerTaskId(String explorerTaskId) {
        this.explorerTaskId = explorerTaskId;
        return this;
    }
    public String getExplorerTaskId() {
        return this.explorerTaskId;
    }

    public CreateExplorerTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
