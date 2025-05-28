// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateCostCenterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CostCenterEntityList")
    public java.util.List<CreateCostCenterRequestCostCenterEntityList> costCenterEntityList;

    /**
     * <strong>example:</strong>
     * <p>2084210001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    public static CreateCostCenterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCostCenterRequest self = new CreateCostCenterRequest();
        return TeaModel.build(map, self);
    }

    public CreateCostCenterRequest setCostCenterEntityList(java.util.List<CreateCostCenterRequestCostCenterEntityList> costCenterEntityList) {
        this.costCenterEntityList = costCenterEntityList;
        return this;
    }
    public java.util.List<CreateCostCenterRequestCostCenterEntityList> getCostCenterEntityList() {
        return this.costCenterEntityList;
    }

    public CreateCostCenterRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public static class CreateCostCenterRequestCostCenterEntityList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("CostCenterName")
        public String costCenterName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1314839403940987</p>
         */
        @NameInMap("OwnerAccountId")
        public Long ownerAccountId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("ParentCostCenterId")
        public Long parentCostCenterId;

        public static CreateCostCenterRequestCostCenterEntityList build(java.util.Map<String, ?> map) throws Exception {
            CreateCostCenterRequestCostCenterEntityList self = new CreateCostCenterRequestCostCenterEntityList();
            return TeaModel.build(map, self);
        }

        public CreateCostCenterRequestCostCenterEntityList setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public CreateCostCenterRequestCostCenterEntityList setOwnerAccountId(Long ownerAccountId) {
            this.ownerAccountId = ownerAccountId;
            return this;
        }
        public Long getOwnerAccountId() {
            return this.ownerAccountId;
        }

        public CreateCostCenterRequestCostCenterEntityList setParentCostCenterId(Long parentCostCenterId) {
            this.parentCostCenterId = parentCostCenterId;
            return this;
        }
        public Long getParentCostCenterId() {
            return this.parentCostCenterId;
        }

    }

}
