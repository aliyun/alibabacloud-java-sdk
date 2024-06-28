// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateCostUnitRequest extends TeaModel {
    /**
     * <p>The list of cost centers.</p>
     */
    @NameInMap("UnitEntityList")
    public java.util.List<CreateCostUnitRequestUnitEntityList> unitEntityList;

    public static CreateCostUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCostUnitRequest self = new CreateCostUnitRequest();
        return TeaModel.build(map, self);
    }

    public CreateCostUnitRequest setUnitEntityList(java.util.List<CreateCostUnitRequestUnitEntityList> unitEntityList) {
        this.unitEntityList = unitEntityList;
        return this;
    }
    public java.util.List<CreateCostUnitRequestUnitEntityList> getUnitEntityList() {
        return this.unitEntityList;
    }

    public static class CreateCostUnitRequestUnitEntityList extends TeaModel {
        /**
         * <p>The user ID of the owner of the cost center.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>982375623</p>
         */
        @NameInMap("OwnerUid")
        public Long ownerUid;

        /**
         * <p>The ID of the parent cost center. A value of -1 indicates the root cost center.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("ParentUnitId")
        public Long parentUnitId;

        /**
         * <p>The name of the cost center.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("UnitName")
        public String unitName;

        public static CreateCostUnitRequestUnitEntityList build(java.util.Map<String, ?> map) throws Exception {
            CreateCostUnitRequestUnitEntityList self = new CreateCostUnitRequestUnitEntityList();
            return TeaModel.build(map, self);
        }

        public CreateCostUnitRequestUnitEntityList setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public CreateCostUnitRequestUnitEntityList setParentUnitId(Long parentUnitId) {
            this.parentUnitId = parentUnitId;
            return this;
        }
        public Long getParentUnitId() {
            return this.parentUnitId;
        }

        public CreateCostUnitRequestUnitEntityList setUnitName(String unitName) {
            this.unitName = unitName;
            return this;
        }
        public String getUnitName() {
            return this.unitName;
        }

    }

}
