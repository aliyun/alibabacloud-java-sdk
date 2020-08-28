// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetEndpointSwitchTaskRequest extends TeaModel {
    @NameInMap("Uid")
    public String uid;

    @NameInMap("accessKey")
    public String accessKey;

    @NameInMap("signature")
    public String signature;

    @NameInMap("timestamp")
    public String timestamp;

    @NameInMap("__context")
    public String context;

    @NameInMap("skipAuth")
    public String skipAuth;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("TaskId")
    public String taskId;

    public static GetEndpointSwitchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEndpointSwitchTaskRequest self = new GetEndpointSwitchTaskRequest();
        return TeaModel.build(map, self);
    }

}
