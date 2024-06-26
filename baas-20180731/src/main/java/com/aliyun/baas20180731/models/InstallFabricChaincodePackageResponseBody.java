// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class InstallFabricChaincodePackageResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public InstallFabricChaincodePackageResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static InstallFabricChaincodePackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallFabricChaincodePackageResponseBody self = new InstallFabricChaincodePackageResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallFabricChaincodePackageResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public InstallFabricChaincodePackageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InstallFabricChaincodePackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InstallFabricChaincodePackageResponseBody setResult(InstallFabricChaincodePackageResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public InstallFabricChaincodePackageResponseBodyResult getResult() {
        return this.result;
    }

    public InstallFabricChaincodePackageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class InstallFabricChaincodePackageResponseBodyResult extends TeaModel {
        @NameInMap("ChaincodePackageId")
        public String chaincodePackageId;

        @NameInMap("Checksum")
        public String checksum;

        @NameInMap("DeleteTime")
        public Long deleteTime;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("InstallTime")
        public Long installTime;

        @NameInMap("Label")
        public String label;

        @NameInMap("Md5sum")
        public String md5sum;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("OssBucket")
        public String ossBucket;

        @NameInMap("OssURL")
        public String ossURL;

        @NameInMap("ProviderBid")
        public String providerBid;

        @NameInMap("ProviderUid")
        public Long providerUid;

        @NameInMap("State")
        public String state;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("TypeName")
        public String typeName;

        @NameInMap("UploadTime")
        public Long uploadTime;

        public static InstallFabricChaincodePackageResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            InstallFabricChaincodePackageResponseBodyResult self = new InstallFabricChaincodePackageResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public InstallFabricChaincodePackageResponseBodyResult setChaincodePackageId(String chaincodePackageId) {
            this.chaincodePackageId = chaincodePackageId;
            return this;
        }
        public String getChaincodePackageId() {
            return this.chaincodePackageId;
        }

        public InstallFabricChaincodePackageResponseBodyResult setChecksum(String checksum) {
            this.checksum = checksum;
            return this;
        }
        public String getChecksum() {
            return this.checksum;
        }

        public InstallFabricChaincodePackageResponseBodyResult setDeleteTime(Long deleteTime) {
            this.deleteTime = deleteTime;
            return this;
        }
        public Long getDeleteTime() {
            return this.deleteTime;
        }

        public InstallFabricChaincodePackageResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public InstallFabricChaincodePackageResponseBodyResult setInstallTime(Long installTime) {
            this.installTime = installTime;
            return this;
        }
        public Long getInstallTime() {
            return this.installTime;
        }

        public InstallFabricChaincodePackageResponseBodyResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public InstallFabricChaincodePackageResponseBodyResult setMd5sum(String md5sum) {
            this.md5sum = md5sum;
            return this;
        }
        public String getMd5sum() {
            return this.md5sum;
        }

        public InstallFabricChaincodePackageResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public InstallFabricChaincodePackageResponseBodyResult setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public InstallFabricChaincodePackageResponseBodyResult setOssURL(String ossURL) {
            this.ossURL = ossURL;
            return this;
        }
        public String getOssURL() {
            return this.ossURL;
        }

        public InstallFabricChaincodePackageResponseBodyResult setProviderBid(String providerBid) {
            this.providerBid = providerBid;
            return this;
        }
        public String getProviderBid() {
            return this.providerBid;
        }

        public InstallFabricChaincodePackageResponseBodyResult setProviderUid(Long providerUid) {
            this.providerUid = providerUid;
            return this;
        }
        public Long getProviderUid() {
            return this.providerUid;
        }

        public InstallFabricChaincodePackageResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public InstallFabricChaincodePackageResponseBodyResult setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public InstallFabricChaincodePackageResponseBodyResult setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

        public InstallFabricChaincodePackageResponseBodyResult setUploadTime(Long uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }
        public Long getUploadTime() {
            return this.uploadTime;
        }

    }

}
