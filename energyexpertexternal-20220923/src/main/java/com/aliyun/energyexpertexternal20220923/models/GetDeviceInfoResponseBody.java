// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetDeviceInfoResponseBody extends TeaModel {
    /**
     * <p>The code returned for the request. A value of Success indicates that the request was successful. Other values indicate that the request failed. You can troubleshoot the error by viewing the error message returned.</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public GetDeviceInfoResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetDeviceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceInfoResponseBody self = new GetDeviceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeviceInfoResponseBody setData(GetDeviceInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDeviceInfoResponseBodyData getData() {
        return this.data;
    }

    public GetDeviceInfoResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetDeviceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeviceInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDeviceInfoResponseBodyDataRecordList extends TeaModel {
        /**
         * <p>The device identifier.</p>
         */
        @NameInMap("identifier")
        public String identifier;

        /**
         * <p>The parameter name.</p>
         */
        @NameInMap("paramName")
        public String paramName;

        /**
         * <p>The date on which the statistics were collected.</p>
         */
        @NameInMap("statisticsDate")
        public String statisticsDate;

        /**
         * <p>The type of the measuring point.</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The unit of the parameter value.</p>
         */
        @NameInMap("unit")
        public String unit;

        /**
         * <p>The value of the measuring point.</p>
         */
        @NameInMap("value")
        public Double value;

        public static GetDeviceInfoResponseBodyDataRecordList build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceInfoResponseBodyDataRecordList self = new GetDeviceInfoResponseBodyDataRecordList();
            return TeaModel.build(map, self);
        }

        public GetDeviceInfoResponseBodyDataRecordList setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetDeviceInfoResponseBodyDataRecordList setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public GetDeviceInfoResponseBodyDataRecordList setStatisticsDate(String statisticsDate) {
            this.statisticsDate = statisticsDate;
            return this;
        }
        public String getStatisticsDate() {
            return this.statisticsDate;
        }

        public GetDeviceInfoResponseBodyDataRecordList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetDeviceInfoResponseBodyDataRecordList setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public GetDeviceInfoResponseBodyDataRecordList setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

    public static class GetDeviceInfoResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the device.</p>
         */
        @NameInMap("deviceId")
        public String deviceId;

        /**
         * <p>The name of the device.</p>
         */
        @NameInMap("deviceName")
        public String deviceName;

        /**
         * <p>The level 1 meter type.</p>
         */
        @NameInMap("firstTypeName")
        public String firstTypeName;

        /**
         * <p>The device parameters.</p>
         */
        @NameInMap("recordList")
        public java.util.List<GetDeviceInfoResponseBodyDataRecordList> recordList;

        /**
         * <p>The level 2 meter type.</p>
         */
        @NameInMap("secondTypeName")
        public String secondTypeName;

        public static GetDeviceInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceInfoResponseBodyData self = new GetDeviceInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeviceInfoResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetDeviceInfoResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public GetDeviceInfoResponseBodyData setFirstTypeName(String firstTypeName) {
            this.firstTypeName = firstTypeName;
            return this;
        }
        public String getFirstTypeName() {
            return this.firstTypeName;
        }

        public GetDeviceInfoResponseBodyData setRecordList(java.util.List<GetDeviceInfoResponseBodyDataRecordList> recordList) {
            this.recordList = recordList;
            return this;
        }
        public java.util.List<GetDeviceInfoResponseBodyDataRecordList> getRecordList() {
            return this.recordList;
        }

        public GetDeviceInfoResponseBodyData setSecondTypeName(String secondTypeName) {
            this.secondTypeName = secondTypeName;
            return this;
        }
        public String getSecondTypeName() {
            return this.secondTypeName;
        }

    }

}
