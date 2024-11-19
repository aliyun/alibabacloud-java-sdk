// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetDeviceBindStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<BatchGetDeviceBindStatusResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>request parameter error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>B1DF865D-2474-4CD5-9B7E-59B06D204CBF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BindStatus")
        public Integer bindStatus;

        /**
         * <p>实例ID。</p>
         * 
         * <strong>example:</strong>
         * <p>iot-v64********</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>sjI0Sd124XFYyjBYMiYO******</p>
         */
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
