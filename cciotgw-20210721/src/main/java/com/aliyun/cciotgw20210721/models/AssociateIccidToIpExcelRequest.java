// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class AssociateIccidToIpExcelRequest extends TeaModel {
    @NameInMap("Apn")
    public String apn;

    @NameInMap("CciotGwId")
    public String cciotGwId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("IccidIpsFileUrlList")
    public java.util.List<String> iccidIpsFileUrlList;

    @NameInMap("Isp")
    public String isp;

    @NameInMap("RegionId")
    public String regionId;

    public static AssociateIccidToIpExcelRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateIccidToIpExcelRequest self = new AssociateIccidToIpExcelRequest();
        return TeaModel.build(map, self);
    }

    public AssociateIccidToIpExcelRequest setApn(String apn) {
        this.apn = apn;
        return this;
    }
    public String getApn() {
        return this.apn;
    }

    public AssociateIccidToIpExcelRequest setCciotGwId(String cciotGwId) {
        this.cciotGwId = cciotGwId;
        return this;
    }
    public String getCciotGwId() {
        return this.cciotGwId;
    }

    public AssociateIccidToIpExcelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssociateIccidToIpExcelRequest setIccidIpsFileUrlList(java.util.List<String> iccidIpsFileUrlList) {
        this.iccidIpsFileUrlList = iccidIpsFileUrlList;
        return this;
    }
    public java.util.List<String> getIccidIpsFileUrlList() {
        return this.iccidIpsFileUrlList;
    }

    public AssociateIccidToIpExcelRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public AssociateIccidToIpExcelRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
