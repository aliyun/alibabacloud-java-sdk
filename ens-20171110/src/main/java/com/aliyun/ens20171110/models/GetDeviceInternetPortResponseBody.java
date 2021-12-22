// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetDeviceInternetPortResponseBody extends TeaModel {
    // InstanceId
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NetworkInfo")
    public java.util.List<GetDeviceInternetPortResponseBodyNetworkInfo> networkInfo;

    // Id of the request
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
        @NameInMap("ExternalIp")
        public String externalIp;

        @NameInMap("ExternalPort")
        public String externalPort;

        @NameInMap("ISP")
        public String ISP;

        @NameInMap("InternalIp")
        public String internalIp;

        @NameInMap("InternalPort")
        public String internalPort;

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
