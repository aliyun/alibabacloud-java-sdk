// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class AssociateIccidToIpRequest extends TeaModel {
    @NameInMap("Apn")
    public String apn;

    @NameInMap("CciotGwId")
    public String cciotGwId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("IccidIpList")
    public java.util.List<AssociateIccidToIpRequestIccidIpList> iccidIpList;

    @NameInMap("Isp")
    public String isp;

    @NameInMap("RegionId")
    public String regionId;

    public static AssociateIccidToIpRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateIccidToIpRequest self = new AssociateIccidToIpRequest();
        return TeaModel.build(map, self);
    }

    public AssociateIccidToIpRequest setApn(String apn) {
        this.apn = apn;
        return this;
    }
    public String getApn() {
        return this.apn;
    }

    public AssociateIccidToIpRequest setCciotGwId(String cciotGwId) {
        this.cciotGwId = cciotGwId;
        return this;
    }
    public String getCciotGwId() {
        return this.cciotGwId;
    }

    public AssociateIccidToIpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssociateIccidToIpRequest setIccidIpList(java.util.List<AssociateIccidToIpRequestIccidIpList> iccidIpList) {
        this.iccidIpList = iccidIpList;
        return this;
    }
    public java.util.List<AssociateIccidToIpRequestIccidIpList> getIccidIpList() {
        return this.iccidIpList;
    }

    public AssociateIccidToIpRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public AssociateIccidToIpRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class AssociateIccidToIpRequestIccidIpList extends TeaModel {
        @NameInMap("CardType")
        public String cardType;

        @NameInMap("Iccid")
        public String iccid;

        @NameInMap("Ip")
        public String ip;

        public static AssociateIccidToIpRequestIccidIpList build(java.util.Map<String, ?> map) throws Exception {
            AssociateIccidToIpRequestIccidIpList self = new AssociateIccidToIpRequestIccidIpList();
            return TeaModel.build(map, self);
        }

        public AssociateIccidToIpRequestIccidIpList setCardType(String cardType) {
            this.cardType = cardType;
            return this;
        }
        public String getCardType() {
            return this.cardType;
        }

        public AssociateIccidToIpRequestIccidIpList setIccid(String iccid) {
            this.iccid = iccid;
            return this;
        }
        public String getIccid() {
            return this.iccid;
        }

        public AssociateIccidToIpRequestIccidIpList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

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
