// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class NewNetDeviceInfoRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("Devices")
    @Validation(required = true)
    public java.util.List<NewNetDeviceInfoRequestDevices> devices;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static NewNetDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        NewNetDeviceInfoRequest self = new NewNetDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

    public static class NewNetDeviceInfoRequestDevices extends TeaModel {
        @NameInMap("Password")
        public String password;

        @NameInMap("Role")
        public String role;

        @NameInMap("ServiceTag")
        @Validation(required = true)
        public String serviceTag;

        @NameInMap("NetPod")
        public String netPod;

        @NameInMap("Idc")
        public String idc;

        @NameInMap("Model")
        public String model;

        @NameInMap("MgnIp")
        @Validation(required = true)
        public String mgnIp;

        @NameInMap("HostName")
        @Validation(required = true)
        public String hostName;

        @NameInMap("Manufacturer")
        public String manufacturer;

        @NameInMap("LogicNetPod")
        public String logicNetPod;

        @NameInMap("Username")
        public String username;

        public static NewNetDeviceInfoRequestDevices build(java.util.Map<String, ?> map) throws Exception {
            NewNetDeviceInfoRequestDevices self = new NewNetDeviceInfoRequestDevices();
            return TeaModel.build(map, self);
        }

    }

}
