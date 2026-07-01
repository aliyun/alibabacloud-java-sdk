// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSmsTrademarkRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The name of the applicant. The value can be up to 50 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里巴巴（中国）有限公司</p>
     */
    @NameInMap("TrademarkApplicantName")
    public String trademarkApplicantName;

    /**
     * <p>The effective and expiration dates of the exclusive right.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2010-12-14~2030-12-13</p>
     */
    @NameInMap("TrademarkEffExpDate")
    public String trademarkEffExpDate;

    /**
     * <p>The trademark name. The value can be up to 15 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云</p>
     */
    @NameInMap("TrademarkName")
    public String trademarkName;

    /**
     * <p>The fileKey of the trademark details screenshot.</p>
     * <ol>
     * <li>How to query a trademark:</li>
     * </ol>
     * <ul>
     * <li>Log on to the China Trademark Network, click <strong>Trademark Online Query</strong>, and take a screenshot of the trademark details.</li>
     * <li>Accept the terms of use and enter the <strong>Application/Registration Number</strong> to query.</li>
     * <li>Click the <strong>Application/Registration Number</strong> to view the details.</li>
     * </ul>
     * <ol start="2">
     * <li>Information about the trademark file uploaded to OSS. File upload requirements:</li>
     * </ol>
     * <ul>
     * <li>The name of the file to be uploaded cannot contain Chinese characters or special characters.</li>
     * <li>Only images in JPG, PNG, GIF, and JPEG formats are supported, and the image size cannot exceed 5 MB.</li>
     * <li>The screenshot must contain the complete URL.</li>
     * <li>The trademark image must be clear and identical to the <strong>signature name</strong>.</li>
     * <li>The <strong>applicant name</strong> must be identical to the name of the enterprise or institution associated with the signature.</li>
     * <li>The trademark status must be registered trademark.</li>
     * </ul>
     * <ol start="3">
     * <li>To obtain the fileKey, see <a href="https://help.aliyun.com/document_detail/2833114.html">Upload files to OSS</a>.</li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456/test1719383196031.jpg</p>
     */
    @NameInMap("TrademarkPic")
    public String trademarkPic;

    /**
     * <p>The trademark registration number. The value can be up to 15 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>766905</p>
     */
    @NameInMap("TrademarkRegistrationNumber")
    public String trademarkRegistrationNumber;

    public static CreateSmsTrademarkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsTrademarkRequest self = new CreateSmsTrademarkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmsTrademarkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSmsTrademarkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSmsTrademarkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSmsTrademarkRequest setTrademarkApplicantName(String trademarkApplicantName) {
        this.trademarkApplicantName = trademarkApplicantName;
        return this;
    }
    public String getTrademarkApplicantName() {
        return this.trademarkApplicantName;
    }

    public CreateSmsTrademarkRequest setTrademarkEffExpDate(String trademarkEffExpDate) {
        this.trademarkEffExpDate = trademarkEffExpDate;
        return this;
    }
    public String getTrademarkEffExpDate() {
        return this.trademarkEffExpDate;
    }

    public CreateSmsTrademarkRequest setTrademarkName(String trademarkName) {
        this.trademarkName = trademarkName;
        return this;
    }
    public String getTrademarkName() {
        return this.trademarkName;
    }

    public CreateSmsTrademarkRequest setTrademarkPic(String trademarkPic) {
        this.trademarkPic = trademarkPic;
        return this;
    }
    public String getTrademarkPic() {
        return this.trademarkPic;
    }

    public CreateSmsTrademarkRequest setTrademarkRegistrationNumber(String trademarkRegistrationNumber) {
        this.trademarkRegistrationNumber = trademarkRegistrationNumber;
        return this;
    }
    public String getTrademarkRegistrationNumber() {
        return this.trademarkRegistrationNumber;
    }

}
