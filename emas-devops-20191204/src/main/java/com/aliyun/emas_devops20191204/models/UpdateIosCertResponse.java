// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class UpdateIosCertResponse extends TeaModel {
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
    public java.util.List<UpdateIosCertResponseMobileProvisionQueryVOList> mobileProvisionQueryVOList;

    public static UpdateIosCertResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIosCertResponse self = new UpdateIosCertResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIosCertResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateIosCertResponse setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public UpdateIosCertResponse setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public UpdateIosCertResponse setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UpdateIosCertResponse setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public UpdateIosCertResponse setOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    public String getOrganization() {
        return this.organization;
    }

    public UpdateIosCertResponse setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public UpdateIosCertResponse setExpireDate(Long expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public Long getExpireDate() {
        return this.expireDate;
    }

    public UpdateIosCertResponse setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public UpdateIosCertResponse setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public UpdateIosCertResponse setMobileProvisionQueryVOList(java.util.List<UpdateIosCertResponseMobileProvisionQueryVOList> mobileProvisionQueryVOList) {
        this.mobileProvisionQueryVOList = mobileProvisionQueryVOList;
        return this;
    }
    public java.util.List<UpdateIosCertResponseMobileProvisionQueryVOList> getMobileProvisionQueryVOList() {
        return this.mobileProvisionQueryVOList;
    }

    public static class UpdateIosCertResponseMobileProvisionQueryVOList extends TeaModel {
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

        public static UpdateIosCertResponseMobileProvisionQueryVOList build(java.util.Map<String, ?> map) throws Exception {
            UpdateIosCertResponseMobileProvisionQueryVOList self = new UpdateIosCertResponseMobileProvisionQueryVOList();
            return TeaModel.build(map, self);
        }

        public UpdateIosCertResponseMobileProvisionQueryVOList setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public UpdateIosCertResponseMobileProvisionQueryVOList setCertBid(String certBid) {
            this.certBid = certBid;
            return this;
        }
        public String getCertBid() {
            return this.certBid;
        }

        public UpdateIosCertResponseMobileProvisionQueryVOList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public UpdateIosCertResponseMobileProvisionQueryVOList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public UpdateIosCertResponseMobileProvisionQueryVOList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public UpdateIosCertResponseMobileProvisionQueryVOList setExpireDate(Long expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public Long getExpireDate() {
            return this.expireDate;
        }

        public UpdateIosCertResponseMobileProvisionQueryVOList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public UpdateIosCertResponseMobileProvisionQueryVOList setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
