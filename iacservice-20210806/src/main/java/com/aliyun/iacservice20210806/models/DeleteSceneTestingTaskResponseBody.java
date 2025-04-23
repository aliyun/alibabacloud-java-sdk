// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteSceneTestingTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>17793D91-A26F-520D-A948-3452A45D15B1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteSceneTestingTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSceneTestingTaskResponseBody self = new DeleteSceneTestingTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSceneTestingTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
