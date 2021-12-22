// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class GetFreeIpCountRequest extends TeaModel {
    @NameInMap("Apn")
    public String apn;

    @NameInMap("CciotGwId")
    public String cciotGwId;

    @NameInMap("Isp")
    public String isp;

    @NameInMap("RegionId")
    public String regionId;

    public static GetFreeIpCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFreeIpCountRequest self = new GetFreeIpCountRequest();
        return TeaModel.build(map, self);
    }

    public GetFreeIpCountRequest setApn(String apn) {
        this.apn = apn;
        return this;
    }
    public String getApn() {
        return this.apn;
    }

    public GetFreeIpCountRequest setCciotGwId(String cciotGwId) {
        this.cciotGwId = cciotGwId;
        return this;
    }
    public String getCciotGwId() {
        return this.cciotGwId;
    }

    public GetFreeIpCountRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public GetFreeIpCountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
