// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelAskingPriceResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public HotelAskingPriceResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static HotelAskingPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HotelAskingPriceResponseBody self = new HotelAskingPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public HotelAskingPriceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HotelAskingPriceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HotelAskingPriceResponseBody setModule(HotelAskingPriceResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public HotelAskingPriceResponseBodyModule getModule() {
        return this.module;
    }

    public HotelAskingPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotelAskingPriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public HotelAskingPriceResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class HotelAskingPriceResponseBodyModuleHotelAskingPriceDetails extends TeaModel {
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("hotel_address")
        public String hotelAddress;

        @NameInMap("hotel_code")
        public String hotelCode;

        @NameInMap("hotel_name")
        public String hotelName;

        @NameInMap("is_protocol")
        public Boolean isProtocol;

        @NameInMap("min_price")
        public Double minPrice;

        @NameInMap("original_min_price")
        public Double originalMinPrice;

        public static HotelAskingPriceResponseBodyModuleHotelAskingPriceDetails build(java.util.Map<String, ?> map) throws Exception {
            HotelAskingPriceResponseBodyModuleHotelAskingPriceDetails self = new HotelAskingPriceResponseBodyModuleHotelAskingPriceDetails();
            return TeaModel.build(map, self);
        }

        public HotelAskingPriceResponseBodyModuleHotelAskingPriceDetails setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public HotelAskingPriceResponseBodyModuleHotelAskingPriceDetails setHotelAddress(String hotelAddress) {
            this.hotelAddress = hotelAddress;
            return this;
        }
        public String getHotelAddress() {
            return this.hotelAddress;
        }

        public HotelAskingPriceResponseBodyModuleHotelAskingPriceDetails setHotelCode(String hotelCode) {
            this.hotelCode = hotelCode;
            return this;
        }
        public String getHotelCode() {
            return this.hotelCode;
        }

        public HotelAskingPriceResponseBodyModuleHotelAskingPriceDetails setHotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }
        public String getHotelName() {
            return this.hotelName;
        }

        public HotelAskingPriceResponseBodyModuleHotelAskingPriceDetails setIsProtocol(Boolean isProtocol) {
            this.isProtocol = isProtocol;
            return this;
        }
        public Boolean getIsProtocol() {
            return this.isProtocol;
        }

        public HotelAskingPriceResponseBodyModuleHotelAskingPriceDetails setMinPrice(Double minPrice) {
            this.minPrice = minPrice;
            return this;
        }
        public Double getMinPrice() {
            return this.minPrice;
        }

        public HotelAskingPriceResponseBodyModuleHotelAskingPriceDetails setOriginalMinPrice(Double originalMinPrice) {
            this.originalMinPrice = originalMinPrice;
            return this;
        }
        public Double getOriginalMinPrice() {
            return this.originalMinPrice;
        }

    }

    public static class HotelAskingPriceResponseBodyModule extends TeaModel {
        @NameInMap("hotel_asking_price_details")
        public java.util.List<HotelAskingPriceResponseBodyModuleHotelAskingPriceDetails> hotelAskingPriceDetails;

        public static HotelAskingPriceResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            HotelAskingPriceResponseBodyModule self = new HotelAskingPriceResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public HotelAskingPriceResponseBodyModule setHotelAskingPriceDetails(java.util.List<HotelAskingPriceResponseBodyModuleHotelAskingPriceDetails> hotelAskingPriceDetails) {
            this.hotelAskingPriceDetails = hotelAskingPriceDetails;
            return this;
        }
        public java.util.List<HotelAskingPriceResponseBodyModuleHotelAskingPriceDetails> getHotelAskingPriceDetails() {
            return this.hotelAskingPriceDetails;
        }

    }

}
