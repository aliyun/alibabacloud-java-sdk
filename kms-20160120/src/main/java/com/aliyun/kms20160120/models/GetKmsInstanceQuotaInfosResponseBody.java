// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetKmsInstanceQuotaInfosResponseBody extends TeaModel {
    /**
     * <p>The ID of the KMS instance.</p>
     * 
     * <strong>example:</strong>
     * <p>kst-hzz6****</p>
     */
    @NameInMap("KmsInstanceId")
    public String kmsInstanceId;

    /**
     * <p>An array of quota details for the instance.</p>
     */
    @NameInMap("KmsInstanceQuotaInfos")
    public java.util.List<GetKmsInstanceQuotaInfosResponseBodyKmsInstanceQuotaInfos> kmsInstanceQuotaInfos;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>f1fdfa9d-bd49-418b-942f-8f3e3ec00a4f</p>
     */
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
        /**
         * <p>The quota.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("ResourceQuota")
        public Long resourceQuota;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The quota usage.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
