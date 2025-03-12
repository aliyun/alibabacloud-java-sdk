// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class CreateNetTestTaskResponseBody extends TeaModel {
    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>启动测试任务ID，网络测试任务的唯一标志。</p>
     * 
     * <strong>example:</strong>
     * <p>dr-uf6i0tv2refv8wz*****</p>
     */
    @NameInMap("TestId")
    public String testId;

    public static CreateNetTestTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNetTestTaskResponseBody self = new CreateNetTestTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNetTestTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNetTestTaskResponseBody setTestId(String testId) {
        this.testId = testId;
        return this;
    }
    public String getTestId() {
        return this.testId;
    }

}
