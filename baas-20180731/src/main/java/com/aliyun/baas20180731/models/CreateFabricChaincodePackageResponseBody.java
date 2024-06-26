// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateFabricChaincodePackageResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateFabricChaincodePackageResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static CreateFabricChaincodePackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFabricChaincodePackageResponseBody self = new CreateFabricChaincodePackageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFabricChaincodePackageResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateFabricChaincodePackageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateFabricChaincodePackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFabricChaincodePackageResponseBody setResult(CreateFabricChaincodePackageResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateFabricChaincodePackageResponseBodyResult getResult() {
        return this.result;
    }

    public CreateFabricChaincodePackageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateFabricChaincodePackageResponseBodyResult extends TeaModel {
        @NameInMap("ChaincodePackageId")
        public Integer chaincodePackageId;

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
        public String type;

        @NameInMap("TypeString")
        public Boolean typeString;

        @NameInMap("UploadTime")
        public Long uploadTime;

        public static CreateFabricChaincodePackageResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateFabricChaincodePackageResponseBodyResult self = new CreateFabricChaincodePackageResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateFabricChaincodePackageResponseBodyResult setChaincodePackageId(Integer chaincodePackageId) {
            this.chaincodePackageId = chaincodePackageId;
            return this;
        }
        public Integer getChaincodePackageId() {
            return this.chaincodePackageId;
        }

        public CreateFabricChaincodePackageResponseBodyResult setChecksum(String checksum) {
            this.checksum = checksum;
            return this;
        }
        public String getChecksum() {
            return this.checksum;
        }

        public CreateFabricChaincodePackageResponseBodyResult setDeleteTime(Long deleteTime) {
            this.deleteTime = deleteTime;
            return this;
        }
        public Long getDeleteTime() {
            return this.deleteTime;
        }

        public CreateFabricChaincodePackageResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public CreateFabricChaincodePackageResponseBodyResult setInstallTime(Long installTime) {
            this.installTime = installTime;
            return this;
        }
        public Long getInstallTime() {
            return this.installTime;
        }

        public CreateFabricChaincodePackageResponseBodyResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public CreateFabricChaincodePackageResponseBodyResult setMd5sum(String md5sum) {
            this.md5sum = md5sum;
            return this;
        }
        public String getMd5sum() {
            return this.md5sum;
        }

        public CreateFabricChaincodePackageResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public CreateFabricChaincodePackageResponseBodyResult setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public CreateFabricChaincodePackageResponseBodyResult setOssURL(String ossURL) {
            this.ossURL = ossURL;
            return this;
        }
        public String getOssURL() {
            return this.ossURL;
        }

        public CreateFabricChaincodePackageResponseBodyResult setProviderBid(String providerBid) {
            this.providerBid = providerBid;
            return this;
        }
        public String getProviderBid() {
            return this.providerBid;
        }

        public CreateFabricChaincodePackageResponseBodyResult setProviderUid(Long providerUid) {
            this.providerUid = providerUid;
            return this;
        }
        public Long getProviderUid() {
            return this.providerUid;
        }

        public CreateFabricChaincodePackageResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateFabricChaincodePackageResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateFabricChaincodePackageResponseBodyResult setTypeString(Boolean typeString) {
            this.typeString = typeString;
            return this;
        }
        public Boolean getTypeString() {
            return this.typeString;
        }

        public CreateFabricChaincodePackageResponseBodyResult setUploadTime(Long uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }
        public Long getUploadTime() {
            return this.uploadTime;
        }

    }

}
