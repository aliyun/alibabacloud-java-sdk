// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AddDeviceInternetPortRequest extends TeaModel {
    @NameInMap("ISP")
    public String ISP;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InternalIp")
    public String internalIp;

    @NameInMap("InternalPort")
    public String internalPort;

    @NameInMap("NatType")
    public String natType;

    @NameInMap("RegionId")
    public String regionId;

    public static AddDeviceInternetPortRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceInternetPortRequest self = new AddDeviceInternetPortRequest();
        return TeaModel.build(map, self);
    }

    public AddDeviceInternetPortRequest setISP(String ISP) {
        this.ISP = ISP;
        return this;
    }
    public String getISP() {
        return this.ISP;
    }

    public AddDeviceInternetPortRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddDeviceInternetPortRequest setInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }
    public String getInternalIp() {
        return this.internalIp;
    }

    public AddDeviceInternetPortRequest setInternalPort(String internalPort) {
        this.internalPort = internalPort;
        return this;
    }
    public String getInternalPort() {
        return this.internalPort;
    }

    public AddDeviceInternetPortRequest setNatType(String natType) {
        this.natType = natType;
        return this;
    }
    public String getNatType() {
        return this.natType;
    }

    public AddDeviceInternetPortRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
