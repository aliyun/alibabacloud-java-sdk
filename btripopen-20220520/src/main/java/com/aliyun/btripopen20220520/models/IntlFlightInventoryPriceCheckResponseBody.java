// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightInventoryPriceCheckResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public IntlFlightInventoryPriceCheckResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>92359A00-85D8-16C4-AED0-249618DEEC17</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>2103ad1516839612078738332dea5c</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static IntlFlightInventoryPriceCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightInventoryPriceCheckResponseBody self = new IntlFlightInventoryPriceCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public IntlFlightInventoryPriceCheckResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IntlFlightInventoryPriceCheckResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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
        /**
         * <strong>example:</strong>
         * <p>12000</p>
         */
        @NameInMap("tax_price")
        public Long taxPrice;

        /**
         * <strong>example:</strong>
         * <p>90000</p>
         */
        @NameInMap("ticket_price")
        public Long ticketPrice;

        public static IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListChangedPrice build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListChangedPrice self = new IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListChangedPrice();
            return TeaModel.build(map, self);
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
        /**
         * <strong>example:</strong>
         * <p>12000</p>
         */
        @NameInMap("tax_price")
        public Long taxPrice;

        /**
         * <strong>example:</strong>
         * <p>80000</p>
         */
        @NameInMap("ticket_price")
        public Long ticketPrice;

        public static IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListOriginalPrice build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListOriginalPrice self = new IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListOriginalPrice();
            return TeaModel.build(map, self);
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
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("changed")
        public Boolean changed;

        @NameInMap("changed_price")
        public IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListChangedPrice changedPrice;

        @NameInMap("original_price")
        public IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoListOriginalPrice originalPrice;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("check_success")
        public Boolean checkSuccess;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("fail_type")
        public Integer failType;

        @NameInMap("passenger_changed_price_info_list")
        public java.util.List<IntlFlightInventoryPriceCheckResponseBodyModulePassengerChangedPriceInfoList> passengerChangedPriceInfoList;

        /**
         * <strong>example:</strong>
         * <p>fcoid_deb6372db8194f1c94c23bc4fadc508d</p>
         */
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
