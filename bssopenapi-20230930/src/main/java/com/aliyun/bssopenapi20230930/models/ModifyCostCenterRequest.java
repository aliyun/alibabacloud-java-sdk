// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ModifyCostCenterRequest extends TeaModel {
    /**
     * <p>The list of cost center entities.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CostCenterEntityList")
    public java.util.List<ModifyCostCenterRequestCostCenterEntityList> costCenterEntityList;

    /**
     * <p>The level-1 marketplace ID. If this parameter is left empty, the marketplace ID of the current user is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    public static ModifyCostCenterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCostCenterRequest self = new ModifyCostCenterRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCostCenterRequest setCostCenterEntityList(java.util.List<ModifyCostCenterRequestCostCenterEntityList> costCenterEntityList) {
        this.costCenterEntityList = costCenterEntityList;
        return this;
    }
    public java.util.List<ModifyCostCenterRequestCostCenterEntityList> getCostCenterEntityList() {
        return this.costCenterEntityList;
    }

    public ModifyCostCenterRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public static class ModifyCostCenterRequestCostCenterEntityList extends TeaModel {
        /**
         * <p>The ID of the cost center.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>485938</p>
         */
        @NameInMap("CostCenterId")
        public Long costCenterId;

        /**
         * <p>The new name of the cost center. The name must be unique within the same account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>资源组</p>
         */
        @NameInMap("CostCenterName")
        public String costCenterName;

        /**
         * <p>The ID of the owner to which the cost center belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1314839403940987</p>
         */
        @NameInMap("OwnerAccountId")
        public Long ownerAccountId;

        public static ModifyCostCenterRequestCostCenterEntityList build(java.util.Map<String, ?> map) throws Exception {
            ModifyCostCenterRequestCostCenterEntityList self = new ModifyCostCenterRequestCostCenterEntityList();
            return TeaModel.build(map, self);
        }

        public ModifyCostCenterRequestCostCenterEntityList setCostCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        public ModifyCostCenterRequestCostCenterEntityList setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public ModifyCostCenterRequestCostCenterEntityList setOwnerAccountId(Long ownerAccountId) {
            this.ownerAccountId = ownerAccountId;
            return this;
        }
        public Long getOwnerAccountId() {
            return this.ownerAccountId;
        }

    }

}
