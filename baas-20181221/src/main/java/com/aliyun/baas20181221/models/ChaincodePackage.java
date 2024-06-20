// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class ChaincodePackage extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cmcc-1.5:227c3cd472a8a2fcaa1c63f15812a1894348a985dc723006dd47d9f2848d10ed</p>
     */
    @NameInMap("ChaincodePackageId")
    public String chaincodePackageId;

    /**
     * <strong>example:</strong>
     * <p>15bab12c29edbc095c33545b9867aec9be469c74a6dd5783df6ee74a24334c77</p>
     */
    @NameInMap("Checksum")
    public String checksum;

    /**
     * <strong>example:</strong>
     * <p>1533025590</p>
     */
    @NameInMap("DeleteTime")
    public String deleteTime;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Deleted")
    public Boolean deleted;

    /**
     * <strong>example:</strong>
     * <p>1533025590</p>
     */
    @NameInMap("InstallTime")
    public String installTime;

    /**
     * <strong>example:</strong>
     * <p>label</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <strong>example:</strong>
     * <p>N02eVKuRJDA2ODtieMUxVw==</p>
     */
    @NameInMap("Md5sum")
    public String md5sum;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>peers-aaaaaa2-1eqnj5o5w9dt3</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    /**
     * <strong>example:</strong>
     * <p>hi003/7efbe860-1a40-42c9-9e6b-0bc08d7ee3a4/cmcc.tar.gz</p>
     */
    @NameInMap("OssURL")
    public String ossURL;

    /**
     * <strong>example:</strong>
     * <p>26842</p>
     */
    @NameInMap("ProviderBid")
    public String providerBid;

    /**
     * <strong>example:</strong>
     * <p>1313158505072210</p>
     */
    @NameInMap("ProviderUid")
    public String providerUid;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Type")
    public Integer type;

    /**
     * <strong>example:</strong>
     * <p>golang</p>
     */
    @NameInMap("TypeName")
    public String typeName;

    /**
     * <strong>example:</strong>
     * <p>1533025590</p>
     */
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
