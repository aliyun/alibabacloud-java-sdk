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

    public CreateCostUnitResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCostUnitResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateCostUnitResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCostUnitResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateCostUnitResponse setData(CreateCostUnitResponseData data) {
        this.data = data;
        return this;
    }
    public CreateCostUnitResponseData getData() {
        return this.data;
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

        public CreateCostUnitResponseDataCostUnitDtoList setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public CreateCostUnitResponseDataCostUnitDtoList setParentUnitId(Long parentUnitId) {
            this.parentUnitId = parentUnitId;
            return this;
        }
        public Long getParentUnitId() {
            return this.parentUnitId;
        }

        public CreateCostUnitResponseDataCostUnitDtoList setUnitId(Long unitId) {
            this.unitId = unitId;
            return this;
        }
        public Long getUnitId() {
            return this.unitId;
        }

        public CreateCostUnitResponseDataCostUnitDtoList setUnitName(String unitName) {
            this.unitName = unitName;
            return this;
        }
        public String getUnitName() {
            return this.unitName;
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

        public CreateCostUnitResponseData setCostUnitDtoList(java.util.List<CreateCostUnitResponseDataCostUnitDtoList> costUnitDtoList) {
            this.costUnitDtoList = costUnitDtoList;
            return this;
        }
        public java.util.List<CreateCostUnitResponseDataCostUnitDtoList> getCostUnitDtoList() {
            return this.costUnitDtoList;
        }

    }

}
