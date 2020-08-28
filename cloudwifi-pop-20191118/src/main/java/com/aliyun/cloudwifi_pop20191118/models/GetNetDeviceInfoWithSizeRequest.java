// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetNetDeviceInfoWithSizeRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("Cursor")
    public Long cursor;

    @NameInMap("Role")
    public String role;

    @NameInMap("ServiceTag")
    public String serviceTag;

    @NameInMap("Idc")
    public String idc;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("MgnIp")
    public String mgnIp;

    @NameInMap("Manufacturer")
    public String manufacturer;

    @NameInMap("LogicNetPod")
    public String logicNetPod;

    @NameInMap("Password")
    public String password;

    @NameInMap("NetPod")
    public String netPod;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Model")
    public String model;

    @NameInMap("Id")
    public Long id;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("Username")
    public String username;

    public static GetNetDeviceInfoWithSizeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNetDeviceInfoWithSizeRequest self = new GetNetDeviceInfoWithSizeRequest();
        return TeaModel.build(map, self);
    }

}
