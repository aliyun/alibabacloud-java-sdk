// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UsersDetailsVO extends TeaModel {
    @NameInMap("ApprovalSignatureBase64")
    public String approvalSignatureBase64;

    @NameInMap("ApprovalSqlTemplate")
    public String approvalSqlTemplate;

    @NameInMap("ApprovalStatus")
    public String approvalStatus;

    @NameInMap("Creator")
    public Integer creator;

    @NameInMap("DataReady")
    public Integer dataReady;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Mekid")
    public Long mekid;

    @NameInMap("PathPrefix")
    public String pathPrefix;

    @NameInMap("ResultParty")
    public Integer resultParty;

    @NameInMap("Uid")
    public String uid;

    @NameInMap("UserConfirmed")
    public Integer userConfirmed;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("UserPublicKeyPem")
    public String userPublicKeyPem;

    public static UsersDetailsVO build(java.util.Map<String, ?> map) throws Exception {
        UsersDetailsVO self = new UsersDetailsVO();
        return TeaModel.build(map, self);
    }

    public UsersDetailsVO setApprovalSignatureBase64(String approvalSignatureBase64) {
        this.approvalSignatureBase64 = approvalSignatureBase64;
        return this;
    }
    public String getApprovalSignatureBase64() {
        return this.approvalSignatureBase64;
    }

    public UsersDetailsVO setApprovalSqlTemplate(String approvalSqlTemplate) {
        this.approvalSqlTemplate = approvalSqlTemplate;
        return this;
    }
    public String getApprovalSqlTemplate() {
        return this.approvalSqlTemplate;
    }

    public UsersDetailsVO setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    public UsersDetailsVO setCreator(Integer creator) {
        this.creator = creator;
        return this;
    }
    public Integer getCreator() {
        return this.creator;
    }

    public UsersDetailsVO setDataReady(Integer dataReady) {
        this.dataReady = dataReady;
        return this;
    }
    public Integer getDataReady() {
        return this.dataReady;
    }

    public UsersDetailsVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UsersDetailsVO setMekid(Long mekid) {
        this.mekid = mekid;
        return this;
    }
    public Long getMekid() {
        return this.mekid;
    }

    public UsersDetailsVO setPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }
    public String getPathPrefix() {
        return this.pathPrefix;
    }

    public UsersDetailsVO setResultParty(Integer resultParty) {
        this.resultParty = resultParty;
        return this;
    }
    public Integer getResultParty() {
        return this.resultParty;
    }

    public UsersDetailsVO setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public UsersDetailsVO setUserConfirmed(Integer userConfirmed) {
        this.userConfirmed = userConfirmed;
        return this;
    }
    public Integer getUserConfirmed() {
        return this.userConfirmed;
    }

    public UsersDetailsVO setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public UsersDetailsVO setUserPublicKeyPem(String userPublicKeyPem) {
        this.userPublicKeyPem = userPublicKeyPem;
        return this;
    }
    public String getUserPublicKeyPem() {
        return this.userPublicKeyPem;
    }

}
