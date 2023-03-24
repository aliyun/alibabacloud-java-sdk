// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetDeviceInfoResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetDeviceInfoResponseBodyData data;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

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

    public GetDeviceInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
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
        @NameInMap("identifier")
        public String identifier;

        @NameInMap("paramName")
        public String paramName;

        @NameInMap("statisticsDate")
        public String statisticsDate;

        @NameInMap("type")
        public String type;

        @NameInMap("unit")
        public String unit;

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
        @NameInMap("deviceId")
        public String deviceId;

        @NameInMap("deviceName")
        public String deviceName;

        @NameInMap("firstTypeName")
        public String firstTypeName;

        @NameInMap("recordList")
        public java.util.List<GetDeviceInfoResponseBodyDataRecordList> recordList;

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
