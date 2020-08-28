// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ExportSnapshotRequest extends TeaModel {
    @NameInMap("SnapshotId")
    @Validation(required = true)
    public String snapshotId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("OssBucket")
    @Validation(required = true)
    public String ossBucket;

    @NameInMap("RoleName")
    public String roleName;

    public static ExportSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportSnapshotRequest self = new ExportSnapshotRequest();
        return TeaModel.build(map, self);
    }

}
