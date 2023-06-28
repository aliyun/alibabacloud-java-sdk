// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class OSSMountConfig extends TeaModel {
    @NameInMap("mountPoints")
    public java.util.List<OSSMountPoint> mountPoints;

    public static OSSMountConfig build(java.util.Map<String, ?> map) throws Exception {
        OSSMountConfig self = new OSSMountConfig();
        return TeaModel.build(map, self);
    }

    public OSSMountConfig setMountPoints(java.util.List<OSSMountPoint> mountPoints) {
        this.mountPoints = mountPoints;
        return this;
    }
    public java.util.List<OSSMountPoint> getMountPoints() {
        return this.mountPoints;
    }

}
