// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceRecordLifeCycleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<QueryDeviceRecordLifeCycleResponseData> data;

    public static QueryDeviceRecordLifeCycleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceRecordLifeCycleResponse self = new QueryDeviceRecordLifeCycleResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceRecordLifeCycleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceRecordLifeCycleResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceRecordLifeCycleResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceRecordLifeCycleResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryDeviceRecordLifeCycleResponse setData(java.util.List<QueryDeviceRecordLifeCycleResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryDeviceRecordLifeCycleResponseData> getData() {
        return this.data;
    }

    public static class QueryDeviceRecordLifeCycleResponseData extends TeaModel {
        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("Day")
        @Validation(required = true)
        public Integer day;

        public static QueryDeviceRecordLifeCycleResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceRecordLifeCycleResponseData self = new QueryDeviceRecordLifeCycleResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceRecordLifeCycleResponseData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryDeviceRecordLifeCycleResponseData setDay(Integer day) {
            this.day = day;
            return this;
        }
        public Integer getDay() {
            return this.day;
        }

    }

}
