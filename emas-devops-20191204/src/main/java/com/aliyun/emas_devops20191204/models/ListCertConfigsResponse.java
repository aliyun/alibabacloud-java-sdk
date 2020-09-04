// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ListCertConfigsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IosCertList")
    @Validation(required = true)
    public java.util.List<ListCertConfigsResponseIosCertList> iosCertList;

    @NameInMap("AndroidCertList")
    @Validation(required = true)
    public java.util.List<ListCertConfigsResponseAndroidCertList> androidCertList;

    public static ListCertConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCertConfigsResponse self = new ListCertConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListCertConfigsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCertConfigsResponse setIosCertList(java.util.List<ListCertConfigsResponseIosCertList> iosCertList) {
        this.iosCertList = iosCertList;
        return this;
    }
    public java.util.List<ListCertConfigsResponseIosCertList> getIosCertList() {
        return this.iosCertList;
    }

    public ListCertConfigsResponse setAndroidCertList(java.util.List<ListCertConfigsResponseAndroidCertList> androidCertList) {
        this.androidCertList = androidCertList;
        return this;
    }
    public java.util.List<ListCertConfigsResponseAndroidCertList> getAndroidCertList() {
        return this.androidCertList;
    }

    public static class ListCertConfigsResponseIosCertListMobileProvisionQueryVOListCreatorAccount extends TeaModel {
        @NameInMap("Uid")
        @Validation(required = true)
        public String uid;

        @NameInMap("Username")
        @Validation(required = true)
        public String username;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("Email")
        @Validation(required = true)
        public String email;

        public static ListCertConfigsResponseIosCertListMobileProvisionQueryVOListCreatorAccount build(java.util.Map<String, ?> map) throws Exception {
            ListCertConfigsResponseIosCertListMobileProvisionQueryVOListCreatorAccount self = new ListCertConfigsResponseIosCertListMobileProvisionQueryVOListCreatorAccount();
            return TeaModel.build(map, self);
        }

        public ListCertConfigsResponseIosCertListMobileProvisionQueryVOListCreatorAccount setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListCertConfigsResponseIosCertListMobileProvisionQueryVOListCreatorAccount setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ListCertConfigsResponseIosCertListMobileProvisionQueryVOListCreatorAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListCertConfigsResponseIosCertListMobileProvisionQueryVOListCreatorAccount setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

    }

    public static class ListCertConfigsResponseIosCertListMobileProvisionQueryVOList extends TeaModel {
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

        @NameInMap("CreatorAccount")
        @Validation(required = true)
        public ListCertConfigsResponseIosCertListMobileProvisionQueryVOListCreatorAccount creatorAccount;

        public static ListCertConfigsResponseIosCertListMobileProvisionQueryVOList build(java.util.Map<String, ?> map) throws Exception {
            ListCertConfigsResponseIosCertListMobileProvisionQueryVOList self = new ListCertConfigsResponseIosCertListMobileProvisionQueryVOList();
            return TeaModel.build(map, self);
        }

        public ListCertConfigsResponseIosCertListMobileProvisionQueryVOList setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public ListCertConfigsResponseIosCertListMobileProvisionQueryVOList setCertBid(String certBid) {
            this.certBid = certBid;
            return this;
        }
        public String getCertBid() {
            return this.certBid;
        }

        public ListCertConfigsResponseIosCertListMobileProvisionQueryVOList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListCertConfigsResponseIosCertListMobileProvisionQueryVOList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public ListCertConfigsResponseIosCertListMobileProvisionQueryVOList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListCertConfigsResponseIosCertListMobileProvisionQueryVOList setExpireDate(Long expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public Long getExpireDate() {
            return this.expireDate;
        }

        public ListCertConfigsResponseIosCertListMobileProvisionQueryVOList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListCertConfigsResponseIosCertListMobileProvisionQueryVOList setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListCertConfigsResponseIosCertListMobileProvisionQueryVOList setCreatorAccount(ListCertConfigsResponseIosCertListMobileProvisionQueryVOListCreatorAccount creatorAccount) {
            this.creatorAccount = creatorAccount;
            return this;
        }
        public ListCertConfigsResponseIosCertListMobileProvisionQueryVOListCreatorAccount getCreatorAccount() {
            return this.creatorAccount;
        }

    }

    public static class ListCertConfigsResponseIosCertListCreatorAccount extends TeaModel {
        @NameInMap("Uid")
        @Validation(required = true)
        public String uid;

        @NameInMap("Username")
        @Validation(required = true)
        public String username;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("Email")
        @Validation(required = true)
        public String email;

        public static ListCertConfigsResponseIosCertListCreatorAccount build(java.util.Map<String, ?> map) throws Exception {
            ListCertConfigsResponseIosCertListCreatorAccount self = new ListCertConfigsResponseIosCertListCreatorAccount();
            return TeaModel.build(map, self);
        }

        public ListCertConfigsResponseIosCertListCreatorAccount setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListCertConfigsResponseIosCertListCreatorAccount setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ListCertConfigsResponseIosCertListCreatorAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListCertConfigsResponseIosCertListCreatorAccount setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

    }

    public static class ListCertConfigsResponseIosCertList extends TeaModel {
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
        public java.util.List<ListCertConfigsResponseIosCertListMobileProvisionQueryVOList> mobileProvisionQueryVOList;

        @NameInMap("CreatorAccount")
        @Validation(required = true)
        public ListCertConfigsResponseIosCertListCreatorAccount creatorAccount;

        public static ListCertConfigsResponseIosCertList build(java.util.Map<String, ?> map) throws Exception {
            ListCertConfigsResponseIosCertList self = new ListCertConfigsResponseIosCertList();
            return TeaModel.build(map, self);
        }

        public ListCertConfigsResponseIosCertList setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public ListCertConfigsResponseIosCertList setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public ListCertConfigsResponseIosCertList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListCertConfigsResponseIosCertList setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public ListCertConfigsResponseIosCertList setOrganization(String organization) {
            this.organization = organization;
            return this;
        }
        public String getOrganization() {
            return this.organization;
        }

        public ListCertConfigsResponseIosCertList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListCertConfigsResponseIosCertList setExpireDate(Long expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public Long getExpireDate() {
            return this.expireDate;
        }

        public ListCertConfigsResponseIosCertList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListCertConfigsResponseIosCertList setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListCertConfigsResponseIosCertList setMobileProvisionQueryVOList(java.util.List<ListCertConfigsResponseIosCertListMobileProvisionQueryVOList> mobileProvisionQueryVOList) {
            this.mobileProvisionQueryVOList = mobileProvisionQueryVOList;
            return this;
        }
        public java.util.List<ListCertConfigsResponseIosCertListMobileProvisionQueryVOList> getMobileProvisionQueryVOList() {
            return this.mobileProvisionQueryVOList;
        }

        public ListCertConfigsResponseIosCertList setCreatorAccount(ListCertConfigsResponseIosCertListCreatorAccount creatorAccount) {
            this.creatorAccount = creatorAccount;
            return this;
        }
        public ListCertConfigsResponseIosCertListCreatorAccount getCreatorAccount() {
            return this.creatorAccount;
        }

    }

    public static class ListCertConfigsResponseAndroidCertListCreatorAccount extends TeaModel {
        @NameInMap("Uid")
        @Validation(required = true)
        public String uid;

        @NameInMap("Username")
        @Validation(required = true)
        public String username;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("Email")
        @Validation(required = true)
        public String email;

        public static ListCertConfigsResponseAndroidCertListCreatorAccount build(java.util.Map<String, ?> map) throws Exception {
            ListCertConfigsResponseAndroidCertListCreatorAccount self = new ListCertConfigsResponseAndroidCertListCreatorAccount();
            return TeaModel.build(map, self);
        }

        public ListCertConfigsResponseAndroidCertListCreatorAccount setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListCertConfigsResponseAndroidCertListCreatorAccount setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ListCertConfigsResponseAndroidCertListCreatorAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListCertConfigsResponseAndroidCertListCreatorAccount setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

    }

    public static class ListCertConfigsResponseAndroidCertList extends TeaModel {
        @NameInMap("Bid")
        @Validation(required = true)
        public String bid;

        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("SerialNumber")
        @Validation(required = true)
        public String serialNumber;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("KeyAlias")
        @Validation(required = true)
        public String keyAlias;

        @NameInMap("ExpireDate")
        @Validation(required = true)
        public Long expireDate;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

        @NameInMap("CreatorAccount")
        @Validation(required = true)
        public ListCertConfigsResponseAndroidCertListCreatorAccount creatorAccount;

        public static ListCertConfigsResponseAndroidCertList build(java.util.Map<String, ?> map) throws Exception {
            ListCertConfigsResponseAndroidCertList self = new ListCertConfigsResponseAndroidCertList();
            return TeaModel.build(map, self);
        }

        public ListCertConfigsResponseAndroidCertList setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public ListCertConfigsResponseAndroidCertList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListCertConfigsResponseAndroidCertList setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public ListCertConfigsResponseAndroidCertList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListCertConfigsResponseAndroidCertList setKeyAlias(String keyAlias) {
            this.keyAlias = keyAlias;
            return this;
        }
        public String getKeyAlias() {
            return this.keyAlias;
        }

        public ListCertConfigsResponseAndroidCertList setExpireDate(Long expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public Long getExpireDate() {
            return this.expireDate;
        }

        public ListCertConfigsResponseAndroidCertList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListCertConfigsResponseAndroidCertList setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListCertConfigsResponseAndroidCertList setCreatorAccount(ListCertConfigsResponseAndroidCertListCreatorAccount creatorAccount) {
            this.creatorAccount = creatorAccount;
            return this;
        }
        public ListCertConfigsResponseAndroidCertListCreatorAccount getCreatorAccount() {
            return this.creatorAccount;
        }

    }

}
