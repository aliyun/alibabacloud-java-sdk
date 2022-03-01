// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class ChaincodePackage extends TeaModel {
    // 链码包ID
    @NameInMap("ChaincodePackageId")
    public String chaincodePackageId;

    // 链码校验值
    @NameInMap("Checksum")
    public String checksum;

    // 删除时间
    @NameInMap("DeleteTime")
    public String deleteTime;

    // 是否删除
    @NameInMap("Deleted")
    public Boolean deleted;

    // 安装时间
    @NameInMap("InstallTime")
    public String installTime;

    // 链码label
    @NameInMap("Label")
    public String label;

    // 链码md5值
    @NameInMap("Md5sum")
    public String md5sum;

    // 信息
    @NameInMap("Message")
    public String message;

    // 组织ID
    @NameInMap("OrganizationId")
    public String organizationId;

    // 链码包存放bucket内路径
    @NameInMap("OssURL")
    public String ossURL;

    // 上传者Bid
    @NameInMap("ProviderBid")
    public String providerBid;

    // 上传者Uid
    @NameInMap("ProviderUid")
    public String providerUid;

    // 链码状态
    @NameInMap("State")
    public String state;

    // 链码类型
    @NameInMap("Type")
    public Integer type;

    // 链码类型
    @NameInMap("TypeName")
    public String typeName;

    // 上传时间
    @NameInMap("UploadTime")
    public String uploadTime;

    public static ChaincodePackage build(java.util.Map<String, ?> map) throws Exception {
        ChaincodePackage self = new ChaincodePackage();
        return TeaModel.build(map, self);
    }

    public ChaincodePackage setChaincodePackageId(String chaincodePackageId) {
        this.chaincodePackageId = chaincodePackageId;
        return this;
    }
    public String getChaincodePackageId() {
        return this.chaincodePackageId;
    }

    public ChaincodePackage setChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }
    public String getChecksum() {
        return this.checksum;
    }

    public ChaincodePackage setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }
    public String getDeleteTime() {
        return this.deleteTime;
    }

    public ChaincodePackage setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

    public ChaincodePackage setInstallTime(String installTime) {
        this.installTime = installTime;
        return this;
    }
    public String getInstallTime() {
        return this.installTime;
    }

    public ChaincodePackage setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public ChaincodePackage setMd5sum(String md5sum) {
        this.md5sum = md5sum;
        return this;
    }
    public String getMd5sum() {
        return this.md5sum;
    }

    public ChaincodePackage setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChaincodePackage setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public ChaincodePackage setOssURL(String ossURL) {
        this.ossURL = ossURL;
        return this;
    }
    public String getOssURL() {
        return this.ossURL;
    }

    public ChaincodePackage setProviderBid(String providerBid) {
        this.providerBid = providerBid;
        return this;
    }
    public String getProviderBid() {
        return this.providerBid;
    }

    public ChaincodePackage setProviderUid(String providerUid) {
        this.providerUid = providerUid;
        return this;
    }
    public String getProviderUid() {
        return this.providerUid;
    }

    public ChaincodePackage setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ChaincodePackage setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public ChaincodePackage setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    public String getTypeName() {
        return this.typeName;
    }

    public ChaincodePackage setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
        return this;
    }
    public String getUploadTime() {
        return this.uploadTime;
    }

}
