// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class Get400CorpPdfOssUrlRequest extends TeaModel {
    @NameInMap("ManagerCertEffDate")
    public String managerCertEffDate;

    @NameInMap("ManagerCertExpDate")
    public String managerCertExpDate;

    @NameInMap("ManagerCertNumber")
    public String managerCertNumber;

    @NameInMap("ManagerCertPic")
    public String managerCertPic;

    @NameInMap("ManagerCertType")
    public String managerCertType;

    @NameInMap("ManagerMobilePhone")
    public String managerMobilePhone;

    @NameInMap("ManagerName")
    public String managerName;

    @NameInMap("Number")
    public String number;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static Get400CorpPdfOssUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        Get400CorpPdfOssUrlRequest self = new Get400CorpPdfOssUrlRequest();
        return TeaModel.build(map, self);
    }

    public Get400CorpPdfOssUrlRequest setManagerCertEffDate(String managerCertEffDate) {
        this.managerCertEffDate = managerCertEffDate;
        return this;
    }
    public String getManagerCertEffDate() {
        return this.managerCertEffDate;
    }

    public Get400CorpPdfOssUrlRequest setManagerCertExpDate(String managerCertExpDate) {
        this.managerCertExpDate = managerCertExpDate;
        return this;
    }
    public String getManagerCertExpDate() {
        return this.managerCertExpDate;
    }

    public Get400CorpPdfOssUrlRequest setManagerCertNumber(String managerCertNumber) {
        this.managerCertNumber = managerCertNumber;
        return this;
    }
    public String getManagerCertNumber() {
        return this.managerCertNumber;
    }

    public Get400CorpPdfOssUrlRequest setManagerCertPic(String managerCertPic) {
        this.managerCertPic = managerCertPic;
        return this;
    }
    public String getManagerCertPic() {
        return this.managerCertPic;
    }

    public Get400CorpPdfOssUrlRequest setManagerCertType(String managerCertType) {
        this.managerCertType = managerCertType;
        return this;
    }
    public String getManagerCertType() {
        return this.managerCertType;
    }

    public Get400CorpPdfOssUrlRequest setManagerMobilePhone(String managerMobilePhone) {
        this.managerMobilePhone = managerMobilePhone;
        return this;
    }
    public String getManagerMobilePhone() {
        return this.managerMobilePhone;
    }

    public Get400CorpPdfOssUrlRequest setManagerName(String managerName) {
        this.managerName = managerName;
        return this;
    }
    public String getManagerName() {
        return this.managerName;
    }

    public Get400CorpPdfOssUrlRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public Get400CorpPdfOssUrlRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public Get400CorpPdfOssUrlRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public Get400CorpPdfOssUrlRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public Get400CorpPdfOssUrlRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
