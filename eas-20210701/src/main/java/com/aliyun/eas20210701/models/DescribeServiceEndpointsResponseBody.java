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
     * <p>The service endpoints.</p>
     */
    @NameInMap("Endpoints")
    public DescribeServiceEndpointsResponseBodyEndpoints endpoints;

    /**
     * <p>The returned message.</p>
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

    public DescribeServiceEndpointsResponseBody setEndpoints(DescribeServiceEndpointsResponseBodyEndpoints endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public DescribeServiceEndpointsResponseBodyEndpoints getEndpoints() {
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
         * <p>The backend access ID, which varies based on the value of the EndpointType parameter.</p>
         * <ul>
         * <li>If you set EndpointType to DefaultGateway, the value of this parameter is default.</li>
         * <li>If you set EndpointType to PrivateGateway, the value of this parameter is the ID of the dedicated gateway.</li>
         * <li>If you set EndpointType to Nlb, the value of this parameter is the ID of the NLB instance.</li>
         * <li>If you set EndpointType to Nacos, the value of this parameter is the ID of the Nacos instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>nlb-5q4sp7u6oorkha****</p>
         */
        @NameInMap("BackendId")
        public String backendId;

        /**
         * <p>The service endpoint type. Valid values:</p>
         * <ul>
         * <li>DefaultGateway: the shared gateway.</li>
         * <li>PrivateGateway: the dedicated gateway.</li>
         * <li>Nlb: Associate the service with the Network Load Balancer (NLB) instance.</li>
         * <li>Nacos: Associate the service with the Nacos instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Nlb</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>The public endpoints.</p>
         */
        @NameInMap("InternetEndpoints")
        public java.util.List<String> internetEndpoints;

        /**
         * <p>The internal endpoints.</p>
         */
        @NameInMap("IntranetEndpoints")
        public java.util.List<String> intranetEndpoints;

        /**
         * <p>The path type. Valid values:</p>
         * <ul>
         * <li>Group: the path of the service group.</li>
         * <li>Service: the path of the service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Service</p>
         */
        @NameInMap("PathType")
        public String pathType;

        /**
         * <p>The port number. This parameter takes effect only when you associate the service with an NLB or Nacos instance.</p>
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
