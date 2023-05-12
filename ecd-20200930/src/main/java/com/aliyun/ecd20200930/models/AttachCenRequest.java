// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AttachCenRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The operation that you want to perform. Set the value to **AttachCen**.</p>
     */
    @NameInMap("CenOwnerId")
    public Long cenOwnerId;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The verification code. If the CEN instance that you specify for the CenId parameter belongs to another Alibaba Cloud account, you must call the SendVerifyCode operation to obtain the verification code.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the workspace.</p>
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
