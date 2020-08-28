// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class UpdateNetDeviceInfoRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("Devices")
    @Validation(required = true)
    public java.util.List<UpdateNetDeviceInfoRequestDevices> devices;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateNetDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetDeviceInfoRequest self = new UpdateNetDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

    public static class UpdateNetDeviceInfoRequestDevices extends TeaModel {
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

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("MgnIp")
        public String mgnIp;

        @NameInMap("HostName")
        @Validation(required = true)
        public String hostName;

        @NameInMap("Manufacturer")
        @Validation(required = true)
        public String manufacturer;

        @NameInMap("LogicNetPod")
        public String logicNetPod;

        @NameInMap("Username")
        public String username;

        public static UpdateNetDeviceInfoRequestDevices build(java.util.Map<String, ?> map) throws Exception {
            UpdateNetDeviceInfoRequestDevices self = new UpdateNetDeviceInfoRequestDevices();
            return TeaModel.build(map, self);
        }

    }

}
