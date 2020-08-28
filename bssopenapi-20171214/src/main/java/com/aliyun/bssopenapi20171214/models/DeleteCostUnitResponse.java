// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DeleteCostUnitResponse extends TeaModel {
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
    public DeleteCostUnitResponseData data;

    public static DeleteCostUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCostUnitResponse self = new DeleteCostUnitResponse();
        return TeaModel.build(map, self);
    }

    public static class DeleteCostUnitResponseData extends TeaModel {
        @NameInMap("OwnerUid")
        @Validation(required = true)
        public Long ownerUid;

        @NameInMap("UnitId")
        @Validation(required = true)
        public Long unitId;

        @NameInMap("IsSuccess")
        @Validation(required = true)
        public Boolean isSuccess;

        public static DeleteCostUnitResponseData build(java.util.Map<String, ?> map) throws Exception {
            DeleteCostUnitResponseData self = new DeleteCostUnitResponseData();
            return TeaModel.build(map, self);
        }

    }

}
