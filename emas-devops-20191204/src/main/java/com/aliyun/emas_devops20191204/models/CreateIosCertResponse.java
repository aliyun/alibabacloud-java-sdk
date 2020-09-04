// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class CreateIosCertResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Bid")
    @Validation(required = true)
    public String bid;

    @NameInMap("SerialNumber")
    @Validation(required = true)
    public String serialNumber;

    @NameInMap("FileName")
    @Validation(required = true)
    public String fileName;

    @NameInMap("CommonName")
    @Validation(required = true)
    public String commonName;

    @NameInMap("Organization")
    @Validation(required = true)
    public String organization;

    @NameInMap("Status")
    @Validation(required = true)
    public Integer status;

    @NameInMap("ExpireDate")
    @Validation(required = true)
    public Long expireDate;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public Long createTime;

    @NameInMap("UpdateTime")
    @Validation(required = true)
    public Long updateTime;

    @NameInMap("MobileProvisionQueryVOList")
    @Validation(required = true)
    public java.util.List<CreateIosCertResponseMobileProvisionQueryVOList> mobileProvisionQueryVOList;

    public static CreateIosCertResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIosCertResponse self = new CreateIosCertResponse();
        return TeaModel.build(map, self);
    }

    public CreateIosCertResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIosCertResponse setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public CreateIosCertResponse setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public CreateIosCertResponse setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateIosCertResponse setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public CreateIosCertResponse setOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    public String getOrganization() {
        return this.organization;
    }

    public CreateIosCertResponse setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public CreateIosCertResponse setExpireDate(Long expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public Long getExpireDate() {
        return this.expireDate;
    }

    public CreateIosCertResponse setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public CreateIosCertResponse setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public CreateIosCertResponse setMobileProvisionQueryVOList(java.util.List<CreateIosCertResponseMobileProvisionQueryVOList> mobileProvisionQueryVOList) {
        this.mobileProvisionQueryVOList = mobileProvisionQueryVOList;
        return this;
    }
    public java.util.List<CreateIosCertResponseMobileProvisionQueryVOList> getMobileProvisionQueryVOList() {
        return this.mobileProvisionQueryVOList;
    }

    public static class CreateIosCertResponseMobileProvisionQueryVOList extends TeaModel {
        @NameInMap("Bid")
        @Validation(required = true)
        public String bid;

        @NameInMap("CertBid")
        @Validation(required = true)
        public String certBid;

        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("Uuid")
        @Validation(required = true)
        public String uuid;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("ExpireDate")
        @Validation(required = true)
        public Long expireDate;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

        public static CreateIosCertResponseMobileProvisionQueryVOList build(java.util.Map<String, ?> map) throws Exception {
            CreateIosCertResponseMobileProvisionQueryVOList self = new CreateIosCertResponseMobileProvisionQueryVOList();
            return TeaModel.build(map, self);
        }

        public CreateIosCertResponseMobileProvisionQueryVOList setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public CreateIosCertResponseMobileProvisionQueryVOList setCertBid(String certBid) {
            this.certBid = certBid;
            return this;
        }
        public String getCertBid() {
            return this.certBid;
        }

        public CreateIosCertResponseMobileProvisionQueryVOList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public CreateIosCertResponseMobileProvisionQueryVOList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public CreateIosCertResponseMobileProvisionQueryVOList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateIosCertResponseMobileProvisionQueryVOList setExpireDate(Long expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public Long getExpireDate() {
            return this.expireDate;
        }

        public CreateIosCertResponseMobileProvisionQueryVOList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateIosCertResponseMobileProvisionQueryVOList setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
