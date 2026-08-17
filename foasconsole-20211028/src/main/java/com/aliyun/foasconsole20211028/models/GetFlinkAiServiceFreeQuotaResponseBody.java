// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class GetFlinkAiServiceFreeQuotaResponseBody extends TeaModel {
    /**
     * <p>The Flink AI free quota data transfer object.</p>
     */
    @NameInMap("FlinkAiFreeQuotaDTO")
    public GetFlinkAiServiceFreeQuotaResponseBodyFlinkAiFreeQuotaDTO flinkAiFreeQuotaDTO;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C8DF2A5B-6FBA-5651-A3D4-960F3664****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetFlinkAiServiceFreeQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFlinkAiServiceFreeQuotaResponseBody self = new GetFlinkAiServiceFreeQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFlinkAiServiceFreeQuotaResponseBody setFlinkAiFreeQuotaDTO(GetFlinkAiServiceFreeQuotaResponseBodyFlinkAiFreeQuotaDTO flinkAiFreeQuotaDTO) {
        this.flinkAiFreeQuotaDTO = flinkAiFreeQuotaDTO;
        return this;
    }
    public GetFlinkAiServiceFreeQuotaResponseBodyFlinkAiFreeQuotaDTO getFlinkAiFreeQuotaDTO() {
        return this.flinkAiFreeQuotaDTO;
    }

    public GetFlinkAiServiceFreeQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFlinkAiServiceFreeQuotaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetFlinkAiServiceFreeQuotaResponseBodyFlinkAiFreeQuotaDTOUsedQuotaDetails extends TeaModel {
        /**
         * <p>The used quota for this usage type.</p>
         * 
         * <strong>example:</strong>
         * <p>35.5</p>
         */
        @NameInMap("Amount")
        public Double amount;

        /**
         * <p>The usage type.</p>
         * 
         * <strong>example:</strong>
         * <p>AI_FUNCTION</p>
         */
        @NameInMap("UsageType")
        public String usageType;

        public static GetFlinkAiServiceFreeQuotaResponseBodyFlinkAiFreeQuotaDTOUsedQuotaDetails build(java.util.Map<String, ?> map) throws Exception {
            GetFlinkAiServiceFreeQuotaResponseBodyFlinkAiFreeQuotaDTOUsedQuotaDetails self = new GetFlinkAiServiceFreeQuotaResponseBodyFlinkAiFreeQuotaDTOUsedQuotaDetails();
            return TeaModel.build(map, self);
        }

        public GetFlinkAiServiceFreeQuotaResponseBodyFlinkAiFreeQuotaDTOUsedQuotaDetails setAmount(Double amount) {
            this.amount = amount;
            return this;
        }
        public Double getAmount() {
            return this.amount;
        }

        public GetFlinkAiServiceFreeQuotaResponseBodyFlinkAiFreeQuotaDTOUsedQuotaDetails setUsageType(String usageType) {
            this.usageType = usageType;
            return this;
        }
        public String getUsageType() {
            return this.usageType;
        }

    }

    public static class GetFlinkAiServiceFreeQuotaResponseBodyFlinkAiFreeQuotaDTO extends TeaModel {
        /**
         * <p>The total free quota.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("FreeQuota")
        public Double freeQuota;

        /**
         * <p>The list of used quota details for each usage type.</p>
         */
        @NameInMap("UsedQuotaDetails")
        public java.util.List<GetFlinkAiServiceFreeQuotaResponseBodyFlinkAiFreeQuotaDTOUsedQuotaDetails> usedQuotaDetails;

        public static GetFlinkAiServiceFreeQuotaResponseBodyFlinkAiFreeQuotaDTO build(java.util.Map<String, ?> map) throws Exception {
            GetFlinkAiServiceFreeQuotaResponseBodyFlinkAiFreeQuotaDTO self = new GetFlinkAiServiceFreeQuotaResponseBodyFlinkAiFreeQuotaDTO();
            return TeaModel.build(map, self);
        }

        public GetFlinkAiServiceFreeQuotaResponseBodyFlinkAiFreeQuotaDTO setFreeQuota(Double freeQuota) {
            this.freeQuota = freeQuota;
            return this;
        }
        public Double getFreeQuota() {
            return this.freeQuota;
        }

        public GetFlinkAiServiceFreeQuotaResponseBodyFlinkAiFreeQuotaDTO setUsedQuotaDetails(java.util.List<GetFlinkAiServiceFreeQuotaResponseBodyFlinkAiFreeQuotaDTOUsedQuotaDetails> usedQuotaDetails) {
            this.usedQuotaDetails = usedQuotaDetails;
            return this;
        }
        public java.util.List<GetFlinkAiServiceFreeQuotaResponseBodyFlinkAiFreeQuotaDTOUsedQuotaDetails> getUsedQuotaDetails() {
            return this.usedQuotaDetails;
        }

    }

}
