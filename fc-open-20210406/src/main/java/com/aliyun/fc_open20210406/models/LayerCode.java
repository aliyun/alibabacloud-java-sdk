// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class LayerCode extends TeaModel {
    // 层代码位置
    @NameInMap("location")
    public String location;

    // 层代码类型
    @NameInMap("repositoryType")
    public String repositoryType;

    public static LayerCode build(java.util.Map<String, ?> map) throws Exception {
        LayerCode self = new LayerCode();
        return TeaModel.build(map, self);
    }

    public LayerCode setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public LayerCode setRepositoryType(String repositoryType) {
        this.repositoryType = repositoryType;
        return this;
    }
    public String getRepositoryType() {
        return this.repositoryType;
    }

}
