// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePropertiesDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("NextValid")
    @Validation(required = true)
    public Boolean nextValid;

    @NameInMap("NextTime")
    @Validation(required = true)
    public Long nextTime;

    @NameInMap("PropertyDataInfos")
    @Validation(required = true)
    public QueryDevicePropertiesDataResponsePropertyDataInfos propertyDataInfos;

    public static QueryDevicePropertiesDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePropertiesDataResponse self = new QueryDevicePropertiesDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryDevicePropertiesDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDevicePropertiesDataResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDevicePropertiesDataResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDevicePropertiesDataResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDevicePropertiesDataResponse setNextValid(Boolean nextValid) {
        this.nextValid = nextValid;
        return this;
    }
    public Boolean getNextValid() {
        return this.nextValid;
    }

    public QueryDevicePropertiesDataResponse setNextTime(Long nextTime) {
        this.nextTime = nextTime;
        return this;
    }
    public Long getNextTime() {
        return this.nextTime;
    }

    public QueryDevicePropertiesDataResponse setPropertyDataInfos(QueryDevicePropertiesDataResponsePropertyDataInfos propertyDataInfos) {
        this.propertyDataInfos = propertyDataInfos;
        return this;
    }
    public QueryDevicePropertiesDataResponsePropertyDataInfos getPropertyDataInfos() {
        return this.propertyDataInfos;
    }

    public static class QueryDevicePropertiesDataResponsePropertyDataInfosPropertyDataInfoListPropertyInfo extends TeaModel {
        @NameInMap("Time")
        @Validation(required = true)
        public Long time;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static QueryDevicePropertiesDataResponsePropertyDataInfosPropertyDataInfoListPropertyInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertiesDataResponsePropertyDataInfosPropertyDataInfoListPropertyInfo self = new QueryDevicePropertiesDataResponsePropertyDataInfosPropertyDataInfoListPropertyInfo();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertiesDataResponsePropertyDataInfosPropertyDataInfoListPropertyInfo setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public QueryDevicePropertiesDataResponsePropertyDataInfosPropertyDataInfoListPropertyInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryDevicePropertiesDataResponsePropertyDataInfosPropertyDataInfoList extends TeaModel {
        @NameInMap("PropertyInfo")
        @Validation(required = true)
        public java.util.List<QueryDevicePropertiesDataResponsePropertyDataInfosPropertyDataInfoListPropertyInfo> propertyInfo;

        public static QueryDevicePropertiesDataResponsePropertyDataInfosPropertyDataInfoList build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertiesDataResponsePropertyDataInfosPropertyDataInfoList self = new QueryDevicePropertiesDataResponsePropertyDataInfosPropertyDataInfoList();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertiesDataResponsePropertyDataInfosPropertyDataInfoList setPropertyInfo(java.util.List<QueryDevicePropertiesDataResponsePropertyDataInfosPropertyDataInfoListPropertyInfo> propertyInfo) {
            this.propertyInfo = propertyInfo;
            return this;
        }
        public java.util.List<QueryDevicePropertiesDataResponsePropertyDataInfosPropertyDataInfoListPropertyInfo> getPropertyInfo() {
            return this.propertyInfo;
        }

    }

    public static class QueryDevicePropertiesDataResponsePropertyDataInfosPropertyDataInfo extends TeaModel {
        @NameInMap("Identifier")
        @Validation(required = true)
        public String identifier;

        @NameInMap("List")
        @Validation(required = true)
        public QueryDevicePropertiesDataResponsePropertyDataInfosPropertyDataInfoList list;

        public static QueryDevicePropertiesDataResponsePropertyDataInfosPropertyDataInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertiesDataResponsePropertyDataInfosPropertyDataInfo self = new QueryDevicePropertiesDataResponsePropertyDataInfosPropertyDataInfo();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertiesDataResponsePropertyDataInfosPropertyDataInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public QueryDevicePropertiesDataResponsePropertyDataInfosPropertyDataInfo setList(QueryDevicePropertiesDataResponsePropertyDataInfosPropertyDataInfoList list) {
            this.list = list;
            return this;
        }
        public QueryDevicePropertiesDataResponsePropertyDataInfosPropertyDataInfoList getList() {
            return this.list;
        }

    }

    public static class QueryDevicePropertiesDataResponsePropertyDataInfos extends TeaModel {
        @NameInMap("PropertyDataInfo")
        @Validation(required = true)
        public java.util.List<QueryDevicePropertiesDataResponsePropertyDataInfosPropertyDataInfo> propertyDataInfo;

        public static QueryDevicePropertiesDataResponsePropertyDataInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertiesDataResponsePropertyDataInfos self = new QueryDevicePropertiesDataResponsePropertyDataInfos();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertiesDataResponsePropertyDataInfos setPropertyDataInfo(java.util.List<QueryDevicePropertiesDataResponsePropertyDataInfosPropertyDataInfo> propertyDataInfo) {
            this.propertyDataInfo = propertyDataInfo;
            return this;
        }
        public java.util.List<QueryDevicePropertiesDataResponsePropertyDataInfosPropertyDataInfo> getPropertyDataInfo() {
            return this.propertyDataInfo;
        }

    }

}
