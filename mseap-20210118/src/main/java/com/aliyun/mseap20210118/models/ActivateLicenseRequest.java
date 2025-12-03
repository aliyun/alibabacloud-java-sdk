// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class ActivateLicenseRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>P20211118170645000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esp.bookkeeping_course</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>B09YICKLVHNR7ZQR</p>
     */
    @NameInMap("LicenseCode")
    public String licenseCode;

    @NameInMap("LicenseNo")
    public String licenseNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yunMarket</p>
     */
    @NameInMap("LicensePublisher")
    public String licensePublisher;

    public static ActivateLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        ActivateLicenseRequest self = new ActivateLicenseRequest();
        return TeaModel.build(map, self);
    }

    public ActivateLicenseRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ActivateLicenseRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ActivateLicenseRequest setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
        return this;
    }
    public String getLicenseCode() {
        return this.licenseCode;
    }

    public ActivateLicenseRequest setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
        return this;
    }
    public String getLicenseNo() {
        return this.licenseNo;
    }

    public ActivateLicenseRequest setLicensePublisher(String licensePublisher) {
        this.licensePublisher = licensePublisher;
        return this;
    }
    public String getLicensePublisher() {
        return this.licensePublisher;
    }

}
