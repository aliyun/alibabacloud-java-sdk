// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetProductVersionPackageURLRequest extends TeaModel {
    @NameInMap("envPackageUID")
    public String envPackageUID;

    public static GetProductVersionPackageURLRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionPackageURLRequest self = new GetProductVersionPackageURLRequest();
        return TeaModel.build(map, self);
    }

    public GetProductVersionPackageURLRequest setEnvPackageUID(String envPackageUID) {
        this.envPackageUID = envPackageUID;
        return this;
    }
    public String getEnvPackageUID() {
        return this.envPackageUID;
    }

}
