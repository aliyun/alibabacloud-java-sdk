// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi_intl20170725.models;

import com.aliyun.tea.*;

public class SearchVerificationRequest extends TeaModel {
    /**
     * <p>The verification code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of the page to return. Pages start from page 1.</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The time when a text message is sent, in milliseconds. You can query text messages that were sent within the last 30 days.</p>
     * <br>
     * <p>Example: 1677600000000.</p>
     */
    @NameInMap("SendDate")
    public Long sendDate;

    /**
     * <p>The service ID that is displayed in the Phone Number Verification Service console.</p>
     */
    @NameInMap("ServiceSid")
    public String serviceSid;

    /**
     * <p>The mobile phone number of the recipient. You must add the country code to the beginning of the mobile phone number. Example: 6212345\*\*\*\*01.</p>
     */
    @NameInMap("To")
    public String to;

    /**
     * <p>The unique authentication ID that is returned by calling the StartVerification operation.</p>
     */
    @NameInMap("VerificationId")
    public String verificationId;

    public static SearchVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchVerificationRequest self = new SearchVerificationRequest();
        return TeaModel.build(map, self);
    }

    public SearchVerificationRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchVerificationRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public SearchVerificationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SearchVerificationRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SearchVerificationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SearchVerificationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SearchVerificationRequest setSendDate(Long sendDate) {
        this.sendDate = sendDate;
        return this;
    }
    public Long getSendDate() {
        return this.sendDate;
    }

    public SearchVerificationRequest setServiceSid(String serviceSid) {
        this.serviceSid = serviceSid;
        return this;
    }
    public String getServiceSid() {
        return this.serviceSid;
    }

    public SearchVerificationRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public SearchVerificationRequest setVerificationId(String verificationId) {
        this.verificationId = verificationId;
        return this;
    }
    public String getVerificationId() {
        return this.verificationId;
    }

}
