// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateMachineSwitchRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Ips")
    public String ips;

    @NameInMap("NameSpace")
    public String nameSpace;

    @NameInMap("SwitchName")
    public String switchName;

    @NameInMap("SwitchNameSpace")
    public String switchNameSpace;

    @NameInMap("SwitchValue")
    public String switchValue;

    public static UpdateMachineSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMachineSwitchRequest self = new UpdateMachineSwitchRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMachineSwitchRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public UpdateMachineSwitchRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateMachineSwitchRequest setIps(String ips) {
        this.ips = ips;
        return this;
    }
    public String getIps() {
        return this.ips;
    }

    public UpdateMachineSwitchRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

    public UpdateMachineSwitchRequest setSwitchName(String switchName) {
        this.switchName = switchName;
        return this;
    }
    public String getSwitchName() {
        return this.switchName;
    }

    public UpdateMachineSwitchRequest setSwitchNameSpace(String switchNameSpace) {
        this.switchNameSpace = switchNameSpace;
        return this;
    }
    public String getSwitchNameSpace() {
        return this.switchNameSpace;
    }

    public UpdateMachineSwitchRequest setSwitchValue(String switchValue) {
        this.switchValue = switchValue;
        return this;
    }
    public String getSwitchValue() {
        return this.switchValue;
    }

}
