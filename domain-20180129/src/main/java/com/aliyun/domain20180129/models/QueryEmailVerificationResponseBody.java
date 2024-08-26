// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryEmailVerificationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>42.<em>.</em>.31</p>
     */
    @NameInMap("ConfirmIp")
    public String confirmIp;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:abc@aliyun.com">abc@aliyun.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <strong>example:</strong>
     * <p>72b36ba0572e423bbb3f19640896****</p>
     */
    @NameInMap("EmailVerificationNo")
    public String emailVerificationNo;

    /**
     * <strong>example:</strong>
     * <p>2019-02-19 16:38:07</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>2019-02-19 16:40:38</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>FC4F7D02-8A83-4E37-B935-2D48A1B8423E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>42.<em>.</em>.115</p>
     */
    @NameInMap("SendIp")
    public String sendIp;

    /**
     * <strong>example:</strong>
     * <p>2019-02-19 16:38:07</p>
     */
    @NameInMap("TokenSendTime")
    public String tokenSendTime;

    /**
     * <strong>example:</strong>
     * <p>140692647406****</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VerificationStatus")
    public Integer verificationStatus;

    /**
     * <strong>example:</strong>
     * <p>2019-02-19 16:40:38</p>
     */
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
