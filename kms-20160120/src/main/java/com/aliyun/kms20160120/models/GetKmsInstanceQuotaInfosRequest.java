// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetKmsInstanceQuotaInfosRequest extends TeaModel {
    @NameInMap("KmsInstanceId")
    public String kmsInstanceId;

    @NameInMap("ResourceType")
    public String resourceType;

    public static GetKmsInstanceQuotaInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKmsInstanceQuotaInfosRequest self = new GetKmsInstanceQuotaInfosRequest();
        return TeaModel.build(map, self);
    }

    public GetKmsInstanceQuotaInfosRequest setKmsInstanceId(String kmsInstanceId) {
        this.kmsInstanceId = kmsInstanceId;
        return this;
    }
    public String getKmsInstanceId() {
        return this.kmsInstanceId;
    }

    public GetKmsInstanceQuotaInfosRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
