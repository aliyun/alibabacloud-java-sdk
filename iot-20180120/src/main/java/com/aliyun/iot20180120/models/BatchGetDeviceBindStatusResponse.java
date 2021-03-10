// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetDeviceBindStatusResponse extends TeaModel {
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

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<BatchGetDeviceBindStatusResponseData> data;

    public static BatchGetDeviceBindStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetDeviceBindStatusResponse self = new BatchGetDeviceBindStatusResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetDeviceBindStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetDeviceBindStatusResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchGetDeviceBindStatusResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchGetDeviceBindStatusResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchGetDeviceBindStatusResponse setData(java.util.List<BatchGetDeviceBindStatusResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BatchGetDeviceBindStatusResponseData> getData() {
        return this.data;
    }

    public static class BatchGetDeviceBindStatusResponseData extends TeaModel {
        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("BindStatus")
        @Validation(required = true)
        public Integer bindStatus;

        public static BatchGetDeviceBindStatusResponseData build(java.util.Map<String, ?> map) throws Exception {
            BatchGetDeviceBindStatusResponseData self = new BatchGetDeviceBindStatusResponseData();
            return TeaModel.build(map, self);
        }

        public BatchGetDeviceBindStatusResponseData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public BatchGetDeviceBindStatusResponseData setBindStatus(Integer bindStatus) {
            this.bindStatus = bindStatus;
            return this;
        }
        public Integer getBindStatus() {
            return this.bindStatus;
        }

    }

}
