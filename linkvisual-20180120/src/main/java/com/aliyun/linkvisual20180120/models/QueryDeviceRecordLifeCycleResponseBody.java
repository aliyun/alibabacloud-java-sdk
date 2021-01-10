// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceRecordLifeCycleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<QueryDeviceRecordLifeCycleResponseBodyData> data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceRecordLifeCycleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceRecordLifeCycleResponseBody self = new QueryDeviceRecordLifeCycleResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceRecordLifeCycleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceRecordLifeCycleResponseBody setData(java.util.List<QueryDeviceRecordLifeCycleResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryDeviceRecordLifeCycleResponseBodyData> getData() {
        return this.data;
    }

    public QueryDeviceRecordLifeCycleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceRecordLifeCycleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryDeviceRecordLifeCycleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceRecordLifeCycleResponseBodyData extends TeaModel {
        @NameInMap("Day")
        public Integer day;

        @NameInMap("IotId")
        public String iotId;

        public static QueryDeviceRecordLifeCycleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceRecordLifeCycleResponseBodyData self = new QueryDeviceRecordLifeCycleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceRecordLifeCycleResponseBodyData setDay(Integer day) {
            this.day = day;
            return this;
        }
        public Integer getDay() {
            return this.day;
        }

        public QueryDeviceRecordLifeCycleResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

}
