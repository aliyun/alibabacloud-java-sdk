// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DeleteCostUnitResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeleteCostUnitResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteCostUnitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCostUnitResponseBody self = new DeleteCostUnitResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCostUnitResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteCostUnitResponseBody setData(DeleteCostUnitResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteCostUnitResponseBodyData getData() {
        return this.data;
    }

    public DeleteCostUnitResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteCostUnitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCostUnitResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteCostUnitResponseBodyData extends TeaModel {
        @NameInMap("IsSuccess")
        public Boolean isSuccess;

        @NameInMap("OwnerUid")
        public Long ownerUid;

        @NameInMap("UnitId")
        public Long unitId;

        public static DeleteCostUnitResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteCostUnitResponseBodyData self = new DeleteCostUnitResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteCostUnitResponseBodyData setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

        public DeleteCostUnitResponseBodyData setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public DeleteCostUnitResponseBodyData setUnitId(Long unitId) {
            this.unitId = unitId;
            return this;
        }
        public Long getUnitId() {
            return this.unitId;
        }

    }

}
