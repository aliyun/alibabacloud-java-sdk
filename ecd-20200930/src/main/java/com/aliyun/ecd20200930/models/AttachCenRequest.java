// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AttachCenRequest extends TeaModel {
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
     * <p>The office network ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

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

    public static AttachCenRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachCenRequest self = new AttachCenRequest();
        return TeaModel.build(map, self);
    }

    public AttachCenRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public AttachCenRequest setCenOwnerId(Long cenOwnerId) {
        this.cenOwnerId = cenOwnerId;
        return this;
    }
    public Long getCenOwnerId() {
        return this.cenOwnerId;
    }

    public AttachCenRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public AttachCenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachCenRequest setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }
    public String getVerifyCode() {
        return this.verifyCode;
    }

}
