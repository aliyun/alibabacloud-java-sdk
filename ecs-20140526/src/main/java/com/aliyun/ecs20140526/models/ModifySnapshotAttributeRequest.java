// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySnapshotAttributeRequest extends TeaModel {
    @NameInMap("SnapshotId")
    @Validation(required = true)
    public String snapshotId;

    @NameInMap("SnapshotName")
    public String snapshotName;

    @NameInMap("Description")
    public String description;

    public static ModifySnapshotAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySnapshotAttributeRequest self = new ModifySnapshotAttributeRequest();
        return TeaModel.build(map, self);
    }

}
