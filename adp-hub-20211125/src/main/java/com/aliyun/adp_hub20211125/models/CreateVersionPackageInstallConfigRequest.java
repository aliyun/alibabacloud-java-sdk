// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp_hub20211125.models;

import com.aliyun.tea.*;

public class CreateVersionPackageInstallConfigRequest extends TeaModel {
    @NameInMap("environmentUID")
    public String environmentUID;

    public static CreateVersionPackageInstallConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVersionPackageInstallConfigRequest self = new CreateVersionPackageInstallConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateVersionPackageInstallConfigRequest setEnvironmentUID(String environmentUID) {
        this.environmentUID = environmentUID;
        return this;
    }
    public String getEnvironmentUID() {
        return this.environmentUID;
    }

}
