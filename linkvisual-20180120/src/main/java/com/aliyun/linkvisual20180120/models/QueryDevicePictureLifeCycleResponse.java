// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePictureLifeCycleResponse extends TeaModel {
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
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryDevicePictureLifeCycleResponseData data;

    public static QueryDevicePictureLifeCycleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePictureLifeCycleResponse self = new QueryDevicePictureLifeCycleResponse();
        return TeaModel.build(map, self);
    }

    public QueryDevicePictureLifeCycleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDevicePictureLifeCycleResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDevicePictureLifeCycleResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDevicePictureLifeCycleResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDevicePictureLifeCycleResponse setData(QueryDevicePictureLifeCycleResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDevicePictureLifeCycleResponseData getData() {
        return this.data;
    }

    public static class QueryDevicePictureLifeCycleResponseData extends TeaModel {
        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("Day")
        @Validation(required = true)
        public Integer day;

        public static QueryDevicePictureLifeCycleResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePictureLifeCycleResponseData self = new QueryDevicePictureLifeCycleResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDevicePictureLifeCycleResponseData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryDevicePictureLifeCycleResponseData setDay(Integer day) {
            this.day = day;
            return this;
        }
        public Integer getDay() {
            return this.day;
        }

    }

}
