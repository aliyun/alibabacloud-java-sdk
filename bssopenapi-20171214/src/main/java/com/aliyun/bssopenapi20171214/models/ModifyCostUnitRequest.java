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

    public static class ModifyCostUnitRequestUnitEntityList extends TeaModel {
        @NameInMap("OwnerUid")
        @Validation(required = true)
        public Long ownerUid;

        @NameInMap("UnitId")
        @Validation(required = true)
        public Long unitId;

        @NameInMap("NewUnitName")
        @Validation(required = true)
        public String newUnitName;

        public static ModifyCostUnitRequestUnitEntityList build(java.util.Map<String, ?> map) throws Exception {
            ModifyCostUnitRequestUnitEntityList self = new ModifyCostUnitRequestUnitEntityList();
            return TeaModel.build(map, self);
        }

    }

}
