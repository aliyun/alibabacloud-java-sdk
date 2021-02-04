// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ModifyCostUnitResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ModifyCostUnitResponseData> data;

    public static ModifyCostUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCostUnitResponse self = new ModifyCostUnitResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCostUnitResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyCostUnitResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyCostUnitResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyCostUnitResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ModifyCostUnitResponse setData(java.util.List<ModifyCostUnitResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ModifyCostUnitResponseData> getData() {
        return this.data;
    }

    public static class ModifyCostUnitResponseData extends TeaModel {
        @NameInMap("IsSuccess")
        @Validation(required = true)
        public Boolean isSuccess;

        @NameInMap("UnitId")
        @Validation(required = true)
        public Long unitId;

        @NameInMap("OwnerUid")
        @Validation(required = true)
        public Long ownerUid;

        public static ModifyCostUnitResponseData build(java.util.Map<String, ?> map) throws Exception {
            ModifyCostUnitResponseData self = new ModifyCostUnitResponseData();
            return TeaModel.build(map, self);
        }

        public ModifyCostUnitResponseData setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

        public ModifyCostUnitResponseData setUnitId(Long unitId) {
            this.unitId = unitId;
            return this;
        }
        public Long getUnitId() {
            return this.unitId;
        }

        public ModifyCostUnitResponseData setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

    }

}
