// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ReleaseVersionImage extends TeaModel {
    @NameInMap("cpuArchitecture")
    public String cpuArchitecture;

    @NameInMap("imageId")
    public String imageId;

    @NameInMap("runtimeEngineType")
    public String runtimeEngineType;

    public static ReleaseVersionImage build(java.util.Map<String, ?> map) throws Exception {
        ReleaseVersionImage self = new ReleaseVersionImage();
        return TeaModel.build(map, self);
    }

    public ReleaseVersionImage setCpuArchitecture(String cpuArchitecture) {
        this.cpuArchitecture = cpuArchitecture;
        return this;
    }
    public String getCpuArchitecture() {
        return this.cpuArchitecture;
    }

    public ReleaseVersionImage setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ReleaseVersionImage setRuntimeEngineType(String runtimeEngineType) {
        this.runtimeEngineType = runtimeEngineType;
        return this;
    }
    public String getRuntimeEngineType() {
        return this.runtimeEngineType;
    }

}
