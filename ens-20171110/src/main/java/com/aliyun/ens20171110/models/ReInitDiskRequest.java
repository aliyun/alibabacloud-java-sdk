// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReInitDiskRequest extends TeaModel {
    @NameInMap("Version")
    public String version;

    @NameInMap("DiskId")
    public String diskId;

    @NameInMap("ImageId")
    public String imageId;

    public static ReInitDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        ReInitDiskRequest self = new ReInitDiskRequest();
        return TeaModel.build(map, self);
    }

    public ReInitDiskRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
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
