// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ModifyCostUnitRequest extends TeaModel {
    @NameInMap("UnitEntityList")
    public java.util.List<ModifyCostUnitRequestUnitEntityList> unitEntityList;

    public static ModifyCostUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCostUnitRequest self = new ModifyCostUnitRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCostUnitRequest setUnitEntityList(java.util.List<ModifyCostUnitRequestUnitEntityList> unitEntityList) {
        this.unitEntityList = unitEntityList;
        return this;
    }
    public java.util.List<ModifyCostUnitRequestUnitEntityList> getUnitEntityList() {
        return this.unitEntityList;
    }

    public static class ModifyCostUnitRequestUnitEntityList extends TeaModel {
        @NameInMap("UnitId")
        public Long unitId;

        @NameInMap("NewUnitName")
        public String newUnitName;

        @NameInMap("OwnerUid")
        public Long ownerUid;

        public static ModifyCostUnitRequestUnitEntityList build(java.util.Map<String, ?> map) throws Exception {
            ModifyCostUnitRequestUnitEntityList self = new ModifyCostUnitRequestUnitEntityList();
            return TeaModel.build(map, self);
        }

        public ModifyCostUnitRequestUnitEntityList setUnitId(Long unitId) {
            this.unitId = unitId;
            return this;
        }
        public Long getUnitId() {
            return this.unitId;
        }

        public ModifyCostUnitRequestUnitEntityList setNewUnitName(String newUnitName) {
            this.newUnitName = newUnitName;
            return this;
        }
        public String getNewUnitName() {
            return this.newUnitName;
        }

        public ModifyCostUnitRequestUnitEntityList setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

    }

}
