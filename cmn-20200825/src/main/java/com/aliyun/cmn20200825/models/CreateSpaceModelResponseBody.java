// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateSpaceModelResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 资源实例ID，如ECS实例的创建接口CreateInstance应返回InstanceId。
    @NameInMap("SpaceModelId")
    public String spaceModelId;

    public static CreateSpaceModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSpaceModelResponseBody self = new CreateSpaceModelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSpaceModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSpaceModelResponseBody setSpaceModelId(String spaceModelId) {
        this.spaceModelId = spaceModelId;
        return this;
    }
    public String getSpaceModelId() {
        return this.spaceModelId;
    }

}
