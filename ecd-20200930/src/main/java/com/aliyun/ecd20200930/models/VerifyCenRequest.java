// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class VerifyCenRequest extends TeaModel {
    /**
     * <p>The ID of the CEN instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-3gwy16dojz1m65****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The Alibaba Cloud account to which the CEN instance belongs.</p>
     * <ul>
     * <li>If you own the CEN instance, you can skip this parameter.</li>
     * <li>If you do not own the CEN instance, you must specify the ID of the account that owns the CEN instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>102681951715****</p>
     */
    @NameInMap("CenOwnerId")
    public Long cenOwnerId;

    /**
     * <p>The IPv4 CIDR block of the associated office network.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>47.100.XX.XX</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The verification code. If you do not own the CEN instance, you must call the <a href="https://help.aliyun.com/document_detail/436847.html">SendVerifyCode</a> operation to obtain a verification code.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
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
