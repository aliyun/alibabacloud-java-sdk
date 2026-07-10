// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelIndexInfoResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public HotelIndexInfoResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static HotelIndexInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HotelIndexInfoResponseBody self = new HotelIndexInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public HotelIndexInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HotelIndexInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HotelIndexInfoResponseBody setModule(HotelIndexInfoResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public HotelIndexInfoResponseBodyModule getModule() {
        return this.module;
    }

    public HotelIndexInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotelIndexInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public HotelIndexInfoResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class HotelIndexInfoResponseBodyModuleItems extends TeaModel {
        @NameInMap("hotel_id")
        public String hotelId;

        @NameInMap("hotel_status")
        public String hotelStatus;

        public static HotelIndexInfoResponseBodyModuleItems build(java.util.Map<String, ?> map) throws Exception {
            HotelIndexInfoResponseBodyModuleItems self = new HotelIndexInfoResponseBodyModuleItems();
            return TeaModel.build(map, self);
        }

        public HotelIndexInfoResponseBodyModuleItems setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public HotelIndexInfoResponseBodyModuleItems setHotelStatus(String hotelStatus) {
            this.hotelStatus = hotelStatus;
            return this;
        }
        public String getHotelStatus() {
            return this.hotelStatus;
        }

    }

    public static class HotelIndexInfoResponseBodyModule extends TeaModel {
        @NameInMap("items")
        public java.util.List<HotelIndexInfoResponseBodyModuleItems> items;

        @NameInMap("page_size")
        public Integer pageSize;

        @NameInMap("page_token")
        public String pageToken;

        public static HotelIndexInfoResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            HotelIndexInfoResponseBodyModule self = new HotelIndexInfoResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public HotelIndexInfoResponseBodyModule setItems(java.util.List<HotelIndexInfoResponseBodyModuleItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<HotelIndexInfoResponseBodyModuleItems> getItems() {
            return this.items;
        }

        public HotelIndexInfoResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public HotelIndexInfoResponseBodyModule setPageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }
        public String getPageToken() {
            return this.pageToken;
        }

    }

}
