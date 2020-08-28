// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateCostUnitResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public CreateCostUnitResponseData data;

    public static CreateCostUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCostUnitResponse self = new CreateCostUnitResponse();
        return TeaModel.build(map, self);
    }

    public static class CreateCostUnitResponseDataCostUnitDtoList extends TeaModel {
        @NameInMap("OwnerUid")
        @Validation(required = true)
        public Long ownerUid;

        @NameInMap("ParentUnitId")
        @Validation(required = true)
        public Long parentUnitId;

        @NameInMap("UnitId")
        @Validation(required = true)
        public Long unitId;

        @NameInMap("UnitName")
        @Validation(required = true)
        public String unitName;

        public static CreateCostUnitResponseDataCostUnitDtoList build(java.util.Map<String, ?> map) throws Exception {
            CreateCostUnitResponseDataCostUnitDtoList self = new CreateCostUnitResponseDataCostUnitDtoList();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateCostUnitResponseData extends TeaModel {
        @NameInMap("CostUnitDtoList")
        @Validation(required = true)
        public java.util.List<CreateCostUnitResponseDataCostUnitDtoList> costUnitDtoList;

        public static CreateCostUnitResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateCostUnitResponseData self = new CreateCostUnitResponseData();
            return TeaModel.build(map, self);
        }

    }

}
