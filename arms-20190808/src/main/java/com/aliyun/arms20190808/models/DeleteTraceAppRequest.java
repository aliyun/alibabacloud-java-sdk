// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteTraceAppRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    public static DeleteTraceAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTraceAppRequest self = new DeleteTraceAppRequest();
        return TeaModel.build(map, self);
    }

}
