// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateSetupProjectResponseBody extends TeaModel {
    // 资源实例ID，如ECS实例的创建接口CreateInstance应返回InstanceId。
    @NameInMap("SetupProjectId")
    public String setupProjectId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSetupProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSetupProjectResponseBody self = new CreateSetupProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSetupProjectResponseBody setSetupProjectId(String setupProjectId) {
        this.setupProjectId = setupProjectId;
        return this;
    }
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    public CreateSetupProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
