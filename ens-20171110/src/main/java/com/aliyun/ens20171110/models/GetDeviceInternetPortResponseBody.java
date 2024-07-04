// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetDeviceInternetPortResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance. The value is the ID of the server or container.</p>
     * 
     * <strong>example:</strong>
     * <p>i-5sadvk2xnylvra9kyejcnevi6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The network mapping information about the instance.</p>
     */
    @NameInMap("NetworkInfo")
    public java.util.List<GetDeviceInternetPortResponseBodyNetworkInfo> networkInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>36311833-83FC-57C3-A7DD-768F61F65555</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDeviceInternetPortResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceInternetPortResponseBody self = new GetDeviceInternetPortResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceInternetPortResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDeviceInternetPortResponseBody setNetworkInfo(java.util.List<GetDeviceInternetPortResponseBodyNetworkInfo> networkInfo) {
        this.networkInfo = networkInfo;
        return this;
    }
    public java.util.List<GetDeviceInternetPortResponseBodyNetworkInfo> getNetworkInfo() {
        return this.networkInfo;
    }

    public GetDeviceInternetPortResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDeviceInternetPortResponseBodyNetworkInfo extends TeaModel {
        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>39.105.62.120</p>
         */
        @NameInMap("ExternalIp")
        public String externalIp;

        /**
         * <p>The external port number.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ExternalPort")
        public String externalPort;

        /**
         * <p>The Internet service provider (ISP).</p>
         * 
         * <strong>example:</strong>
         * <p>cmcc</p>
         */
        @NameInMap("ISP")
        public String ISP;

        /**
         * <p>The internal IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.49</p>
         */
        @NameInMap("InternalIp")
        public String internalIp;

        /**
         * <p>The internal port number.</p>
         * 
         * <strong>example:</strong>
         * <p>2020/2025</p>
         */
        @NameInMap("InternalPort")
        public String internalPort;

        /**
         * <p>The status of the external port.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetDeviceInternetPortResponseBodyNetworkInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceInternetPortResponseBodyNetworkInfo self = new GetDeviceInternetPortResponseBodyNetworkInfo();
            return TeaModel.build(map, self);
        }

        public GetDeviceInternetPortResponseBodyNetworkInfo setExternalIp(String externalIp) {
            this.externalIp = externalIp;
            return this;
        }
        public String getExternalIp() {
            return this.externalIp;
        }

        public GetDeviceInternetPortResponseBodyNetworkInfo setExternalPort(String externalPort) {
            this.externalPort = externalPort;
            return this;
        }
        public String getExternalPort() {
            return this.externalPort;
        }

        public GetDeviceInternetPortResponseBodyNetworkInfo setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

        public GetDeviceInternetPortResponseBodyNetworkInfo setInternalIp(String internalIp) {
            this.internalIp = internalIp;
            return this;
        }
        public String getInternalIp() {
            return this.internalIp;
        }

        public GetDeviceInternetPortResponseBodyNetworkInfo setInternalPort(String internalPort) {
            this.internalPort = internalPort;
            return this;
        }
        public String getInternalPort() {
            return this.internalPort;
        }

        public GetDeviceInternetPortResponseBodyNetworkInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
