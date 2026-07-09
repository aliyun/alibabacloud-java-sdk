// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateCostCenterResponseBody extends TeaModel {
    /**
     * <p>Data list</p>
     */
    @NameInMap("CostCenterDtoList")
    public java.util.List<CreateCostCenterResponseBodyCostCenterDtoList> costCenterDtoList;

    /**
     * <p>Response metadata</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>C1BD134E-D914-6AE0-1901-AEB2A99FA205</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCostCenterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCostCenterResponseBody self = new CreateCostCenterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCostCenterResponseBody setCostCenterDtoList(java.util.List<CreateCostCenterResponseBodyCostCenterDtoList> costCenterDtoList) {
        this.costCenterDtoList = costCenterDtoList;
        return this;
    }
    public java.util.List<CreateCostCenterResponseBodyCostCenterDtoList> getCostCenterDtoList() {
        return this.costCenterDtoList;
    }

    public CreateCostCenterResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public CreateCostCenterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateCostCenterResponseBodyCostCenterDtoList extends TeaModel {
        /**
         * <p>Cost center ID</p>
         * 
         * <strong>example:</strong>
         * <p>485938</p>
         */
        @NameInMap("CostCenterId")
        public Long costCenterId;

        /**
         * <p>Cost center name (must be unique within the same account)</p>
         * 
         * <strong>example:</strong>
         * <p>资源组</p>
         */
        @NameInMap("CostCenterName")
        public String costCenterName;

        /**
         * <p>Owner user ID of the cost center</p>
         * 
         * <strong>example:</strong>
         * <p>1314839403940987</p>
         */
        @NameInMap("OwnerAccountId")
        public Long ownerAccountId;

        /**
         * <p>Parent cost center ID</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("ParentCostCenterId")
        public Long parentCostCenterId;

        public static CreateCostCenterResponseBodyCostCenterDtoList build(java.util.Map<String, ?> map) throws Exception {
            CreateCostCenterResponseBodyCostCenterDtoList self = new CreateCostCenterResponseBodyCostCenterDtoList();
            return TeaModel.build(map, self);
        }

        public CreateCostCenterResponseBodyCostCenterDtoList setCostCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        public CreateCostCenterResponseBodyCostCenterDtoList setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public CreateCostCenterResponseBodyCostCenterDtoList setOwnerAccountId(Long ownerAccountId) {
            this.ownerAccountId = ownerAccountId;
            return this;
        }
        public Long getOwnerAccountId() {
            return this.ownerAccountId;
        }

        public CreateCostCenterResponseBodyCostCenterDtoList setParentCostCenterId(Long parentCostCenterId) {
            this.parentCostCenterId = parentCostCenterId;
            return this;
        }
        public Long getParentCostCenterId() {
            return this.parentCostCenterId;
        }

    }

}
