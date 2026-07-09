// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ModifyCostCenterResponseBody extends TeaModel {
    /**
     * <p>The list of data entries.</p>
     */
    @NameInMap("CostCenterOperateDto")
    public java.util.List<ModifyCostCenterResponseBodyCostCenterOperateDto> costCenterOperateDto;

    /**
     * <p>The metadata of the response.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6000EE23-274B-4E07-A697-FF2E999520A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCostCenterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCostCenterResponseBody self = new ModifyCostCenterResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCostCenterResponseBody setCostCenterOperateDto(java.util.List<ModifyCostCenterResponseBodyCostCenterOperateDto> costCenterOperateDto) {
        this.costCenterOperateDto = costCenterOperateDto;
        return this;
    }
    public java.util.List<ModifyCostCenterResponseBodyCostCenterOperateDto> getCostCenterOperateDto() {
        return this.costCenterOperateDto;
    }

    public ModifyCostCenterResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public ModifyCostCenterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyCostCenterResponseBodyCostCenterOperateDto extends TeaModel {
        /**
         * <p>The ID of the cost center.</p>
         * 
         * <strong>example:</strong>
         * <p>485938</p>
         */
        @NameInMap("CostCenterId")
        public Long costCenterId;

        /**
         * <p>Indicates whether the operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("IsSuccess")
        public Boolean isSuccess;

        /**
         * <p>The ID of the owner to which the cost center belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1314839403940987</p>
         */
        @NameInMap("OwnerAccountId")
        public Long ownerAccountId;

        public static ModifyCostCenterResponseBodyCostCenterOperateDto build(java.util.Map<String, ?> map) throws Exception {
            ModifyCostCenterResponseBodyCostCenterOperateDto self = new ModifyCostCenterResponseBodyCostCenterOperateDto();
            return TeaModel.build(map, self);
        }

        public ModifyCostCenterResponseBodyCostCenterOperateDto setCostCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        public ModifyCostCenterResponseBodyCostCenterOperateDto setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

        public ModifyCostCenterResponseBodyCostCenterOperateDto setOwnerAccountId(Long ownerAccountId) {
            this.ownerAccountId = ownerAccountId;
            return this;
        }
        public Long getOwnerAccountId() {
            return this.ownerAccountId;
        }

    }

}
