// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteVSwitchRequest extends TeaModel {
    @NameInMap("VSwitchId")
    @Validation(required = true)
    public String vSwitchId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteVSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVSwitchRequest self = new DeleteVSwitchRequest();
        return TeaModel.build(map, self);
    }

}
