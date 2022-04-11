// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class ListIpsStatusRequest extends TeaModel {
    @NameInMap("Apn")
    public String apn;

    @NameInMap("CciotGwId")
    public String cciotGwId;

    @NameInMap("Ips")
    public java.util.List<String> ips;

    @NameInMap("Isp")
    public String isp;

    @NameInMap("RegionId")
    public String regionId;

    public static ListIpsStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIpsStatusRequest self = new ListIpsStatusRequest();
        return TeaModel.build(map, self);
    }

    public ListIpsStatusRequest setApn(String apn) {
        this.apn = apn;
        return this;
    }
    public String getApn() {
        return this.apn;
    }

    public ListIpsStatusRequest setCciotGwId(String cciotGwId) {
        this.cciotGwId = cciotGwId;
        return this;
    }
    public String getCciotGwId() {
        return this.cciotGwId;
    }

    public ListIpsStatusRequest setIps(java.util.List<String> ips) {
        this.ips = ips;
        return this;
    }
    public java.util.List<String> getIps() {
        return this.ips;
    }

    public ListIpsStatusRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public ListIpsStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
