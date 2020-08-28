// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeCodeRequest extends TeaModel {
    @NameInMap("NodeId")
    @Validation(required = true)
    public Long nodeId;

    @NameInMap("ProjectEnv")
    @Validation(required = true)
    public String projectEnv;

    public static GetNodeCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodeCodeRequest self = new GetNodeCodeRequest();
        return TeaModel.build(map, self);
    }

}
