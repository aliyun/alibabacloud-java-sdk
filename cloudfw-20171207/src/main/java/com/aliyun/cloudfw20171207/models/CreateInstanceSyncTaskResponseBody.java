// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateInstanceSyncTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ips_server</p>
     */
    @NameInMap("Module")
    public String module;

    /**
     * <strong>example:</strong>
     * <p>D19D8F70-D64B-5A95-905A-6073BF4A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateInstanceSyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceSyncTaskResponseBody self = new CreateInstanceSyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceSyncTaskResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public CreateInstanceSyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
