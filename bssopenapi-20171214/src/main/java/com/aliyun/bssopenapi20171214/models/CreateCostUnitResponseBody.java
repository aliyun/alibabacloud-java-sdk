// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateCostUnitResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public CreateCostUnitResponseBodyData data;

    public static CreateCostUnitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCostUnitResponseBody self = new CreateCostUnitResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCostUnitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCostUnitResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateCostUnitResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCostUnitResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateCostUnitResponseBody setData(CreateCostUnitResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateCostUnitResponseBodyData getData() {
        return this.data;
    }

    public static class CreateCostUnitResponseBodyDataCostUnitDtoList extends TeaModel {
        @NameInMap("UnitId")
        public Long unitId;

        @NameInMap("ParentUnitId")
        public Long parentUnitId;

        @NameInMap("OwnerUid")
        public Long ownerUid;

        @NameInMap("UnitName")
        public String unitName;

        public static CreateCostUnitResponseBodyDataCostUnitDtoList build(java.util.Map<String, ?> map) throws Exception {
            CreateCostUnitResponseBodyDataCostUnitDtoList self = new CreateCostUnitResponseBodyDataCostUnitDtoList();
            return TeaModel.build(map, self);
        }

        public CreateCostUnitResponseBodyDataCostUnitDtoList setUnitId(Long unitId) {
            this.unitId = unitId;
            return this;
        }
        public Long getUnitId() {
            return this.unitId;
        }

        public CreateCostUnitResponseBodyDataCostUnitDtoList setParentUnitId(Long parentUnitId) {
            this.parentUnitId = parentUnitId;
            return this;
        }
        public Long getParentUnitId() {
            return this.parentUnitId;
        }

        public CreateCostUnitResponseBodyDataCostUnitDtoList setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public CreateCostUnitResponseBodyDataCostUnitDtoList setUnitName(String unitName) {
            this.unitName = unitName;
            return this;
        }
        public String getUnitName() {
            return this.unitName;
        }

    }

    public static class CreateCostUnitResponseBodyData extends TeaModel {
        @NameInMap("CostUnitDtoList")
        public java.util.List<CreateCostUnitResponseBodyDataCostUnitDtoList> costUnitDtoList;

        public static CreateCostUnitResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateCostUnitResponseBodyData self = new CreateCostUnitResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateCostUnitResponseBodyData setCostUnitDtoList(java.util.List<CreateCostUnitResponseBodyDataCostUnitDtoList> costUnitDtoList) {
            this.costUnitDtoList = costUnitDtoList;
            return this;
        }
        public java.util.List<CreateCostUnitResponseBodyDataCostUnitDtoList> getCostUnitDtoList() {
            return this.costUnitDtoList;
        }

    }

}
