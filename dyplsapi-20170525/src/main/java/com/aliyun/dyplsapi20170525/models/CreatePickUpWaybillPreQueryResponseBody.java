// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreatePickUpWaybillPreQueryResponseBody extends TeaModel {
    /**
     * <p>The result set.</p>
     */
    @NameInMap("Data")
    public CreatePickUpWaybillPreQueryResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePickUpWaybillPreQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePickUpWaybillPreQueryResponseBody self = new CreatePickUpWaybillPreQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePickUpWaybillPreQueryResponseBody setData(CreatePickUpWaybillPreQueryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatePickUpWaybillPreQueryResponseBodyData getData() {
        return this.data;
    }

    public CreatePickUpWaybillPreQueryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreatePickUpWaybillPreQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePickUpWaybillPreQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListAppointTimesTimeList extends TeaModel {
        /**
         * <p>The end of the time range.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The tip displayed when the scheduled pickup is not available.</p>
         */
        @NameInMap("SelectDisableTip")
        public String selectDisableTip;

        /**
         * <p>Indicates whether the time range can be selected for the scheduled pickup.</p>
         */
        @NameInMap("Selectable")
        public Boolean selectable;

        /**
         * <p>The beginning of the time range.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListAppointTimesTimeList build(java.util.Map<String, ?> map) throws Exception {
            CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListAppointTimesTimeList self = new CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListAppointTimesTimeList();
            return TeaModel.build(map, self);
        }

        public CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListAppointTimesTimeList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListAppointTimesTimeList setSelectDisableTip(String selectDisableTip) {
            this.selectDisableTip = selectDisableTip;
            return this;
        }
        public String getSelectDisableTip() {
            return this.selectDisableTip;
        }

        public CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListAppointTimesTimeList setSelectable(Boolean selectable) {
            this.selectable = selectable;
            return this;
        }
        public Boolean getSelectable() {
            return this.selectable;
        }

        public CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListAppointTimesTimeList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListAppointTimes extends TeaModel {
        /**
         * <p>The date in the YYYY-MM-DD format.</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>Indicates whether the date is selectable.</p>
         */
        @NameInMap("DateSelectable")
        public Boolean dateSelectable;

        /**
         * <p>The time range for the scheduled pickup for this date.</p>
         */
        @NameInMap("TimeList")
        public java.util.List<CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListAppointTimesTimeList> timeList;

        public static CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListAppointTimes build(java.util.Map<String, ?> map) throws Exception {
            CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListAppointTimes self = new CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListAppointTimes();
            return TeaModel.build(map, self);
        }

        public CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListAppointTimes setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListAppointTimes setDateSelectable(Boolean dateSelectable) {
            this.dateSelectable = dateSelectable;
            return this;
        }
        public Boolean getDateSelectable() {
            return this.dateSelectable;
        }

        public CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListAppointTimes setTimeList(java.util.List<CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListAppointTimesTimeList> timeList) {
            this.timeList = timeList;
            return this;
        }
        public java.util.List<CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListAppointTimesTimeList> getTimeList() {
            return this.timeList;
        }

    }

    public static class CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListRealTime extends TeaModel {
        /**
         * <p>The name of the real-time order type.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The tip displayed when the real-time order cannot be placed.</p>
         */
        @NameInMap("SelectDisableTip")
        public String selectDisableTip;

        /**
         * <p>Indicates whether the real-time order can be placed after the deadline for placing a real-time order is reached.</p>
         */
        @NameInMap("Selectable")
        public Boolean selectable;

        public static CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListRealTime build(java.util.Map<String, ?> map) throws Exception {
            CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListRealTime self = new CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListRealTime();
            return TeaModel.build(map, self);
        }

        public CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListRealTime setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListRealTime setSelectDisableTip(String selectDisableTip) {
            this.selectDisableTip = selectDisableTip;
            return this;
        }
        public String getSelectDisableTip() {
            return this.selectDisableTip;
        }

        public CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListRealTime setSelectable(Boolean selectable) {
            this.selectable = selectable;
            return this;
        }
        public Boolean getSelectable() {
            return this.selectable;
        }

    }

    public static class CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectList extends TeaModel {
        /**
         * <p>The available time for the scheduled pickup. If the current courier company cannot accept the scheduled pickup, this field is left empty.</p>
         */
        @NameInMap("AppointTimes")
        public java.util.List<CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListAppointTimes> appointTimes;

        /**
         * <p>The estimated price. Unit: CNY. The value is accurate to two decimal places. The value of this parameter is displayed if an estimated weight is specified.</p>
         */
        @NameInMap("PrePrice")
        public String prePrice;

        /**
         * <p>The information about whether the real-time order can be selected.</p>
         */
        @NameInMap("RealTime")
        public CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListRealTime realTime;

        public static CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectList build(java.util.Map<String, ?> map) throws Exception {
            CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectList self = new CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectList();
            return TeaModel.build(map, self);
        }

        public CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectList setAppointTimes(java.util.List<CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListAppointTimes> appointTimes) {
            this.appointTimes = appointTimes;
            return this;
        }
        public java.util.List<CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListAppointTimes> getAppointTimes() {
            return this.appointTimes;
        }

        public CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectList setPrePrice(String prePrice) {
            this.prePrice = prePrice;
            return this;
        }
        public String getPrePrice() {
            return this.prePrice;
        }

        public CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectList setRealTime(CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListRealTime realTime) {
            this.realTime = realTime;
            return this;
        }
        public CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectListRealTime getRealTime() {
            return this.realTime;
        }

    }

    public static class CreatePickUpWaybillPreQueryResponseBodyData extends TeaModel {
        /**
         * <p>The response code.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The information about whether the courier company can accept the order.</p>
         */
        @NameInMap("CpTimeSelectList")
        public java.util.List<CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectList> cpTimeSelectList;

        /**
         * <p>The error code.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The response content.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static CreatePickUpWaybillPreQueryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatePickUpWaybillPreQueryResponseBodyData self = new CreatePickUpWaybillPreQueryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatePickUpWaybillPreQueryResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreatePickUpWaybillPreQueryResponseBodyData setCpTimeSelectList(java.util.List<CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectList> cpTimeSelectList) {
            this.cpTimeSelectList = cpTimeSelectList;
            return this;
        }
        public java.util.List<CreatePickUpWaybillPreQueryResponseBodyDataCpTimeSelectList> getCpTimeSelectList() {
            return this.cpTimeSelectList;
        }

        public CreatePickUpWaybillPreQueryResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreatePickUpWaybillPreQueryResponseBodyData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public CreatePickUpWaybillPreQueryResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreatePickUpWaybillPreQueryResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
