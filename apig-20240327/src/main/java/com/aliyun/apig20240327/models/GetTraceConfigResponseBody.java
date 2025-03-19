// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetTraceConfigResponseBody extends TeaModel {
    /**
     * <p>Response Code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public Integer code;

    /**
     * <p>Response Data</p>
     */
    @NameInMap("data")
    public GetTraceConfigResponseBodyData data;

    /**
     * <p>Error Message</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>2F46B9E7-67EF-5C8A-BA52-D38D5B32AF2C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Boolean	Request Result, with the following values:
     * true: Request succeeded.
     * false: Request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetTraceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTraceConfigResponseBody self = new GetTraceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTraceConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetTraceConfigResponseBody setData(GetTraceConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTraceConfigResponseBodyData getData() {
        return this.data;
    }

    public GetTraceConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTraceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTraceConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTraceConfigResponseBodyData extends TeaModel {
        /**
         * <p>Whether to Enable Tracing:
         * true: Enabled
         * false: Disabled</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>Sampling Rate</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("sampleRatio")
        public Integer sampleRatio;

        /**
         * <p>Service ID, present when the tracing type is SKYWALKING</p>
         * 
         * <strong>example:</strong>
         * <p>ss-co370icmjeu****</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>服务端口，链路追踪类型为SKYWALKING时存在该参数</p>
         * 
         * <strong>example:</strong>
         * <p>8090</p>
         */
        @NameInMap("servicePort")
        public String servicePort;

        /**
         * <p>Tracing Type:</p>
         * <ul>
         * <li>XTRACE</li>
         * <li>SKYWALKING</li>
         * <li>OPENTELEMETRY</li>
         * <li>OTSKYWALKING</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SKYWALKING</p>
         */
        @NameInMap("traceType")
        public String traceType;

        public static GetTraceConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTraceConfigResponseBodyData self = new GetTraceConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTraceConfigResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetTraceConfigResponseBodyData setSampleRatio(Integer sampleRatio) {
            this.sampleRatio = sampleRatio;
            return this;
        }
        public Integer getSampleRatio() {
            return this.sampleRatio;
        }

        public GetTraceConfigResponseBodyData setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public GetTraceConfigResponseBodyData setServicePort(String servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public String getServicePort() {
            return this.servicePort;
        }

        public GetTraceConfigResponseBodyData setTraceType(String traceType) {
            this.traceType = traceType;
            return this;
        }
        public String getTraceType() {
            return this.traceType;
        }

    }

}
