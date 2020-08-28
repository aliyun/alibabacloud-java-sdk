// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ImportSnapshotResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("SnapshotId")
    @Validation(required = true)
    public String snapshotId;

    public static ImportSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportSnapshotResponse self = new ImportSnapshotResponse();
        return TeaModel.build(map, self);
    }

}
