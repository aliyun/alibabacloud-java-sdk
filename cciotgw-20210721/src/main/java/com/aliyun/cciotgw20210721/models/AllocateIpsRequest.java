// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class AllocateIpsRequest extends TeaModel {
    @NameInMap("Ips")
    public java.util.List<String> ips;

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

    @NameInMap("IpCount")
    public Integer ipCount;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("AliUid")
    public String aliUid;

    public static AllocateIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateIpsRequest self = new AllocateIpsRequest();
        return TeaModel.build(map, self);
    }

    public AllocateIpsRequest setIps(java.util.List<String> ips) {
        this.ips = ips;
        return this;
    }
    public java.util.List<String> getIps() {
        return this.ips;
    }

    public AllocateIpsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AllocateIpsRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public AllocateIpsRequest setApn(String apn) {
        this.apn = apn;
        return this;
    }
    public String getApn() {
        return this.apn;
    }

    public AllocateIpsRequest setCciotGwId(String cciotGwId) {
        this.cciotGwId = cciotGwId;
        return this;
    }
    public String getCciotGwId() {
        return this.cciotGwId;
    }

    public AllocateIpsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AllocateIpsRequest setIpCount(Integer ipCount) {
        this.ipCount = ipCount;
        return this;
    }
    public Integer getIpCount() {
        return this.ipCount;
    }

    public AllocateIpsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AllocateIpsRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

}
