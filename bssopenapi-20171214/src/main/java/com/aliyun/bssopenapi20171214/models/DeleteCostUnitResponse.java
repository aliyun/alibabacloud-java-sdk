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

    public DeleteCostUnitResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCostUnitResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteCostUnitResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteCostUnitResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteCostUnitResponse setData(DeleteCostUnitResponseData data) {
        this.data = data;
        return this;
    }
    public DeleteCostUnitResponseData getData() {
        return this.data;
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

        public DeleteCostUnitResponseData setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public DeleteCostUnitResponseData setUnitId(Long unitId) {
            this.unitId = unitId;
            return this;
        }
        public Long getUnitId() {
            return this.unitId;
        }

        public DeleteCostUnitResponseData setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

    }

}
