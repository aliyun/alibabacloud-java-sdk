// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteUdmDiskRequest extends TeaModel {
    /**
     * <p>The disk ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bp15************xy70</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    public static DeleteUdmDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUdmDiskRequest self = new DeleteUdmDiskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUdmDiskRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

}
