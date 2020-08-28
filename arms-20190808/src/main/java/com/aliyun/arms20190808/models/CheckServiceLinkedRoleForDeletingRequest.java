// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleForDeletingRequest extends TeaModel {
    @NameInMap("RoleArn")
    @Validation(required = true)
    public String roleArn;

    @NameInMap("ServiceName")
    @Validation(required = true)
    public String serviceName;

    @NameInMap("SPIRegionId")
    @Validation(required = true)
    public String SPIRegionId;

    @NameInMap("DeletionTaskId")
    @Validation(required = true)
    public String deletionTaskId;

    @NameInMap("RegionId")
    public String regionId;

    public static CheckServiceLinkedRoleForDeletingRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleForDeletingRequest self = new CheckServiceLinkedRoleForDeletingRequest();
        return TeaModel.build(map, self);
    }

}
