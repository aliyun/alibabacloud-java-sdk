// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightInventoryPriceCheckResponseBody extends TeaModel {
    @NameInMap("module")
    public IntlFlightInventoryPriceCheckResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static IntlFlightInventoryPriceCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightInventoryPriceCheckResponseBody self = new IntlFlightInventoryPriceCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public IntlFlightInventoryPriceCheckResponseBody setModule(IntlFlightInventoryPriceCheckResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public IntlFlightInventoryPriceCheckResponseBodyModule getModule() {
        return this.module;
    }

    public IntlFlightInventoryPriceCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IntlFlightInventoryPriceCheckResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public IntlFlightInventoryPriceCheckResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public IntlFlightInventoryPriceCheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IntlFlightInventoryPriceCheckResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListChangedPrice extends TeaModel {
        @NameInMap("build_price")
        public Long buildPrice;

        @NameInMap("oil_price")
        public Long oilPrice;

        @NameInMap("tax_price")
        public Long taxPrice;

        @NameInMap("ticket_price")
        public Long ticketPrice;

        public static IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListChangedPrice build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListChangedPrice self = new IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListChangedPrice();
            return TeaModel.build(map, self);
        }

        public IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListChangedPrice setBuildPrice(Long buildPrice) {
            this.buildPrice = buildPrice;
            return this;
        }
        public Long getBuildPrice() {
            return this.buildPrice;
        }

        public IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListChangedPrice setOilPrice(Long oilPrice) {
            this.oilPrice = oilPrice;
            return this;
        }
        public Long getOilPrice() {
            return this.oilPrice;
        }

        public IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListChangedPrice setTaxPrice(Long taxPrice) {
            this.taxPrice = taxPrice;
            return this;
        }
        public Long getTaxPrice() {
            return this.taxPrice;
        }

        public IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListChangedPrice setTicketPrice(Long ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Long getTicketPrice() {
            return this.ticketPrice;
        }

    }

    public static class IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListOriginalPrice extends TeaModel {
        @NameInMap("build_price")
        public Long buildPrice;

        @NameInMap("oil_price")
        public Long oilPrice;

        @NameInMap("tax_price")
        public Long taxPrice;

        @NameInMap("ticket_price")
        public Long ticketPrice;

        public static IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListOriginalPrice build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListOriginalPrice self = new IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListOriginalPrice();
            return TeaModel.build(map, self);
        }

        public IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListOriginalPrice setBuildPrice(Long buildPrice) {
            this.buildPrice = buildPrice;
            return this;
        }
        public Long getBuildPrice() {
            return this.buildPrice;
        }

        public IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListOriginalPrice setOilPrice(Long oilPrice) {
            this.oilPrice = oilPrice;
            return this;
        }
        public Long getOilPrice() {
            return this.oilPrice;
        }

        public IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListOriginalPrice setTaxPrice(Long taxPrice) {
            this.taxPrice = taxPrice;
            return this;
        }
        public Long getTaxPrice() {
            return this.taxPrice;
        }

        public IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListOriginalPrice setTicketPrice(Long ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Long getTicketPrice() {
            return this.ticketPrice;
        }

    }

    public static class IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoList extends TeaModel {
        @NameInMap("changed")
        public Boolean changed;

        @NameInMap("changed_price")
        public IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListChangedPrice changedPrice;

        @NameInMap("original_price")
        public IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListOriginalPrice originalPrice;

        @NameInMap("passenger_type")
        public Integer passengerType;

        public static IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoList self = new IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoList();
            return TeaModel.build(map, self);
        }

        public IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoList setChanged(Boolean changed) {
            this.changed = changed;
            return this;
        }
        public Boolean getChanged() {
            return this.changed;
        }

        public IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoList setChangedPrice(IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListChangedPrice changedPrice) {
            this.changedPrice = changedPrice;
            return this;
        }
        public IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListChangedPrice getChangedPrice() {
            return this.changedPrice;
        }

        public IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoList setOriginalPrice(IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListOriginalPrice originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListOriginalPrice getOriginalPrice() {
            return this.originalPrice;
        }

        public IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoList setPassengerType(Integer passengerType) {
            this.passengerType = passengerType;
            return this;
        }
        public Integer getPassengerType() {
            return this.passengerType;
        }

    }

    public static class IntlFlightInventoryPriceCheckResponseBodyModule extends TeaModel {
        @NameInMap("check_success")
        public Boolean checkSuccess;

        @NameInMap("fail_type")
        public Integer failType;

        @NameInMap("passenger_changed_price_info_list")
        public java.util.List<IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoList> passengerChangedPriceInfoList;

        @NameInMap("render_key")
        public String renderKey;

        public static IntlFlightInventoryPriceCheckResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightInventoryPriceCheckResponseBodyModule self = new IntlFlightInventoryPriceCheckResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public IntlFlightInventoryPriceCheckResponseBodyModule setCheckSuccess(Boolean checkSuccess) {
            this.checkSuccess = checkSuccess;
            return this;
        }
        public Boolean getCheckSuccess() {
            return this.checkSuccess;
        }

        public IntlFlightInventoryPriceCheckResponseBodyModule setFailType(Integer failType) {
            this.failType = failType;
            return this;
        }
        public Integer getFailType() {
            return this.failType;
        }

        public IntlFlightInventoryPriceCheckResponseBodyModule setPassengerChangedPriceInfoList(java.util.List<IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoList> passengerChangedPriceInfoList) {
            this.passengerChangedPriceInfoList = passengerChangedPriceInfoList;
            return this;
        }
        public java.util.List<IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoList> getPassengerChangedPriceInfoList() {
            return this.passengerChangedPriceInfoList;
        }

        public IntlFlightInventoryPriceCheckResponseBodyModule setRenderKey(String renderKey) {
            this.renderKey = renderKey;
            return this;
        }
        public String getRenderKey() {
            return this.renderKey;
        }

    }

}
