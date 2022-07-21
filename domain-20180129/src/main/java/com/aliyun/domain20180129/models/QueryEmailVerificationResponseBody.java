// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryEmailVerificationResponseBody extends TeaModel {
    @NameInMap("ConfirmIp")
    public String confirmIp;

    @NameInMap("Email")
    public String email;

    @NameInMap("EmailVerificationNo")
    public String emailVerificationNo;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SendIp")
    public String sendIp;

    @NameInMap("TokenSendTime")
    public String tokenSendTime;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("VerificationStatus")
    public Integer verificationStatus;

    @NameInMap("VerificationTime")
    public String verificationTime;

    public static QueryEmailVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEmailVerificationResponseBody self = new QueryEmailVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEmailVerificationResponseBody setConfirmIp(String confirmIp) {
        this.confirmIp = confirmIp;
        return this;
    }
    public String getConfirmIp() {
        return this.confirmIp;
    }

    public QueryEmailVerificationResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public QueryEmailVerificationResponseBody setEmailVerificationNo(String emailVerificationNo) {
        this.emailVerificationNo = emailVerificationNo;
        return this;
    }
    public String getEmailVerificationNo() {
        return this.emailVerificationNo;
    }

    public QueryEmailVerificationResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public QueryEmailVerificationResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public QueryEmailVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEmailVerificationResponseBody setSendIp(String sendIp) {
        this.sendIp = sendIp;
        return this;
    }
    public String getSendIp() {
        return this.sendIp;
    }

    public QueryEmailVerificationResponseBody setTokenSendTime(String tokenSendTime) {
        this.tokenSendTime = tokenSendTime;
        return this;
    }
    public String getTokenSendTime() {
        return this.tokenSendTime;
    }

    public QueryEmailVerificationResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryEmailVerificationResponseBody setVerificationStatus(Integer verificationStatus) {
        this.verificationStatus = verificationStatus;
        return this;
    }
    public Integer getVerificationStatus() {
        return this.verificationStatus;
    }

    public QueryEmailVerificationResponseBody setVerificationTime(String verificationTime) {
        this.verificationTime = verificationTime;
        return this;
    }
    public String getVerificationTime() {
        return this.verificationTime;
    }

}
