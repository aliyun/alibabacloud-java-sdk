// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetQueueRateResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<GetQueueRateResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetQueueRateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQueueRateResponseBody self = new GetQueueRateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQueueRateResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetQueueRateResponseBody setData(java.util.List<GetQueueRateResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetQueueRateResponseBodyData> getData() {
        return this.data;
    }

    public GetQueueRateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQueueRateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQueueRateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQueueRateResponseBodyData extends TeaModel {
        @NameInMap("InQps")
        public Long inQps;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OutQps")
        public Long outQps;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("VhostName")
        public String vhostName;

        public static GetQueueRateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQueueRateResponseBodyData self = new GetQueueRateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQueueRateResponseBodyData setInQps(Long inQps) {
            this.inQps = inQps;
            return this;
        }
        public Long getInQps() {
            return this.inQps;
        }

        public GetQueueRateResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetQueueRateResponseBodyData setOutQps(Long outQps) {
            this.outQps = outQps;
            return this;
        }
        public Long getOutQps() {
            return this.outQps;
        }

        public GetQueueRateResponseBodyData setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public GetQueueRateResponseBodyData setVhostName(String vhostName) {
            this.vhostName = vhostName;
            return this;
        }
        public String getVhostName() {
            return this.vhostName;
        }

    }

}
