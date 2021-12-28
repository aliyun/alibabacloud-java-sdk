// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class VerifyCenRequest extends TeaModel {
    @NameInMap("CenId")
    public String cenId;

    @NameInMap("CenOwnerId")
    public Long cenOwnerId;

    @NameInMap("CidrBlock")
    public String cidrBlock;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VerifyCode")
    public String verifyCode;

    public static VerifyCenRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyCenRequest self = new VerifyCenRequest();
        return TeaModel.build(map, self);
    }

    public VerifyCenRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public VerifyCenRequest setCenOwnerId(Long cenOwnerId) {
        this.cenOwnerId = cenOwnerId;
        return this;
    }
    public Long getCenOwnerId() {
        return this.cenOwnerId;
    }

    public VerifyCenRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public VerifyCenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public VerifyCenRequest setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }
    public String getVerifyCode() {
        return this.verifyCode;
    }

}
