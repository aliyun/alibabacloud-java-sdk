// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class GetIpStatusRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Isp")
    public String isp;

    @NameInMap("Apn")
    public String apn;

    @NameInMap("CciotGwId")
    public String cciotGwId;

    @NameInMap("Ip")
    public String ip;

    public static GetIpStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIpStatusRequest self = new GetIpStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetIpStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetIpStatusRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public GetIpStatusRequest setApn(String apn) {
        this.apn = apn;
        return this;
    }
    public String getApn() {
        return this.apn;
    }

    public GetIpStatusRequest setCciotGwId(String cciotGwId) {
        this.cciotGwId = cciotGwId;
        return this;
    }
    public String getCciotGwId() {
        return this.cciotGwId;
    }

    public GetIpStatusRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
