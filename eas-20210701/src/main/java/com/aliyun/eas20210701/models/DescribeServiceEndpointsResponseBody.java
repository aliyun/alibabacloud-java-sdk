// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceEndpointsResponseBody extends TeaModel {
    /**
     * <p>The service token.</p>
     * 
     * <strong>example:</strong>
     * <p>Nzc5N2FhN<strong><strong>TQ0YzBmYTIyN2MxZTUxN2NkYjg4MTJmMWQxZmY1</strong></strong></p>
     */
    @NameInMap("AccessToken")
    public String accessToken;

    /**
     * <p>The list of service endpoints.</p>
     */
    @NameInMap("Endpoints")
    public java.util.List<DescribeServiceEndpointsResponseBodyEndpoints> endpoints;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Execution succeeded.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>739998B5-FB39-12A3-8323-0FA340317298</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeServiceEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceEndpointsResponseBody self = new DescribeServiceEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceEndpointsResponseBody setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public DescribeServiceEndpointsResponseBody setEndpoints(java.util.List<DescribeServiceEndpointsResponseBodyEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<DescribeServiceEndpointsResponseBodyEndpoints> getEndpoints() {
        return this.endpoints;
    }

    public DescribeServiceEndpointsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeServiceEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeServiceEndpointsResponseBodyEndpoints extends TeaModel {
        /**
         * <p>The ID of the backend service. The value of this parameter varies based on the value of EndpointType:</p>
         * <ul>
         * <li><p>If EndpointType is DefaultGateway, this parameter is set to default.</p>
         * </li>
         * <li><p>If EndpointType is PrivateGateway, this parameter is the ID of the dedicated gateway.</p>
         * </li>
         * <li><p>If EndpointType is Nlb, this parameter is the ID of the NLB instance.</p>
         * </li>
         * <li><p>If EndpointType is Nacos, this parameter is the ID of the Nacos instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>nlb-5q4sp7u6oorkha****</p>
         */
        @NameInMap("BackendId")
        public String backendId;

        /**
         * <p>The connection type of the service endpoint. Valid values:</p>
         * <ul>
         * <li><p>DefaultGateway: The service is connected using a shared gateway.</p>
         * </li>
         * <li><p>PrivateGateway: The service is connected using a dedicated gateway.</p>
         * </li>
         * <li><p>Nlb: The service is attached to a Network Load Balancer (NLB) instance.</p>
         * </li>
         * <li><p>Nacos: The service is attached to a Nacos instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Nlb</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>The list of internet-facing endpoints.</p>
         */
        @NameInMap("InternetEndpoints")
        public java.util.List<String> internetEndpoints;

        /**
         * <p>The list of internal endpoints.</p>
         */
        @NameInMap("IntranetEndpoints")
        public java.util.List<String> intranetEndpoints;

        /**
         * <p>The type of the endpoint. Valid values:</p>
         * <ul>
         * <li><p>Group: The endpoint of an audience group.</p>
         * </li>
         * <li><p>Service: The endpoint of a service.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Service</p>
         */
        @NameInMap("PathType")
        public String pathType;

        /**
         * <p>The port number. This parameter is returned only when the service is attached to an NLB or Nacos instance.</p>
         * 
         * <strong>example:</strong>
         * <p>9090</p>
         */
        @NameInMap("Port")
        public Integer port;

        public static DescribeServiceEndpointsResponseBodyEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceEndpointsResponseBodyEndpoints self = new DescribeServiceEndpointsResponseBodyEndpoints();
            return TeaModel.build(map, self);
        }

        public DescribeServiceEndpointsResponseBodyEndpoints setBackendId(String backendId) {
            this.backendId = backendId;
            return this;
        }
        public String getBackendId() {
            return this.backendId;
        }

        public DescribeServiceEndpointsResponseBodyEndpoints setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public DescribeServiceEndpointsResponseBodyEndpoints setInternetEndpoints(java.util.List<String> internetEndpoints) {
            this.internetEndpoints = internetEndpoints;
            return this;
        }
        public java.util.List<String> getInternetEndpoints() {
            return this.internetEndpoints;
        }

        public DescribeServiceEndpointsResponseBodyEndpoints setIntranetEndpoints(java.util.List<String> intranetEndpoints) {
            this.intranetEndpoints = intranetEndpoints;
            return this;
        }
        public java.util.List<String> getIntranetEndpoints() {
            return this.intranetEndpoints;
        }

        public DescribeServiceEndpointsResponseBodyEndpoints setPathType(String pathType) {
            this.pathType = pathType;
            return this;
        }
        public String getPathType() {
            return this.pathType;
        }

        public DescribeServiceEndpointsResponseBodyEndpoints setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

}
