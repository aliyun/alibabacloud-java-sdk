// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetKmsInstanceQuotaInfosRequest extends TeaModel {
    /**
     * <p>The ID of the KMS instance to query.</p>
     * 
     * <strong>example:</strong>
     * <p>kst-bjj62f5ba3dnpb6v8****</p>
     */
    @NameInMap("KmsInstanceId")
    public String kmsInstanceId;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li><p><code>key</code>: key quota</p>
     * </li>
     * <li><p><code>secret</code>: secret quota</p>
     * </li>
     * <li><p><code>qps</code>: queries per second (QPS) quota</p>
     * </li>
     * <li><p><code>vpc</code>: Virtual Private Cloud (VPC) quota</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>key</p>
     */
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
