// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateCostUnitRequest extends TeaModel {
    @NameInMap("UnitEntityList")
    public java.util.List<CreateCostUnitRequestUnitEntityList> unitEntityList;

    public static CreateCostUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCostUnitRequest self = new CreateCostUnitRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateCostUnitRequestUnitEntityList extends TeaModel {
        @NameInMap("OwnerUid")
        @Validation(required = true)
        public Long ownerUid;

        @NameInMap("ParentUnitId")
        @Validation(required = true)
        public Long parentUnitId;

        @NameInMap("UnitName")
        @Validation(required = true)
        public String unitName;

        public static CreateCostUnitRequestUnitEntityList build(java.util.Map<String, ?> map) throws Exception {
            CreateCostUnitRequestUnitEntityList self = new CreateCostUnitRequestUnitEntityList();
            return TeaModel.build(map, self);
        }

    }

}
