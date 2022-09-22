// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ResizeDiskRequest extends TeaModel {
    @NameInMap("DiskId")
    public String diskId;

    @NameInMap("NewSize")
    public String newSize;

    public static ResizeDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        ResizeDiskRequest self = new ResizeDiskRequest();
        return TeaModel.build(map, self);
    }

    public ResizeDiskRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public ResizeDiskRequest setNewSize(String newSize) {
        this.newSize = newSize;
        return this;
    }
    public String getNewSize() {
        return this.newSize;
    }

}
