// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateNetworkPackageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NetworkPackageId")
    @Validation(required = true)
    public String networkPackageId;

    public static CreateNetworkPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkPackageResponse self = new CreateNetworkPackageResponse();
        return TeaModel.build(map, self);
    }

    public CreateNetworkPackageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNetworkPackageResponse setNetworkPackageId(String networkPackageId) {
        this.networkPackageId = networkPackageId;
        return this;
    }
    public String getNetworkPackageId() {
        return this.networkPackageId;
    }

}
