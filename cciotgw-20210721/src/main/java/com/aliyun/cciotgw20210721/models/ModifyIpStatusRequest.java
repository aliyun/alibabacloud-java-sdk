// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class ModifyIpStatusRequest extends TeaModel {
    @NameInMap("IpList")
    public java.util.List<String> ipList;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Isp")
    public String isp;

    @NameInMap("Apn")
    public String apn;

    @NameInMap("CciotGwId")
    public String cciotGwId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Status")
    public String status;

    public static ModifyIpStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpStatusRequest self = new ModifyIpStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIpStatusRequest setIpList(java.util.List<String> ipList) {
        this.ipList = ipList;
        return this;
    }
    public java.util.List<String> getIpList() {
        return this.ipList;
    }

    public ModifyIpStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyIpStatusRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public ModifyIpStatusRequest setApn(String apn) {
        this.apn = apn;
        return this;
    }
    public String getApn() {
        return this.apn;
    }

    public ModifyIpStatusRequest setCciotGwId(String cciotGwId) {
        this.cciotGwId = cciotGwId;
        return this;
    }
    public String getCciotGwId() {
        return this.cciotGwId;
    }

    public ModifyIpStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyIpStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
