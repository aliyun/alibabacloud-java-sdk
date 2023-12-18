// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteDiskRequest extends TeaModel {
    /**
     * <p>The ID of the disk.</p>
     */
    @NameInMap("DiskId")
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
