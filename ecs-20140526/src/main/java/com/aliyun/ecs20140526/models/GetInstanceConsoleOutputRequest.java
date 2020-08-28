// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class GetInstanceConsoleOutputRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("RemoveSymbols")
    public Boolean removeSymbols;

    public static GetInstanceConsoleOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceConsoleOutputRequest self = new GetInstanceConsoleOutputRequest();
        return TeaModel.build(map, self);
    }

}
