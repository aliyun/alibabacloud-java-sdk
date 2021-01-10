// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePictureLifeCycleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryDevicePictureLifeCycleResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDevicePictureLifeCycleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePictureLifeCycleResponseBody self = new QueryDevicePictureLifeCycleResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDevicePictureLifeCycleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDevicePictureLifeCycleResponseBody setData(QueryDevicePictureLifeCycleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDevicePictureLifeCycleResponseBodyData getData() {
        return this.data;
    }

    public QueryDevicePictureLifeCycleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDevicePictureLifeCycleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDevicePictureLifeCycleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDevicePictureLifeCycleResponseBodyData extends TeaModel {
        @NameInMap("Day")
        public Integer day;

        @NameInMap("IotId")
        public String iotId;

        public static QueryDevicePictureLifeCycleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePictureLifeCycleResponseBodyData self = new QueryDevicePictureLifeCycleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDevicePictureLifeCycleResponseBodyData setDay(Integer day) {
            this.day = day;
            return this;
        }
        public Integer getDay() {
            return this.day;
        }

        public QueryDevicePictureLifeCycleResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

}
