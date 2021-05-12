// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class CreateEnvironmentWithSnapshotRequest extends TeaModel {
    @NameInMap("environmentDesc")
    public String environmentDesc;

    @NameInMap("environmentName")
    public String environmentName;

    public static CreateEnvironmentWithSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentWithSnapshotRequest self = new CreateEnvironmentWithSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentWithSnapshotRequest setEnvironmentDesc(String environmentDesc) {
        this.environmentDesc = environmentDesc;
        return this;
    }
    public String getEnvironmentDesc() {
        return this.environmentDesc;
    }

    public CreateEnvironmentWithSnapshotRequest setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }
    public String getEnvironmentName() {
        return this.environmentName;
    }

}
