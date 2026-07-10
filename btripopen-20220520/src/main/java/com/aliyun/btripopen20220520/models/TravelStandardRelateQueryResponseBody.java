// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TravelStandardRelateQueryResponseBody extends TeaModel {
    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public TravelStandardRelateQueryResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultCode")
    public Integer resultCode;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static TravelStandardRelateQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TravelStandardRelateQueryResponseBody self = new TravelStandardRelateQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public TravelStandardRelateQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TravelStandardRelateQueryResponseBody setModule(TravelStandardRelateQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TravelStandardRelateQueryResponseBodyModule getModule() {
        return this.module;
    }

    public TravelStandardRelateQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TravelStandardRelateQueryResponseBody setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public Integer getResultCode() {
        return this.resultCode;
    }

    public TravelStandardRelateQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TravelStandardRelateQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TravelStandardRelateQueryResponseBodyModuleReserveBindEntityList extends TeaModel {
        @NameInMap("entity_id")
        public String entityId;

        @NameInMap("entity_name")
        public String entityName;

        @NameInMap("entity_type")
        public String entityType;

        public static TravelStandardRelateQueryResponseBodyModuleReserveBindEntityList build(java.util.Map<String, ?> map) throws Exception {
            TravelStandardRelateQueryResponseBodyModuleReserveBindEntityList self = new TravelStandardRelateQueryResponseBodyModuleReserveBindEntityList();
            return TeaModel.build(map, self);
        }

        public TravelStandardRelateQueryResponseBodyModuleReserveBindEntityList setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public TravelStandardRelateQueryResponseBodyModuleReserveBindEntityList setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

        public TravelStandardRelateQueryResponseBodyModuleReserveBindEntityList setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

    public static class TravelStandardRelateQueryResponseBodyModule extends TeaModel {
        @NameInMap("reserve_bind_entity_list")
        public java.util.List<TravelStandardRelateQueryResponseBodyModuleReserveBindEntityList> reserveBindEntityList;

        @NameInMap("total")
        public Integer total;

        public static TravelStandardRelateQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TravelStandardRelateQueryResponseBodyModule self = new TravelStandardRelateQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TravelStandardRelateQueryResponseBodyModule setReserveBindEntityList(java.util.List<TravelStandardRelateQueryResponseBodyModuleReserveBindEntityList> reserveBindEntityList) {
            this.reserveBindEntityList = reserveBindEntityList;
            return this;
        }
        public java.util.List<TravelStandardRelateQueryResponseBodyModuleReserveBindEntityList> getReserveBindEntityList() {
            return this.reserveBindEntityList;
        }

        public TravelStandardRelateQueryResponseBodyModule setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
