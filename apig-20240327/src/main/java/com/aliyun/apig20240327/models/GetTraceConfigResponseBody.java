// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetTraceConfigResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public GetTraceConfigResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2F46B9E7-67EF-5C8A-BA52-D38D5B32AF2C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: true false</p>
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
         * <p>Indicates whether tracing analysis is enabled. Valid values: true and false</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The sampling rate.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("sampleRatio")
        public Integer sampleRatio;

        /**
         * <p>The service ID. This parameter exists when the traceType value is SKYWALKING.</p>
         * 
         * <strong>example:</strong>
         * <p>ss-co370icmjeu****</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>The service port. This parameter exists when the traceType value is SKYWALKING.</p>
         * 
         * <strong>example:</strong>
         * <p>8090</p>
         */
        @NameInMap("servicePort")
        public String servicePort;

        /**
         * <p>The type of tracing analysis. Valid values:</p>
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
