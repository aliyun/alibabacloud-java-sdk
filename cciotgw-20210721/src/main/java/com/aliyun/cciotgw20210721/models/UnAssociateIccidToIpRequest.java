// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class UnAssociateIccidToIpRequest extends TeaModel {
    @NameInMap("Apn")
    public String apn;

    @NameInMap("CciotGwId")
    public String cciotGwId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("IccidIpList")
    public java.util.List<UnAssociateIccidToIpRequestIccidIpList> iccidIpList;

    @NameInMap("Isp")
    public String isp;

    @NameInMap("RegionId")
    public String regionId;

    public static UnAssociateIccidToIpRequest build(java.util.Map<String, ?> map) throws Exception {
        UnAssociateIccidToIpRequest self = new UnAssociateIccidToIpRequest();
        return TeaModel.build(map, self);
    }

    public UnAssociateIccidToIpRequest setApn(String apn) {
        this.apn = apn;
        return this;
    }
    public String getApn() {
        return this.apn;
    }

    public UnAssociateIccidToIpRequest setCciotGwId(String cciotGwId) {
        this.cciotGwId = cciotGwId;
        return this;
    }
    public String getCciotGwId() {
        return this.cciotGwId;
    }

    public UnAssociateIccidToIpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UnAssociateIccidToIpRequest setIccidIpList(java.util.List<UnAssociateIccidToIpRequestIccidIpList> iccidIpList) {
        this.iccidIpList = iccidIpList;
        return this;
    }
    public java.util.List<UnAssociateIccidToIpRequestIccidIpList> getIccidIpList() {
        return this.iccidIpList;
    }

    public UnAssociateIccidToIpRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public UnAssociateIccidToIpRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class UnAssociateIccidToIpRequestIccidIpList extends TeaModel {
        @NameInMap("Iccid")
        public String iccid;

        @NameInMap("Ip")
        public String ip;

        public static UnAssociateIccidToIpRequestIccidIpList build(java.util.Map<String, ?> map) throws Exception {
            UnAssociateIccidToIpRequestIccidIpList self = new UnAssociateIccidToIpRequestIccidIpList();
            return TeaModel.build(map, self);
        }

        public UnAssociateIccidToIpRequestIccidIpList setIccid(String iccid) {
            this.iccid = iccid;
            return this;
        }
        public String getIccid() {
            return this.iccid;
        }

        public UnAssociateIccidToIpRequestIccidIpList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

}
