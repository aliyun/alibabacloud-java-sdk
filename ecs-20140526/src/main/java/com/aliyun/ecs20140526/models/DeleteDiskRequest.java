// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteDiskRequest extends TeaModel {
    @NameInMap("DiskId")
    @Validation(required = true)
    public String diskId;

    public static DeleteDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDiskRequest self = new DeleteDiskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDiskRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

}
