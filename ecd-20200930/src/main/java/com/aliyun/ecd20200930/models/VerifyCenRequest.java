// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class VerifyCenRequest extends TeaModel {
    // The ID of the CEN instance.
    @NameInMap("CenId")
    public String cenId;

    // The ID of the Alibaba Cloud account to which the CEN instance belongs.
    // 
    // *   If you specify the CenId parameter and the CEN instance that you specify for the CenId parameter belongs to the Alibaba Cloud account, skip this parameter.
    // *   If you specify the CenId parameter and the CEN instance that you specify for the CenId parameter belongs to another Alibaba Cloud account, enter the ID of the exact Alibaba Cloud account.
    @NameInMap("CenOwnerId")
    public Long cenOwnerId;

    // The IPv4 CIDR block of the workspace.
    @NameInMap("CidrBlock")
    public String cidrBlock;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The verification code. If the CEN instance that you specify for the CenId parameter belongs to another Alibaba Cloud account, you must call the SendVerifyCode operation to obtain the verification code.
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
