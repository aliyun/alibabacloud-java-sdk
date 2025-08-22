// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class PublishRegistryModuleVersionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>36E1679B-4D91-5AF6-B505-B5D4ACDF75BD</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1.1.1</p>
     */
    @NameInMap("version")
    public String version;

    public static PublishRegistryModuleVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishRegistryModuleVersionResponseBody self = new PublishRegistryModuleVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishRegistryModuleVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PublishRegistryModuleVersionResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
