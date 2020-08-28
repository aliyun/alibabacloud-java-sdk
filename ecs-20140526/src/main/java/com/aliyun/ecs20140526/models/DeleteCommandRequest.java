// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteCommandRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("CommandId")
    @Validation(required = true)
    public String commandId;

    public static DeleteCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommandRequest self = new DeleteCommandRequest();
        return TeaModel.build(map, self);
    }

}
