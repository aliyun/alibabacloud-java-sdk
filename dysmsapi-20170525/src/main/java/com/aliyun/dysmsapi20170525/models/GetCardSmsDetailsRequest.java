// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetCardSmsDetailsRequest extends TeaModel {
    /**
     * <p>The card SMS sending ID. When you send a card SMS by calling the <a href="https://help.aliyun.com/document_detail/434120.html">SendCardSms</a> or <a href="https://help.aliyun.com/document_detail/434119.html">SendBatchCardSms</a> operation, obtain the BizCardId field from the response.</p>
     * 
     * <strong>example:</strong>
     * <p>123456^0</p>
     */
    @NameInMap("BizCardId")
    public String bizCardId;

    /**
     * <p>The digital SMS sending ID. When you send a card SMS by calling the <a href="https://help.aliyun.com/document_detail/434120.html">SendCardSms</a> or <a href="https://help.aliyun.com/document_detail/434119.html">SendBatchCardSms</a> operation, obtain the BizDigitalId field from the response.</p>
     * 
     * <strong>example:</strong>
     * <p>12346^0</p>
     */
    @NameInMap("BizDigitId")
    public String bizDigitId;

    /**
     * <p>The text SMS sending ID. When you send a card SMS by calling the <a href="https://help.aliyun.com/document_detail/434120.html">SendCardSms</a> or <a href="https://help.aliyun.com/document_detail/434119.html">SendBatchCardSms</a> operation, obtain the BizSmsId field from the response.</p>
     * 
     * <strong>example:</strong>
     * <p>1234576^0</p>
     */
    @NameInMap("BizSmsId")
    public String bizSmsId;

    /**
     * <p>The current page number when you paginate sending records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of card SMS records to display on each page when you paginate sending records.</p>
     * <p>Valid values: 1 to 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The domestic mobile phone number that received the SMS. Format: an 11-digit mobile phone number. For example, 1390000****.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1390000****</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The card SMS sending date. Records from the last 30 days can be queried.</p>
     * <p>Format: yyyyMMdd. For example, 20240112.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20240112</p>
     */
    @NameInMap("SendDate")
    public String sendDate;

    public static GetCardSmsDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCardSmsDetailsRequest self = new GetCardSmsDetailsRequest();
        return TeaModel.build(map, self);
    }

    public GetCardSmsDetailsRequest setBizCardId(String bizCardId) {
        this.bizCardId = bizCardId;
        return this;
    }
    public String getBizCardId() {
        return this.bizCardId;
    }

    public GetCardSmsDetailsRequest setBizDigitId(String bizDigitId) {
        this.bizDigitId = bizDigitId;
        return this;
    }
    public String getBizDigitId() {
        return this.bizDigitId;
    }

    public GetCardSmsDetailsRequest setBizSmsId(String bizSmsId) {
        this.bizSmsId = bizSmsId;
        return this;
    }
    public String getBizSmsId() {
        return this.bizSmsId;
    }

    public GetCardSmsDetailsRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public GetCardSmsDetailsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetCardSmsDetailsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetCardSmsDetailsRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public GetCardSmsDetailsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetCardSmsDetailsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetCardSmsDetailsRequest setSendDate(String sendDate) {
        this.sendDate = sendDate;
        return this;
    }
    public String getSendDate() {
        return this.sendDate;
    }

}
