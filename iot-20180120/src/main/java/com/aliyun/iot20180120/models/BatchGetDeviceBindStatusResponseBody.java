// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetDeviceBindStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<BatchGetDeviceBindStatusResponseBodyData> data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchGetDeviceBindStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetDeviceBindStatusResponseBody self = new BatchGetDeviceBindStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetDeviceBindStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchGetDeviceBindStatusResponseBody setData(java.util.List<BatchGetDeviceBindStatusResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BatchGetDeviceBindStatusResponseBodyData> getData() {
        return this.data;
    }

    public BatchGetDeviceBindStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchGetDeviceBindStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetDeviceBindStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchGetDeviceBindStatusResponseBodyData extends TeaModel {
        @NameInMap("BindStatus")
        public Integer bindStatus;

        /**
         * <p>实例ID。</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IotId")
        public String iotId;

        public static BatchGetDeviceBindStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchGetDeviceBindStatusResponseBodyData self = new BatchGetDeviceBindStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchGetDeviceBindStatusResponseBodyData setBindStatus(Integer bindStatus) {
            this.bindStatus = bindStatus;
            return this;
        }
        public Integer getBindStatus() {
            return this.bindStatus;
        }

        public BatchGetDeviceBindStatusResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public BatchGetDeviceBindStatusResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

}
