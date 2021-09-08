// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePropertiesDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("NextValid")
    public Boolean nextValid;

    @NameInMap("NextTime")
    public Long nextTime;

    @NameInMap("PropertyDataInfos")
    public QueryDevicePropertiesDataResponseBodyPropertyDataInfos propertyDataInfos;

    public static QueryDevicePropertiesDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePropertiesDataResponseBody self = new QueryDevicePropertiesDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDevicePropertiesDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDevicePropertiesDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDevicePropertiesDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDevicePropertiesDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDevicePropertiesDataResponseBody setNextValid(Boolean nextValid) {
        this.nextValid = nextValid;
        return this;
    }
    public Boolean getNextValid() {
        return this.nextValid;
    }

    public QueryDevicePropertiesDataResponseBody setNextTime(Long nextTime) {
        this.nextTime = nextTime;
        return this;
    }
    public Long getNextTime() {
        return this.nextTime;
    }

    public QueryDevicePropertiesDataResponseBody setPropertyDataInfos(QueryDevicePropertiesDataResponseBodyPropertyDataInfos propertyDataInfos) {
        this.propertyDataInfos = propertyDataInfos;
        return this;
    }
    public QueryDevicePropertiesDataResponseBodyPropertyDataInfos getPropertyDataInfos() {
        return this.propertyDataInfos;
    }

    public static class QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoListPropertyInfo extends TeaModel {
        @NameInMap("Time")
        public Long time;

        @NameInMap("Value")
        public String value;

        public static QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoListPropertyInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoListPropertyInfo self = new QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoListPropertyInfo();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoListPropertyInfo setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoListPropertyInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoList extends TeaModel {
        @NameInMap("PropertyInfo")
        public java.util.List<QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoListPropertyInfo> propertyInfo;

        public static QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoList build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoList self = new QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoList();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoList setPropertyInfo(java.util.List<QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoListPropertyInfo> propertyInfo) {
            this.propertyInfo = propertyInfo;
            return this;
        }
        public java.util.List<QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoListPropertyInfo> getPropertyInfo() {
            return this.propertyInfo;
        }

    }

    public static class QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfo extends TeaModel {
        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("List")
        public QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoList list;

        public static QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfo self = new QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfo();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfo setList(QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoList list) {
            this.list = list;
            return this;
        }
        public QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoList getList() {
            return this.list;
        }

    }

    public static class QueryDevicePropertiesDataResponseBodyPropertyDataInfos extends TeaModel {
        @NameInMap("PropertyDataInfo")
        public java.util.List<QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfo> propertyDataInfo;

        public static QueryDevicePropertiesDataResponseBodyPropertyDataInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertiesDataResponseBodyPropertyDataInfos self = new QueryDevicePropertiesDataResponseBodyPropertyDataInfos();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertiesDataResponseBodyPropertyDataInfos setPropertyDataInfo(java.util.List<QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfo> propertyDataInfo) {
            this.propertyDataInfo = propertyDataInfo;
            return this;
        }
        public java.util.List<QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfo> getPropertyDataInfo() {
            return this.propertyDataInfo;
        }

    }

}
