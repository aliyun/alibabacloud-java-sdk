// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetGatewayDfpExtProcServiceResponseBody extends TeaModel {
    /**
     * <p>The result code of the request. The value is Ok if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The binding information of the dynamic forwarding ExtProc service for the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;bound&quot;:true,&quot;serviceId&quot;:&quot;svc-cr8k0udlhtgt80sh7png&quot;,&quot;servicePort&quot;:9002}</p>
     */
    @NameInMap("data")
    public GetGatewayDfpExtProcServiceResponseBodyData data;

    /**
     * <p>The result message of the request. If the request failed, the message contains the error message of the fault.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID, which is used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>F7B8A1C2-1234-5678-90AB-CDEF12345678</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetGatewayDfpExtProcServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayDfpExtProcServiceResponseBody self = new GetGatewayDfpExtProcServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGatewayDfpExtProcServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGatewayDfpExtProcServiceResponseBody setData(GetGatewayDfpExtProcServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGatewayDfpExtProcServiceResponseBodyData getData() {
        return this.data;
    }

    public GetGatewayDfpExtProcServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGatewayDfpExtProcServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGatewayDfpExtProcServiceResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the gateway is bound to a dynamic forwarding ExtProc service.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("bound")
        public Boolean bound;

        /**
         * <p>The ID of the bound ExtProc gRPC service. This parameter is not returned if no service is bound.</p>
         * 
         * <strong>example:</strong>
         * <p>svc-cr8k0udlhtgt80sh7png</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>The gRPC port of the bound service. This parameter is not returned if no service is bound.</p>
         * 
         * <strong>example:</strong>
         * <p>9002</p>
         */
        @NameInMap("servicePort")
        public Integer servicePort;

        public static GetGatewayDfpExtProcServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayDfpExtProcServiceResponseBodyData self = new GetGatewayDfpExtProcServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGatewayDfpExtProcServiceResponseBodyData setBound(Boolean bound) {
            this.bound = bound;
            return this;
        }
        public Boolean getBound() {
            return this.bound;
        }

        public GetGatewayDfpExtProcServiceResponseBodyData setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public GetGatewayDfpExtProcServiceResponseBodyData setServicePort(Integer servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public Integer getServicePort() {
            return this.servicePort;
        }

    }

}
