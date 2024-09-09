// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateRealisticPortraitResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D5798660-1531-5D12-9C20-16FEE9D22351</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>313123123</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static CreateRealisticPortraitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRealisticPortraitResponseBody self = new CreateRealisticPortraitResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRealisticPortraitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRealisticPortraitResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
