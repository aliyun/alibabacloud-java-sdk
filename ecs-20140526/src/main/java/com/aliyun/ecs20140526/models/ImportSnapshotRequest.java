// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ImportSnapshotRequest extends TeaModel {
    @NameInMap("SnapshotName")
    @Validation(required = true)
    public String snapshotName;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("OssBucket")
    @Validation(required = true)
    public String ossBucket;

    @NameInMap("OssObject")
    @Validation(required = true)
    public String ossObject;

    @NameInMap("RoleName")
    public String roleName;

    public static ImportSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportSnapshotRequest self = new ImportSnapshotRequest();
        return TeaModel.build(map, self);
    }

}
