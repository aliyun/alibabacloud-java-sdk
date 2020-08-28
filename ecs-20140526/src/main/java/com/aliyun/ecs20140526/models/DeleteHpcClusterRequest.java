// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteHpcClusterRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("HpcClusterId")
    @Validation(required = true)
    public String hpcClusterId;

    public static DeleteHpcClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHpcClusterRequest self = new DeleteHpcClusterRequest();
        return TeaModel.build(map, self);
    }

}
