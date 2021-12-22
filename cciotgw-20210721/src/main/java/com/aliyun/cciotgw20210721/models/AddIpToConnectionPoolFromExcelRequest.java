// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class AddIpToConnectionPoolFromExcelRequest extends TeaModel {
    @NameInMap("Apn")
    public String apn;

    @NameInMap("CciotGwId")
    public String cciotGwId;

    @NameInMap("CciotId")
    public String cciotId;

    @NameInMap("ConnectionPoolId")
    public String connectionPoolId;

    @NameInMap("IpOssExcelName")
    public String ipOssExcelName;

    @NameInMap("Isp")
    public String isp;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Status")
    public String status;

    public static AddIpToConnectionPoolFromExcelRequest build(java.util.Map<String, ?> map) throws Exception {
        AddIpToConnectionPoolFromExcelRequest self = new AddIpToConnectionPoolFromExcelRequest();
        return TeaModel.build(map, self);
    }

    public AddIpToConnectionPoolFromExcelRequest setApn(String apn) {
        this.apn = apn;
        return this;
    }
    public String getApn() {
        return this.apn;
    }

    public AddIpToConnectionPoolFromExcelRequest setCciotGwId(String cciotGwId) {
        this.cciotGwId = cciotGwId;
        return this;
    }
    public String getCciotGwId() {
        return this.cciotGwId;
    }

    public AddIpToConnectionPoolFromExcelRequest setCciotId(String cciotId) {
        this.cciotId = cciotId;
        return this;
    }
    public String getCciotId() {
        return this.cciotId;
    }

    public AddIpToConnectionPoolFromExcelRequest setConnectionPoolId(String connectionPoolId) {
        this.connectionPoolId = connectionPoolId;
        return this;
    }
    public String getConnectionPoolId() {
        return this.connectionPoolId;
    }

    public AddIpToConnectionPoolFromExcelRequest setIpOssExcelName(String ipOssExcelName) {
        this.ipOssExcelName = ipOssExcelName;
        return this;
    }
    public String getIpOssExcelName() {
        return this.ipOssExcelName;
    }

    public AddIpToConnectionPoolFromExcelRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public AddIpToConnectionPoolFromExcelRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddIpToConnectionPoolFromExcelRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
