// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetKmsInstanceQuotaInfosResponseBody extends TeaModel {
    @NameInMap("KmsInstanceId")
    public String kmsInstanceId;

    @NameInMap("KmsInstanceQuotaInfos")
    public java.util.List<GetKmsInstanceQuotaInfosResponseBodyKmsInstanceQuotaInfos> kmsInstanceQuotaInfos;

    @NameInMap("RequestId")
    public String requestId;

    public static GetKmsInstanceQuotaInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKmsInstanceQuotaInfosResponseBody self = new GetKmsInstanceQuotaInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKmsInstanceQuotaInfosResponseBody setKmsInstanceId(String kmsInstanceId) {
        this.kmsInstanceId = kmsInstanceId;
        return this;
    }
    public String getKmsInstanceId() {
        return this.kmsInstanceId;
    }

    public GetKmsInstanceQuotaInfosResponseBody setKmsInstanceQuotaInfos(java.util.List<GetKmsInstanceQuotaInfosResponseBodyKmsInstanceQuotaInfos> kmsInstanceQuotaInfos) {
        this.kmsInstanceQuotaInfos = kmsInstanceQuotaInfos;
        return this;
    }
    public java.util.List<GetKmsInstanceQuotaInfosResponseBodyKmsInstanceQuotaInfos> getKmsInstanceQuotaInfos() {
        return this.kmsInstanceQuotaInfos;
    }

    public GetKmsInstanceQuotaInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetKmsInstanceQuotaInfosResponseBodyKmsInstanceQuotaInfos extends TeaModel {
        @NameInMap("ResourceQuota")
        public Long resourceQuota;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("UsedQuantity")
        public Long usedQuantity;

        public static GetKmsInstanceQuotaInfosResponseBodyKmsInstanceQuotaInfos build(java.util.Map<String, ?> map) throws Exception {
            GetKmsInstanceQuotaInfosResponseBodyKmsInstanceQuotaInfos self = new GetKmsInstanceQuotaInfosResponseBodyKmsInstanceQuotaInfos();
            return TeaModel.build(map, self);
        }

        public GetKmsInstanceQuotaInfosResponseBodyKmsInstanceQuotaInfos setResourceQuota(Long resourceQuota) {
            this.resourceQuota = resourceQuota;
            return this;
        }
        public Long getResourceQuota() {
            return this.resourceQuota;
        }

        public GetKmsInstanceQuotaInfosResponseBodyKmsInstanceQuotaInfos setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetKmsInstanceQuotaInfosResponseBodyKmsInstanceQuotaInfos setUsedQuantity(Long usedQuantity) {
            this.usedQuantity = usedQuantity;
            return this;
        }
        public Long getUsedQuantity() {
            return this.usedQuantity;
        }

    }

}
