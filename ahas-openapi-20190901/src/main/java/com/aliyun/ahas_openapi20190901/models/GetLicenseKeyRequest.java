// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetLicenseKeyRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Namespace")
    public String namespace;

    public static GetLicenseKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLicenseKeyRequest self = new GetLicenseKeyRequest();
        return TeaModel.build(map, self);
    }

    public GetLicenseKeyRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public GetLicenseKeyRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
