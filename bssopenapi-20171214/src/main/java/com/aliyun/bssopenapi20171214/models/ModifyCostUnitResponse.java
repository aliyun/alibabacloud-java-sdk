// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ModifyCostUnitResponse extends TeaModel {
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
    public java.util.List<ModifyCostUnitResponseData> data;

    public static ModifyCostUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCostUnitResponse self = new ModifyCostUnitResponse();
        return TeaModel.build(map, self);
    }

    public static class ModifyCostUnitResponseData extends TeaModel {
        @NameInMap("OwnerUid")
        @Validation(required = true)
        public Long ownerUid;

        @NameInMap("UnitId")
        @Validation(required = true)
        public Long unitId;

        @NameInMap("IsSuccess")
        @Validation(required = true)
        public Boolean isSuccess;

        public static ModifyCostUnitResponseData build(java.util.Map<String, ?> map) throws Exception {
            ModifyCostUnitResponseData self = new ModifyCostUnitResponseData();
            return TeaModel.build(map, self);
        }

    }

}
