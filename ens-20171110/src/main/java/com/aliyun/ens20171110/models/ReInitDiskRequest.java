// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReInitDiskRequest extends TeaModel {
    /**
     * <p>The ID of the disk to be initialized. You can initialize only one disk at a time.</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The ID of the image to use to create the instance.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    public static ReInitDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        ReInitDiskRequest self = new ReInitDiskRequest();
        return TeaModel.build(map, self);
    }

    public ReInitDiskRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public ReInitDiskRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

}
