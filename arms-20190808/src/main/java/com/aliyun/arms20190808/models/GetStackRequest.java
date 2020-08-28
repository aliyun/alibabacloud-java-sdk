// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetStackRequest extends TeaModel {
    @NameInMap("TraceID")
    @Validation(required = true)
    public String traceID;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("RpcID")
    public String rpcID;

    public static GetStackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStackRequest self = new GetStackRequest();
        return TeaModel.build(map, self);
    }

}
